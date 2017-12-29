package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestCasesForZipCode.UserRegWithInvalidZipCodeLength;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;

/**
 * Class Name: RegisterToWatchableByEnteringInValidZipLength Description: This
 * test case registers to Watchable application by entering invalid Zip code
 * length.
 * **/

public class RegisterToWatchableByEnteringInValidZipLength extends BaseTest {

	UserRegistrationValidationFuncitons userRegValidationFun = new UserRegistrationValidationFuncitons();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testRegisterToWatchableByEnteringInValidZipLength()
			throws Exception {

		driver.get(DataServiceProperties.APPURL);
		try {
			driver.findElement(By.xpath(XpathObjectRepo.TOPMENUSIGNUP_XPATH))
					.click();

			// This method is used to validate invalid zip code length.
			userRegValidationFun.validateUserRegistrationFields(driver,
					proUtil.getProperty("INVALID_ZIP_LENGTH"),
					proUtil.getProperty("REG_PASSWORD"),
					proUtil.getProperty("REG_PASSWORD"));

			driver.findElement(By.xpath(XpathObjectRepo.LOGINBUTTON_XPATH))
					.click();

			Thread.sleep(sleepTime);
			assertTrue(driver
					.findElement(
							By.xpath(XpathObjectRepo.ACCOUNT_ZIP_FLDVALIDATION_MSG_XPATH))
					.getText()
					.matches(UILablesRepo.SIGNUPPGE_ZIPCHARS_MINIMUMLEN_WARNMSG));

			// This method asserts Home and My Channels inactive link when user
			// clicks on Bundle/Channel/Show.
			assertionFunction.assertAllInActiveLink();

			// This method asserts Watchable Logo.
			assertionFunction.assertWatchableLogo();

			// This method is to assert Join Watchable Header in Sign Up page.
			assertionFunction.assertJoinWatchableBanner();

			// This method asserts footer links.
			assertionFunction.assertFooterCopyRight();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}
