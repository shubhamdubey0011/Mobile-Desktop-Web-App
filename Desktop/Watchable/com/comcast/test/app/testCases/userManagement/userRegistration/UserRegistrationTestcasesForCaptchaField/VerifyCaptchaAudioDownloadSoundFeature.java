package comcast.test.app.testCases.userManagement.userRegistration.UserRegistrationTestcasesForCaptchaField;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationValidationFuncitons;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/**
 * Class Name: VerifyCaptchaAudioDownloadSoundFeature Description: This test
 * case is to validate Audio download feature in Watchable application
 * **/

public class VerifyCaptchaAudioDownloadSoundFeature extends BaseTest {

	UserRegistrationValidationFuncitons userRegValidationFun = new UserRegistrationValidationFuncitons();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testVerifyCaptchaAudioDownloadSoundFeature() throws Exception {

		driver.get(DataServiceProperties.APPURL);

		try {
			driver.findElement(By.xpath(XpathObjectRepo.TOPMENUSIGNUP_XPATH))
					.click();

			// This method is used to verify Email field in registration page
			userRegValidationFun.validateUserRegistrationFields(driver,
					proUtil.getProperty("ZIP"),
					proUtil.getProperty("REG_PASSWORD"),
					proUtil.getProperty("REG_PASSWORD"));

			// Click on captcha audio icon
			driver.findElement(
					By.xpath(XpathObjectRepo.SIGNUPFORM_CAPTCHA_AUDIOBUTTN_XPATH))
					.click();

			// Click on Download sound link
			driver.findElement(
					By.xpath(XpathObjectRepo.SIGNUPFORM_CAPTCHA_DOWNLOADLINK_XPATH))
					.click();

			String parentWindow = driver.getWindowHandle();
			Set<String> handles = driver.getWindowHandles();

			for (String windowHandle : handles) {
				if (!windowHandle.equals(parentWindow)) {
					driver.switchTo().window(windowHandle);

					Thread.sleep(sleepTime);
					String Title = driver.getTitle();

					// assertEquals("audio.mp3",Title);

					driver.close(); // closing child window
					driver.switchTo().window(parentWindow); // cntrl to parent
															// window
				}
			}

			// This method asserts Home and My Channels inactive link when user
			// clicks on Bundle/Channel/Show.
			assertionFunction.assertAllInActiveLink();

			// This method asserts footer links.
			assertionFunction.assertFooterCopyRight();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}