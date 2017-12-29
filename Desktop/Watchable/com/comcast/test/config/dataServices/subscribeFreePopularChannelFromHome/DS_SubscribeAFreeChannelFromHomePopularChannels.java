package comcast.test.config.dataServices.subscribeFreePopularChannelFromHome;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.subscriptionsPage.common.SubscriptionsPageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;
import comcast.test.config.dataServices.vo.VideoDetails;

public class DS_SubscribeAFreeChannelFromHomePopularChannels extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	UserLoginFunctions userLogin = new UserLoginFunctions();

	SubscriptionsPageCommonFunctions subscriptionsPageCommonFun = new SubscriptionsPageCommonFunctions();

	@Test
	public void RegisterAndSubscribeAFreeChannelFromHomePopularChannels()
			throws Exception {

		// Map<String, List<VideoDetails>>
		// videoDetails=RestAPIServices.HomePopularChannelDetailsAPIs();
		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.nPopularAPI();
		List<VideoDetails> showList = videoDetails.get("popularChannelsList");

		/*
		 * This Method is to register new user using Comcast application and to
		 * change a password.
		 */
		RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

		int loginError = driver
				.findElements(
						By.xpath(XpathObjectRepo.SIGNUPPAGE_INCORRECT_CREDENTIALS_MSG_XPATH))
				.size();

		if (loginError == 0) {

			Thread.sleep(sleepTime);
			driver.findElement(By.linkText(showList.get(0).getTitle())).click();

			Thread.sleep(sleepTime);
			assertTrue(driver
					.findElement(
							By.xpath(XpathObjectRepo.CHANNELDETAILSPAGETITLE_XPATH))
					.getText().matches(showList.get(0).getTitle()));

			// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Free[\\s\\S]*$"));

			/*
			 * if( driver.findElement(By.xpath(XpathObjectRepo.
			 * CHANNELFOLLOWNOWIMAGE_XPATH )).isDisplayed()){
			 * driver.findElement(
			 * By.xpath(XpathObjectRepo.CHANNELFOLLOWNOWIMAGE_XPATH )).click();
			 * }
			 */

			boolean isFollowNowPresent = false;
			// Verify for the Channel subscription by checking the
			// "Follow Now" Button
			try {
				driver.findElement(By
						.xpath(XpathObjectRepo.CHANNELFOLLOWNOWIMAGE_XPATH));
				isFollowNowPresent = true;
			} catch (NoSuchElementException nse) {
				System.out.println("In exception");
			}
			// click on the "Follow Now" button if present else go back to
			// Home Page
			if (isFollowNowPresent) {
				driver.findElement(
						By.xpath(XpathObjectRepo.CHANNELFOLLOWNOWIMAGE_XPATH))
						.click();

			}

			// driver.findElement(By.cssSelector("fieldset > input[type=\"submit\"]")).click();

			Thread.sleep(sleepTime);
			// assertEquals("You have been subscribed.",
			// driver.findElement(By.xpath(".//*[@id='cluetip']/div[1]/div/div[2]/div")).getText());

			// This method is used to logout from Gazeebo Application.
			userLogin.LogOut(driver);
		}
	}
}