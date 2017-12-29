package comcast.test.app.testCases.signUp;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.commonFunctions.CommonFun;
import comcast.test.app.testCases.signUp.signUpFunctions.SignUpFun;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/**
 * Class Name: RegisterToWatchableByEnteringNonCapitalLetterPassword
 * Description: This test case try registers to Watchable application entering
 * non capital letter password. 
 * Author: Manoj
 * **/

public class RegisterToWatchableByEnteringNonCapitalLetterPassword extends
		BaseTest {

	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testRegisterToWatchableByEnteringNonCapitalLetterPassword()
			throws Exception {

		try {

			log.info("Script: RegisterToWatchableByEnteringNonCapitalLetterPassword");
			log.info("*************************************************************");

			// Navigate to the Home page of the application
			driver.get(DataServiceProperties.HOMEAPPURL);

			// Verify application is opened successfully.
			AssertionRepoFunctions.assertWatchableTitle();
			log.info("Successfully opened the application");

			// Click on Sign UP button from header menu
			SignUpFun.clickOnSignUpButton();

			// Verify sign up form opened successfully
			assertTrue(
					"Sign Up form is not opened",
					CommonFun.isElementPresent(driver,
							By.xpath(XpathObjectRepo.signUpForm_XPATH)));
			log.info("Sign Up form opened successfully");

			// Enter Sign Up details
			SignUpFun.enterSignUpDetails(driver, UILablesRepo.NEWUSERNAME,
					UILablesRepo.NEWUSER,
					UILablesRepo.NONCAPITAL_LETTER_PASSWORD);

			// Select Terms And conditions check box
			SignUpFun.selectTermsConditionsCheck();

			// click on SIGN UP button entering non capital letter
			// password.
			SignUpFun.clickOnSignUpFormButton();

			// Verify Password error message
			/*
			 * assertTrue( "Password Error Message is not displayed",
			 * CommonFun.isElementPresent( driver,
			 * By.xpath(XpathObjectRepo.signUpFormPasswordError_XPATH)));
			 * log.info("Password Error Message '" + driver.findElement(
			 * By.xpath(XpathObjectRepo.signUpFormPasswordError_XPATH))
			 * .getText() + "' is displayed");
			 */
			log.info("As per the business requirement, Password is now accepting without Upper Case letter");
			if (driver.findElements(
					By.xpath(XpathObjectRepo.signUpFormCaptchaImage_XPATH))
					.size() > 0) {
				if (driver.findElement(
						By.xpath(XpathObjectRepo.signUpFormCaptchaImage_XPATH))
						.isDisplayed() == true) {

					// Close the Sign Up form
					SignUpFun.clickOnSignUpFormCloseIcon();

					// Verify Sign Up form is closed successfully
					assertFalse(
							"Sign Up Form is not closed",
							driver.findElement(
									By.xpath(XpathObjectRepo.signUpForm_XPATH))
									.isDisplayed());
					log.info("Sign Up form is closed");
				}
			}

			log.info("");

		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}