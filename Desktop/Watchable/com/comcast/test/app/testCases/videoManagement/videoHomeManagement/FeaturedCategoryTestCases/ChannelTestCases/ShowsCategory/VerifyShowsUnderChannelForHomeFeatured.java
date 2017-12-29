package comcast.test.app.testCases.videoManagement.videoHomeManagement.FeaturedCategoryTestCases.ChannelTestCases.ShowsCategory;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.constant.XidioConstant;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;
import comcast.test.config.dataServices.vo.VideoDetails;

/**
 * Class Name: VerifyShowsUnderChannelForHomeFeatured Description: This test
 * case validates whether shows are displayed in channels page for the channel
 * present under Featured section in Home page by logging registered user into
 * Watchable application.
 * **/

public class VerifyShowsUnderChannelForHomeFeatured extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	HomePageCommonFunctions homePageCommonFun = new HomePageCommonFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testVerifyShowsUnderChannelForHomeFeatured() throws Exception {

		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.nHomeFeaturedAPI();
		List<VideoDetails> channelList = videoDetails
				.get("featuredChannelsList");
		List<VideoDetails> showListUnderChannel = videoDetails
				.get("showsUnderChannel");

		try {
			/*
			 * This Method is to register new user using Watchable application
			 * and to change a password.
			 */
			RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

			// This method is to ensure Home is Active page when Login into
			// Application.
			// assertionFunction.assertHomeActiveLink();

			// This method is to assert Watchable Top Middle Menu and to ensure
			// its collapsed.
			// assertionFunction.assertGazeeboTopMiddleMenu();

			// This method asserts featured title.
			assertionFunction.assertFeaturedTitle();

			if (channelList != null) {
				// This Method verifies Channel present in Featured list and
				// selects a Channel.
				homePageCommonFun.selectFeaturedChannel(channelList.get(
						XidioConstant.selectFeaturedChannel).getTitle());

				assertTrue(driver
						.findElement(By.cssSelector("BODY"))
						.getText()
						.matches(
								"^[\\s\\S]*"
										+ channelList
												.get(XidioConstant.selectFeaturedChannel)
												.getTitle() + "[\\s\\S]*$"));

				if (showListUnderChannel != null) {
					int loopMaxIndex = 0;
					if (showListUnderChannel.size() < 2)
						loopMaxIndex = showListUnderChannel.size();
					else
						loopMaxIndex = 2;
					for (int index = 0; index < loopMaxIndex; index++) {
						VideoDetails showList = showListUnderChannel.get(index);
						assertTrue(driver
								.findElement(By.cssSelector("BODY"))
								.getText()
								.matches(
										"^[\\s\\S]*" + showList.getTitle()
												+ "[\\s\\S]*$"));

						driver.navigate().back();
						Thread.sleep(sleepTime);
					}
				}
			} else {
				boolean isPresent;
				isPresent = driver
						.findElement(
								By.xpath(".//*[@id='featured']/div/section/div/div/ul[1]"))
						.findElements(
								By.xpath(".//*[@id='featured']/div/section/div/div/ul[1]/li[1]/article/a/div/div"))
						.size() > 0;
				if (isPresent == true) {
					String channelName = driver
							.findElement(
									By.xpath(".//*[@id='featured']/div/section/div/div/ul[1]"))
							.findElement(
									By.xpath(".//*[@id='featured']/div/section/div/div/ul[1]/li[1]/article/a/div/div"))
							.getText();
					assertFalse(driver.findElement(By.cssSelector("BODY"))
							.getText()
							.matches("^[\\s\\S]*" + channelName + "[\\s\\S]*$"));
				}
			}

			// This method is used to logout from Watchable Application.
			userLogin.LogOut(driver);

			// This method is to ensure Login page is displayed when user Sign
			// Out from Application.
			assertionFunction.assertLoginPageDetails();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}
