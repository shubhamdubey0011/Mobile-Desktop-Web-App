package comcast.test.app.testCases.userManagement.userRegistration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;
import comcast.test.config.configServices.utils.BaseTest;

/**
 * Class Name: RegisterToGazeeboByClickingOnJoinNowLink Description: This test
 * case validates user registration functionality in the Gazeebo application by
 * clicking on Join Now link.
 * **/

public class RegisterToGazeeboByClickingOnJoinNowLink extends BaseTest {

	UserRegistrationFunction userRegFun = new UserRegistrationFunction();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testRegisterToGazeeboByClickingOnJoinNowLink() throws Exception {

		driver.get(proUtil.getProperty("APPURL"));
		try {
			Thread.sleep(sleepTime);
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

			driver.findElement(By.linkText("Join Now")).click();

			// This method is to ensure Sign Up is Active page.
			assertionFunction.assertSignUpActiveLink();

			// This method is to assert Join Gazeebo Header in Sign Up page.
			// assertionFunction.assertJoinGazeeboBanner();

			// This method asserts Footer Copy Right Links.
			assertionFunction.assertFooterCopyRight();

			// This method asserts Footer Logo and It's Text.
			assertionFunction.assertFooterLogo();

			// This method is used to register new user into Gazeebo Application
			userRegFun.RegistrationDetails(driver, proUtil.getProperty("ZIP"),
					proUtil.getProperty("REG_PASSWORD"),
					proUtil.getProperty("REG_PASSWORD"));

			// Select terms and condition check box.
			userRegFun.termsAndConfitionChkBox();

			driver.findElement(By.id("user_login")).click();

			// This method is to ensure Home is Active page when Login into
			// Application.
			assertionFunction.assertHomeActiveLink();

			// This method asserts Gazeebo Logo.
			assertionFunction.assertWatchableLogo();

			// This method is to assert Gazeebo Top Middle Menu and to ensure
			// its collapsed.
			assertionFunction.assertGazeeboTopMiddleMenu();

			// This method asserts footer links.
			assertionFunction.assertFooterCopyRight();

			// This method is used to logout from application.
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