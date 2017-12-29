package comcast.test.app.testCases.videoManagement.videoHomeManagement.FeaturedCategoryTestCases.BundlesTestCases.ChannelsCategory.RowsCategory;

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
 * Class Name: VerifyVideosByClickingOnShowInStoreBundleCHANNELS_ROWS
 * Description: This test case is to verify Videos by clicking on Show in Bundle
 * > CHANNEL > ROWS for a Bundle displayed under 'Featured' section on 'Home'
 * screen by logging into Comcast application.
 */

public class VerifyVideosByClickingOnShowInHomeBundleCHANNELS_ROWS extends
		BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	HomePageCommonFunctions homePageCommonFun = new HomePageCommonFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testVerifyVideosByClickingOnShowInHomeBundleCHANNELS_ROWS()
			throws Exception {

		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.FeaturedBundleAPI();
		List<VideoDetails> BundlesList = videoDetails.get("bundlesList");
		List<VideoDetails> BundlesChannelList = videoDetails
				.get("showsInBundle");
		List<VideoDetails> ShowsListUnderBundleRows = videoDetails
				.get("subShowInBundleChannel");
		List<VideoDetails> VideoListUnderBundleRows = videoDetails
				.get("videosInBundleChannel");

		try {
			/*
			 * This Method is to register new user using Comcast application and
			 * to change a password.
			 */
			RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

			// This method is ensure Home is Active page when Login into
			// Application.
			assertionFunction.assertHomeActiveLink();

			Thread.sleep(sleepTime);
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

			driver.findElement(By.linkText("ROWS")).click();

			Thread.sleep(sleepTime);
			driver.findElement(
					By.linkText(ShowsListUnderBundleRows.get(
							XidioConstant.selectShow).getTitle())).click();

			// This is to assert Show Name.
			assertTrue(driver
					.findElement(By.cssSelector("BODY"))
					.getText()
					.matches(
							"^[\\s\\S]*"
									+ ShowsListUnderBundleRows.get(
											XidioConstant.selectShow)
											.getTitle() + "[\\s\\S]*$"));

			// This is to assert Video Name.
			assertTrue(driver
					.findElement(By.cssSelector("BODY"))
					.getText()
					.matches(
							"^[\\s\\S]*"
									+ VideoListUnderBundleRows.get(
											XidioConstant.selectVideo)
											.getTitle() + "[\\s\\S]*$"));

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