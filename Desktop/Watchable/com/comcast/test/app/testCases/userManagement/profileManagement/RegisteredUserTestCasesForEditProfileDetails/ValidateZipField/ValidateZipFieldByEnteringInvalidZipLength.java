package comcast.test.app.testCases.userManagement.profileManagement.RegisteredUserTestCasesForEditProfileDetails.ValidateZipField;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;

/**
 * Class Name: ValidateZipFieldByEnteringInvalidZipLength Description: This test
 * case validates Zip field by entering invalid zip length by logging registered
 * user into Watchable application.
 **/
// Refactoring done by Manoj

public class ValidateZipFieldByEnteringInvalidZipLength extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();

	@Test
	public void testValidateZipFieldByEnteringInvalidZipLength()
			throws Exception {

		try {
			/*
			 * This Method is to register new user using Watchable application
			 * and to change a password.
			 */
			RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

			int loginError = driver
					.findElements(
							By.xpath(XpathObjectRepo.SIGNUPPAGE_INCORRECT_CREDENTIALS_MSG_XPATH))
					.size();

			if (loginError == 0) {

				// This method asserts Home link ensure Home is Active page when
				// Login into Application.
				assertionFunction.assertHomeActiveLink();

				// This method is to navigate Profile Management Account details
				// page.
				Thread.sleep(sleepTime);
				userLogin.navigateToAccountDetailsPage(driver);

				// This method asserts Watchable Logo.
				assertionFunction.assertWatchableLogo();

				// This method is to assert Join Watchable Header in Sign Up
				// page.
				// assertionFunction.assertJoinGazeeboBanner(); - Functionality
				// not
				// present now

				/*
				 * driver.findElement(By.name("user[zip]")).clear();
				 * driver.findElement
				 * (By.name("user[zip]")).sendKeys(DataServiceProperties
				 * ._INVALID_ZIP_LENGTH);
				 */

				Thread.sleep(sleepTime);
				driver.findElement(
						By.xpath(XpathObjectRepo.MYACCOUNT_ZIP_TXT_XPATH))
						.clear();
				driver.findElement(
						By.xpath(XpathObjectRepo.MYACCOUNT_ZIP_TXT_XPATH))
						.sendKeys(DataServiceProperties._INVALID_ZIP_LENGTH);

				// Click on Save Profile
				// driver.findElement(By.name("commit")).click();
				driver.findElement(
						By.xpath(XpathObjectRepo.MYACCOUNT_SAVE_BTN_XPATH))
						.click();

				// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Please enter Zip code 5 characters long[\\s\\S]*$"));
				assertTrue(driver
						.findElement(
								By.xpath(XpathObjectRepo.MYACCOUNT_ZIP_ERROR_MSG_XPATH))
						.getText().matches(UILablesRepo.ZIP_ERROR_MESSAGE));

				// This method is used to logout from application.
				userLogin.LogOut(driver);
			}
			// This method is to ensure Login page is displayed when user Sign
			// Out from Application.
			// assertionFunction.assertLoginPageDetails();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}