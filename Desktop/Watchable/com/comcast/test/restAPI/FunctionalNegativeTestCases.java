package comcast.test.restAPI;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.userManagement.userLogin.common.LoginFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

public class FunctionalNegativeTestCases extends BaseTest {
	LoginFunctions loginFuntion = new LoginFunctions();

	@Test
	public void testLoginToXidioApplicationUsingInValidUName() throws Exception {
		driver.get(DataServiceProperties.APPURL);

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

		// This method is used to enter invalid UserName with valid Password
		loginFuntion.LoginToXidioApplication(driver,
				DataServiceProperties._INVALID_USER_NAME,
				DataServiceProperties._PASSWORD);
		driver.findElement(By.id("user_login")).click();

		Thread.sleep(sleepTime);
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Incorrect username or password[\\s\\S]*$"));

		/* testLoginToXidioApplicationUsingInValidPassword */

		driver.get(DataServiceProperties.APPURL);

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

		// This method is used to enter invalid password with valid UserName
		loginFuntion.LoginToXidioApplication(driver,
				DataServiceProperties._USER_NAME,
				DataServiceProperties._INVALID_PASSWORD);

		driver.findElement(By.id("user_login")).click();

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Incorrect username or password[\\s\\S]*$"));

		/* testLoginToXidioApplicationWithInValidCredentials */

		driver.get(DataServiceProperties.APPURL);

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

		// This method is used to enter invalid UserName and Password
		loginFuntion.LoginToXidioApplication(driver,
				DataServiceProperties._INVALID_USER_NAME,
				DataServiceProperties._INVALID_PASSWORD);

		driver.findElement(By.id("user_login")).click();

		Thread.sleep(sleepTime);
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Incorrect username or password[\\s\\S]*$"));

		/* testLoginToXidioApplicationUsingInValidUName */

		driver.get(DataServiceProperties.APPURL);

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

		// This method is used to enter invalid UserName with valid Password
		loginFuntion.LoginToXidioApplication(driver,
				DataServiceProperties._DIGIT_USERNAME,
				DataServiceProperties._PASSWORD);

		driver.findElement(By.id("user_login")).click();

		Thread.sleep(sleepTime);
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Incorrect username or password[\\s\\S]*$"));

		/* testLoginToXidioApplicationUsingInValidUName */

		driver.get(DataServiceProperties.APPURL);

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

		// This method is used to enter invalid UserName with valid Password
		loginFuntion.LoginToXidioApplication(driver,
				DataServiceProperties._JS_USERNAME,
				DataServiceProperties._PASSWORD);

		driver.findElement(By.id("user_login")).click();

		Thread.sleep(sleepTime);
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Incorrect username or password[\\s\\S]*$"));

		/* testLoginToXidioApplicationUsingInValidUName */

		driver.get(DataServiceProperties.APPURL);

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

		// This method is used to enter invalid UserName with valid Password
		loginFuntion.LoginToXidioApplication(driver,
				DataServiceProperties._SPL_USERNAME,
				DataServiceProperties._PASSWORD);

		driver.findElement(By.id("user_login")).click();

		Thread.sleep(sleepTime);
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Incorrect username or password[\\s\\S]*$"));

		/* testLoginToXidioApplicationUsingInValidUName */

		driver.get(DataServiceProperties.APPURL);

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

		// This method is used to enter invalid UserName with valid Password
		loginFuntion.LoginToXidioApplication(driver,
				DataServiceProperties._SQLKEY_USERNAME,
				DataServiceProperties._PASSWORD);

		driver.findElement(By.id("user_login")).click();

		Thread.sleep(sleepTime);
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Incorrect username or password[\\s\\S]*$"));

		/* testLoginToXidioApplicationUsingInValidUName */

		driver.get(DataServiceProperties.APPURL);

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

		// This method is used to enter invalid UserName with valid Password
		loginFuntion.LoginToXidioApplication(driver,
				DataServiceProperties._SQLSTMT_USERNAME,
				DataServiceProperties._PASSWORD);

		driver.findElement(By.id("user_login")).click();

		Thread.sleep(sleepTime);
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Incorrect username or password[\\s\\S]*$"));
	}
}