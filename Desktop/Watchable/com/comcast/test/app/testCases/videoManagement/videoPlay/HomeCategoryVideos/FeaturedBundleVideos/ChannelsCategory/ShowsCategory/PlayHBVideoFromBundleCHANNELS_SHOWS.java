package comcast.test.app.testCases.videoManagement.videoPlay.HomeCategoryVideos.FeaturedBundleVideos.ChannelsCategory.ShowsCategory;

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
 * Class Name: PlayHBVideoFromBundleCHANNELS_SHOWS Description: This test case
 * is to play video for a Show displayed under 'Store' bundle > CHANNELS > SHOWS
 * for 'Featured' section on 'Home' screen by logging into Gazeebo application.
 */

public class PlayHBVideoFromBundleCHANNELS_SHOWS extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	HomePageCommonFunctions homePageCommonFun = new HomePageCommonFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testPlayHBVideoFromBundleCHANNELS_SHOWS() throws Exception {

		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.FeaturedBundleAPI();
		List<VideoDetails> BundlesList = videoDetails.get("bundlesList");
		List<VideoDetails> BundlesChannelList = videoDetails
				.get("showsInBundle");
		List<VideoDetails> ShowsListUnderBundleSHOWS = videoDetails
				.get("subShowInBundleChannel");
		List<VideoDetails> VideoListUnderBundleRows = videoDetails
				.get("videosInBundleChannel");

		try {
			/*
			 * This Method is to register new user using Gazeebo application and
			 * to change a password.
			 */
			RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

			// This method is to ensure Home is Active page when Login into
			// Application.
			assertionFunction.assertHomeActiveLink();

			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Featured[\\s\\S]*$"));

			// This Method verifies bundle present in Featured list and selects
			// a bundle.
			homePageCommonFun.selectBundle();

			assertTrue(driver
					.findElement(By.cssSelector("BODY"))
					.getText()
					.matches(
							"^[\\s\\S]*"
									+ BundlesList.get(
											XidioConstant.selectBundle)
											.getTitle() + "[\\s\\S]*$"));

			driver.findElement(By.linkText("CHANNELS")).click();

			Thread.sleep(sleepTime);
			driver.findElement(
					By.linkText(BundlesChannelList.get(
							XidioConstant.selectBundleChannel).getTitle()))
					.click();

			Thread.sleep(sleepTime);
			assertTrue(driver
					.findElement(By.cssSelector("BODY"))
					.getText()
					.matches(
							"^[\\s\\S]*"
									+ BundlesChannelList.get(
											XidioConstant.selectBundleChannel)
											.getTitle() + "[\\s\\S]*$"));

			driver.findElement(By.linkText("SHOWS")).click();

			Thread.sleep(sleepTime);
			driver.findElement(
					By.linkText(ShowsListUnderBundleSHOWS.get(
							XidioConstant.selectShow).getTitle())).click();

			// This is to assert Show Name.
			assertTrue(driver
					.findElement(By.cssSelector("BODY"))
					.getText()
					.matches(
							"^[\\s\\S]*"
									+ ShowsListUnderBundleSHOWS.get(
											XidioConstant.selectShow)
											.getTitle() + "[\\s\\S]*$"));

			Thread.sleep(sleepTime);
			// This is to assert Video Name.
			assertTrue(driver
					.findElement(By.cssSelector("BODY"))
					.getText()
					.matches(
							"^[\\s\\S]*"
									+ VideoListUnderBundleRows.get(
											XidioConstant.selectVideo)
											.getTitle() + "[\\s\\S]*$"));

			driver.findElement(
					By.linkText(VideoListUnderBundleRows.get(
							XidioConstant.selectVideo).getTitle())).click();

			Thread.sleep(10000);
			assertTrue(driver
					.findElement(By.cssSelector("BODY"))
					.getText()
					.matches(
							"^[\\s\\S]*"
									+ VideoListUnderBundleRows.get(
											XidioConstant.selectVideo)
											.getTitle() + "[\\s\\S]*$"));

			// This method asserts Home and Subscriptions inactive link when
			// user clicks on Bundle/Channel/Show.
			assertionFunction.assertAllInActiveLink();

			Thread.sleep(sleepTime);
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Up Next[\\s\\S]*$"));

			// This method asserts Footer Logo and It's Text.
			assertionFunction.assertFooterLogo();

			// This method asserts Footer Copy Right Links.
			assertionFunction.assertFooterCopyRight();

			Thread.sleep(sleepTimeForVideoPlay);
			// This method is used to logout from Gazeebo Application.
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
