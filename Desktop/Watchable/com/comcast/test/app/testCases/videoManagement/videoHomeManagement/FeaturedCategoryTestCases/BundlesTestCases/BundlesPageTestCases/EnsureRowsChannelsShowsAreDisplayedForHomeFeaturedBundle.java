package comcast.test.app.testCases.videoManagement.videoHomeManagement.FeaturedCategoryTestCases.BundlesTestCases.BundlesPageTestCases;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;

/**
 * Class Name: EnsureRowsChannelsShowsAreDisplayedForHomeFeaturedBundle
 * Description: This test case is to verify and ensure if 'Rows','Channels' and
 * 'Shows' links are present for a Bundle displayed under 'Featured' section on
 * 'Home' screen by logging into Gazeebo application with registered user.
 */

public class EnsureRowsChannelsShowsAreDisplayedForHomeFeaturedBundle extends
		BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	HomePageCommonFunctions homePageCommonFun = new HomePageCommonFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testEnsureRowsChannelsShowsAreDisplayedForHomeBundle()
			throws Exception {

		try {
			/*
			 * This Method is to register new user using Gazeebo application and
			 * to change a password.
			 */
			RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

			// This method is ensure Home is Active page when Login into
			// Application.
			assertionFunction.assertHomeActiveLink();

			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Featured[\\s\\S]*$"));

			// This Method verifies bundle present in Featured list and selects
			// a bundle.
			homePageCommonFun.selectBundle();

			Thread.sleep(sleepTime);
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*CHANNELS[\\s\\S]*$"));

			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*CATEGORIES[\\s\\S]*$"));

			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*UNWATCHED[\\s\\S]*$"));

			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*LAST UPDATED[\\s\\S]*$"));

			Thread.sleep(sleepTime);
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
