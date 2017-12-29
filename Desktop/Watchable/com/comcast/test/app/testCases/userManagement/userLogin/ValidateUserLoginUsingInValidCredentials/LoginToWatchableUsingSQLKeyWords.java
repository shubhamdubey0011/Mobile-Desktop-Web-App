package comcast.test.app.testCases.userManagement.userLogin.ValidateUserLoginUsingInValidCredentials;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userLogin.common.LoginFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/**
 * Class Name: LoginToGazeeboUsingSQLKeyWords Description: This test case is
 * used to login to Gazeebo application by entering username as SQL keywords and
 * valid password.
 * **/

public class LoginToWatchableUsingSQLKeyWords extends BaseTest {

	LoginFunctions loginFuntion = new LoginFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testLoginToWatchableUsingSQLKeyWords() throws Exception {

		driver.get(DataServiceProperties.APPURL);

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

		// This method is used to enter invalid UserName with valid Password
		loginFuntion.LoginToXidioApplication(driver,
				proUtil.getProperty("SQLKEY_USERNAME"),
				proUtil.getProperty("PASSWORD"));

		driver.findElement(By.id("user_login")).click();

		Thread.sleep(sleepTime);
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Incorrect email or password[\\s\\S]*$"));

		// This method is to assert Join Gazeebo Header in Sign Up page.

		// This method is to ensure Display of Login page.
		assertionFunction.assertLoginPageDetails();
	}
}