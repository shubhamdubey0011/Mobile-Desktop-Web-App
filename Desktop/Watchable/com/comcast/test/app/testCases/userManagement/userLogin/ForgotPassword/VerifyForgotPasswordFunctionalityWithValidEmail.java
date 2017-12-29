package comcast.test.app.testCases.userManagement.userLogin.ForgotPassword;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.xml.sax.SAXException;

import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/**
 * Class Name: VerifyForgotPasswordFunctionalityWithValidEmail Description: This
 * test case is to verify Forgot Password functionality by providing valid
 * Email.
 **/

public class VerifyForgotPasswordFunctionalityWithValidEmail extends BaseTest {

	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();

	@Test
	public void testVerifyForgotPasswordFunctionalityWithValidEmail()
			throws InterruptedException, XPathExpressionException,
			ParserConfigurationException, SAXException, IOException {

		driver.get(DataServiceProperties.APPURL);
		try {
			assertionFunction.setOrProUtil(getOrProUtil());
			driver.findElement(
					By.xpath(XpathObjectRepo.FORGOT_PASSWD_LINK_XPATH)).click();

			// This method is to assert Join Watchable Header in Sign Up page.
			assertionFunction.assertJoinWatchableBanner();

			assertTrue(driver
					.findElement(
							By.xpath(XpathObjectRepo.FORGOT_PASSWD_EMAIL_HEADER_XPATH))
					.getText()
					.equalsIgnoreCase(UILablesRepo.FORGOT_PASSWD_EMAIL_HEADER));
			proUtil.load(new FileInputStream(new File("com/data.properties")));
			String Email = UILablesRepo.USERNAME;
			driver.findElement(
					By.xpath(XpathObjectRepo.FORGOT_PASSWD_EMAIL_XPATH))
					.sendKeys(Email);

			driver.findElement(By.xpath(XpathObjectRepo.LOGINBUTTON_XPATH))
					.click();
			Thread.sleep(sleepTime);

			// This method asserts Watchable Logo.
			assertionFunction.assertWatchableLogo();

			// Need to write code for opening provided web mail and copy
			// password and store in file.

			// This method asserts Footer Logo and It's Text.
			assertionFunction.assertFooterCategoryLinks();

			// This method asserts footer links.
			assertionFunction.assertFooterCopyRight();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}

	}

}