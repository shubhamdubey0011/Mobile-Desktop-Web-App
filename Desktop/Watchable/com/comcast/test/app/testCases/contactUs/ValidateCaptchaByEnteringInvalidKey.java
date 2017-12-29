package comcast.test.app.testCases.contactUs;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.commonFunctions.CommonFun;
import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.app.testCases.contactUs.contactUsFunctions.ContactUsFun;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/**
 * Class Name: ValidateCaptchaByEnteringInvalidKey Description: This test case
 * is try to register to Watchable application validated captcha value by
 * entering wrong value. 
 * Author: Manoj
 * **/

public class ValidateCaptchaByEnteringInvalidKey extends BaseTest {
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testValidateCaptchaByEnteringInvalidKey() throws Exception {

		try {

			log.info("Script: ValidateCaptchaByEnteringInvalidKey");
			log.info("********************************************");

			// Navigate to the Home page of the application
			driver.get(DataServiceProperties.HOMEAPPURL);

			// Verify application is opened successfully.
			AssertionRepoFunctions.assertWatchableTitle();
			log.info("Successfully opened the application");

			// Scroll to Footer
			HomePageCommonFunctions.scrollToFooterSection();
			Thread.sleep(sleepTime);

			// Click on Contact Us link from footer
			ContactUsFun.clickOnContactUsLink();

			// Verify Contact Us form opened successfully
			assertTrue(
					"Contact Us form is not opened",
					CommonFun.isElementPresent(driver,
							By.xpath(XpathObjectRepo.contactUsForm_XPATH)));
			log.info("Contact Us form opened successfully");

			// select reason from reason list
			ContactUsFun.selectReason();

			// Enter details in contact us form
			ContactUsFun.enterContachUsDetails(driver,
					UILablesRepo.CONATCT_REASON, UILablesRepo.EMAIL);

			// Click on Submit button by keeping all fields blank
			ContactUsFun.clickOnSubmitButton();
			/*
			 * // Verify captcha error message // assertTrue( //
			 * "Captcha Error Message is not displayed", //
			 * CommonFun.isElementPresent( // driver, //
			 * By.id(XpathObjectRepo.contactUsFormInvalidCaptchaError_ID)));
			 */
			log.info("Captcha Error Message '"
					+ driver.findElement(
							By.xpath(XpathObjectRepo.contactUsFormCaptchaError_XPATH))
							.getText() + "' is displayed");

			if (driver.findElements(
					By.xpath(XpathObjectRepo.contactUsFormCaptchaImage_XPATH))
					.size() > 0) {

				if (driver
						.findElement(
								By.xpath(XpathObjectRepo.contactUsFormCaptchaImage_XPATH))
						.isDisplayed() == true) {

					// Close the Contact Us form
					ContactUsFun.clickOnContactUsFormCloseIcon();

					// Verify Contact Us form is closed successfully
					assertFalse(
							"Contact Us Form is not closed",
							driver.findElement(
									By.xpath(XpathObjectRepo.contactUsForm_XPATH))
									.isDisplayed());
					log.info("Contact Us form is closed");
				}
			}

			log.info("");

		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}

}