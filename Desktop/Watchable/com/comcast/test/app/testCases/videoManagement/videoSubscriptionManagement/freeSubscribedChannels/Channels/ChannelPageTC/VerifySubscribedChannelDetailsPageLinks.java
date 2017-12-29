package comcast.test.app.testCases.videoManagement.videoSubscriptionManagement.freeSubscribedChannels.Channels.ChannelPageTC;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.subscriptionsPage.common.SubscriptionsPageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.subscribeFreeFeaturedChannelFromHome.DS_SubscribeAFreeChannelFromHomeFeatured;
import comcast.test.config.dataServices.vo.VideoDetails;

/**
 * Class Name: VerifyMyChannelsPageLinks Description: This test case is to
 * verify and ensure if CHANNELS AND CATEGORIES links are displayed for a
 * subscribed channel by logging into Watchable application.
 */

public class VerifySubscribedChannelDetailsPageLinks extends BaseTest {

	// DS_SubscribeAFreeChannelFromHomeFeatured subscribeFreeHomeChannel=new
	// DS_SubscribeAFreeChannelFromHomeFeatured();
	// DS_SubscribeAFreeChannelFromHomePopularChannels
	// subscribeFreeHomePopularChannel = new
	// DS_SubscribeAFreeChannelFromHomePopularChannels();
	DS_SubscribeAFreeChannelFromHomeFeatured subscribeFreeHomeFeatured = new DS_SubscribeAFreeChannelFromHomeFeatured();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	SubscriptionsPageCommonFunctions subscriptionsPageCommonFun = new SubscriptionsPageCommonFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();
	String pageTitle = "";

	@Test
	public void testVerifyMyChannelsPageLinks() throws Exception {

		try {
			/*
			 * This Method is to register new user using Watchable application
			 * and to change a password.
			 */
			// subscribeFreeHomeChannel.RegisterAndSubscribeAFreeChannelHomeFeatured();

			subscribeFreeHomeFeatured
					.RegisterAndSubscribeAFreeChannelHomeFeatured();
			pageTitle = driver.getTitle();
			Thread.sleep(sleepTime);

			if (pageTitle.contains(UILablesRepo.HOMEPAGE_TITLE)) {
				log.info("Successfully Opened the application");

				driver.findElement(By.xpath(XpathObjectRepo.WATCHABLE_LOGO))
						.click();
				// This Method is used to enter user name and password
				// credentials
				// driver.findElement(By.linkText("LOG IN")).click();
				driver.findElement(By.xpath(XpathObjectRepo.TOPMENULOGIN_XPATH))
						.click();

				userLogin.UserLoginCredentials(driver);

				// driver.findElement(By.id("user_login")).click();
				driver.findElement(By.xpath(XpathObjectRepo.LOGINBUTTON_XPATH))
						.click();
				Thread.sleep(sleepTime);

				int loginError = driver
						.findElements(
								By.xpath(XpathObjectRepo.SIGNUPPAGE_INCORRECT_CREDENTIALS_MSG_XPATH))
						.size();

				if (loginError == 0) {

					Map<String, List<VideoDetails>> videoDetails = RestAPIServices
							.SubscriptionsAPI();
					List<VideoDetails> channelList = videoDetails
							.get("subscribedChannelsList");

					// This method is to navigate My Channels Page.
					subscriptionsPageCommonFun.navigateToMyChannelsPage();

					// This method is to ensure My Channels is Active page when
					// Login
					// into Application.
					assertionFunction.assertMyChannelsActiveLink();

					// This method asserts Watchable Logo.
					assertionFunction.assertWatchableLogo();

					if (channelList != null) {
						int loopIndexMax = 0;
						if (channelList.size() < 2)
							loopIndexMax = channelList.size();
						else
							loopIndexMax = 2;

						for (int index = 0; index < loopIndexMax; index++) {
							VideoDetails channelDetails = channelList
									.get(index);
							driver.findElement(
									By.linkText(channelDetails.getTitle()))
									.click();

							// This method asserts SHOWS active link.
							assertionFunction.assertActiveSHOWSLink();

							// This method asserts SHOWS, UNWATCHED and LAST
							// UPDATED
							// links.
							assertionFunction.assertChannelDetailsPageLinks();

							driver.navigate().back();
							Thread.sleep(sleepTime);
						}
					}

					// This method unsubscribe a subscribed channels.
					subscriptionsPageCommonFun.unSubscribeASubscribedChannels();

					Thread.sleep(sleepTime);
					// This method is used to logout from Watchable Application.
					userLogin.LogOut(driver);
				}
			}
			// This method is to ensure Login page is displayed when user Sign
			// Out from Application.
			// assertionFunction.assertLoginPageDetails();
		} catch (Throwable t) {
			{
				if (pageTitle.contains(UILablesRepo.HOMEPAGE_TITLE)) {
					captureScreenshot();
					collector.addError(t);
				}
			}
		}
	}
}
