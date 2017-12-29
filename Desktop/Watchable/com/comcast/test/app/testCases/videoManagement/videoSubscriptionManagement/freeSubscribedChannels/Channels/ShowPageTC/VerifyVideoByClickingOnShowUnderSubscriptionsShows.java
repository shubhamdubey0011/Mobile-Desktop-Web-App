package comcast.test.app.testCases.videoManagement.videoSubscriptionManagement.freeSubscribedChannels.Channels.ShowPageTC;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.subscriptionsPage.common.SubscriptionsPageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.subscribeFreeFeaturedChannelFromHome.DS_SubscribeAFreeChannelFromHomeFeatured;
import comcast.test.config.dataServices.vo.VideoDetails;

/**
 * Class Name: VerifyVideoByClickingOnShowUnderSubscriptionsShows Description:
 * This test case is to verify if the videos are available on 'shows' page after
 * sorting by 'UNWATCHED' category for a subscribed channel by logging into
 * Watchable application.
 */

public class VerifyVideoByClickingOnShowUnderSubscriptionsShows extends
		BaseTest {

	DS_SubscribeAFreeChannelFromHomeFeatured subscribeFreeHomeChannel = new DS_SubscribeAFreeChannelFromHomeFeatured();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();
	SubscriptionsPageCommonFunctions subscriptionsPageCommonFun = new SubscriptionsPageCommonFunctions();

	@Test
	public void testVerifyVideoByClickingOnShowUnderSubscriptionsShows()
			throws Exception {

		try {
			/*
			 * This Method is to register new user using Watchable application
			 * and to change a password.
			 */
			subscribeFreeHomeChannel
					.RegisterAndSubscribeAFreeChannelHomeFeatured();

			driver.findElement(By.xpath(XpathObjectRepo.WATCHABLE_LOGO))
					.click();

			Thread.sleep(sleepTime);
			// driver.findElement(By.linkText("Log In")).click();
			driver.findElement(By.xpath(XpathObjectRepo.TOPMENULOGIN_XPATH))
					.click();

			// This Method is used to enter user name and password credentials
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
						.subscribedChannelDetails();
				List<VideoDetails> subscribedChannels = videoDetails
						.get("subscribedChannels");
				List<VideoDetails> subscribedChannelsShows = videoDetails
						.get("subscribedShowsUnderChannel");
				List<VideoDetails> subscribedChannelsVideos = videoDetails
						.get("subscribedVideo");

				// Additional action added to pass below assertion
				/*
				 * driver.findElement(
				 * By.xpath(XpathObjectRepo.TOP_MENU_HOME_BUTTON_XPATH
				 * )).click();
				 * 
				 * // This method is to ensure Home is Active page when Login
				 * into // Application.
				 * assertionFunction.assertHomeActiveLink();
				 */

				// This method is to navigate My Channels Page.
				subscriptionsPageCommonFun.navigateToMyChannelsPage();

				// This method is to ensure My Channels is Active page when
				// Login
				// into Application.
				assertionFunction.assertMyChannelsActiveLink();

				if (subscribedChannels != null) {
					int loopIndexMax = 0;
					if (subscribedChannels.size() < 4) {
						loopIndexMax = subscribedChannels.size();
					} else {
						loopIndexMax = 4;
					}

					for (int index = 0; index < loopIndexMax - 1; index++) {
						VideoDetails channelDetails = subscribedChannels
								.get(index);
						// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*"+channelDetails.getTitle()+"[\\s\\S]*$"));
						assertTrue(driver
								.findElement(
										By.xpath(XpathObjectRepo.MYCHANNEL_SUBSCRIBEDCHANNELS_XPATH))
								.getText().contains(channelDetails.getTitle()));
						driver.findElement(
								By.linkText(channelDetails.getTitle())).click();

						Thread.sleep(sleepTime);
						// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*"+channelDetails.getTitle()+"[\\s\\S]*$"));
						assertTrue(driver
								.findElement(
										By.xpath(XpathObjectRepo.CHANNELDETAILCHANNELTITLE_XPATH))
								.getText().contains(channelDetails.getTitle()));

						if (subscribedChannelsShows != null) {
							int showloopIndexMax = 0;
							if (subscribedChannelsShows.size() < 4)
								showloopIndexMax = subscribedChannelsShows
										.size();
							else
								showloopIndexMax = 4;
							for (int shows = 0; shows < showloopIndexMax; shows++) {
								VideoDetails showList = subscribedChannelsShows
										.get(showloopIndexMax - 1);
								// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*"+showList.getTitle()+"[\\s\\S]*$"));
								assertTrue(driver
										.findElement(
												By.xpath(XpathObjectRepo.SHOWDETAILSHOWLIST_XPATH))
										.getText()
										.contains(showList.getTitle()));

								boolean isShowPresent = false;

								try {
									driver.findElement(By.linkText(showList
											.getTitle()));

									isShowPresent = true;
								} catch (NoSuchElementException nse) {
									System.out.println("Show not present");
								}
								// click on the "Follow Now" button if present
								// else
								// go back to
								// Home Page
								if (isShowPresent) {
									driver.findElement(
											By.linkText(showList.getTitle()))
											.click();
									break;
								}

								// driver.findElement(By.linkText(showList.getTitle())).click();

								int episodeloopIndexMax = 0;
								if (subscribedChannelsVideos.size() < 4)
									episodeloopIndexMax = subscribedChannelsVideos
											.size();
								else
									episodeloopIndexMax = 4;

								for (int videos = 0; videos < episodeloopIndexMax; videos++) {
									VideoDetails videosList = subscribedChannelsShows
											.get(showloopIndexMax - 1);
									// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*"+videosList.getTitle()+"[\\s\\S]*$"));
									assertTrue(driver
											.findElement(
													By.xpath(XpathObjectRepo.SHOWDETAILVIDEOLIST_XPATH))
											.getText()
											.contains(videosList.getTitle()));
								}
							}
						}

						driver.navigate().back();
						break;
					}
				}

				// This method asserts Footer Logo and It's Text.
				assertionFunction.assertFooterLogo();

				// This method asserts Footer Copy Right Links.
				assertionFunction.assertFooterCopyRight();

				// This method unsubscribe a subscribed channels.
				subscriptionsPageCommonFun.unSubscribeASubscribedChannels();

				// This method is used to logout from Watchable Application.
				userLogin.LogOut(driver);
			}
			// This method is to ensure Login page is displayed when user Sign
			// Out from Application.
			assertionFunction.assertLoginPageDetails();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}