package comcast.test.config.dataServices.subscribeFreeFeaturedChannelFromStore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.constant.XidioConstant;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;
import comcast.test.config.dataServices.vo.VideoDetails;

public class DS_SubscribeAFreeChannelFromStoreFeatured extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();

	@Test
	public void RegisterAndSubscribeAFreeChannelStoreFeatured()
			throws Exception {

		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.HomeFeaturedAPI();
		List<VideoDetails> showList = videoDetails.get("show");

		// Below line is added for temporary.
		driver.get(DataServiceProperties.APPURL);

		/*
		 * This Method is to register new user using Comcast application and to
		 * change a password.
		 */

		RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

		driver.findElement(By.linkText("STORE")).click();

		Thread.sleep(sleepTime);
		driver.findElement(
				By.linkText(showList.get(XidioConstant.selectFeaturedChannel)
						.getTitle())).click();

		Thread.sleep(sleepTime);
		assertTrue(driver
				.findElement(By.cssSelector("BODY"))
				.getText()
				.matches(
						"^[\\s\\S]*"
								+ showList.get(
										XidioConstant.selectFeaturedChannel)
										.getTitle() + "[\\s\\S]*$"));

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Free[\\s\\S]*$"));

		driver.findElement(
				By.xpath("//*[@id='content-wrap']/article/div/div[1]/div/span[2]/a/img"))
				.click();

		driver.findElement(
				By.xpath("//*[@id='cluetip']/div[1]/div/div[2]/form/fieldset/input"))
				.click();

		Thread.sleep(sleepTime);
		assertEquals(
				"You have been subscribed.",
				driver.findElement(
						By.xpath(".//*[@id='cluetip']/div[1]/div/div[2]/div"))
						.getText());

		Thread.sleep(sleepTime);
		// This method is used to logout from Gazeebo Application.
		userLogin.LogOut(driver);
	}
}
