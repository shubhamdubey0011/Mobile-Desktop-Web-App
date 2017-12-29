package comcast.test.config.dataServices.userRegistration;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.userManagement.userRegistration.common.UserRegistrationFunction;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/**
 * Class Name: UserRegistrationUsingComcast Description: This DataService
 * Registers new user using Comcast application
 * 
 * @param <driver>: Native browser driver
 **/

public class UserRegistrationUsingComcast extends BaseTest {

	UserRegistrationFunction userRegFun = new UserRegistrationFunction();
	UserLoginFunctions userLogin = new UserLoginFunctions();

	@Test
	public void testUserRegistrationUsingComcast(WebDriver driver)
			throws Exception {
		driver.get(DataServiceProperties.APPURL);
		proUtil.load(new FileInputStream(new File("com/data.properties")));

		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Log In[\\s\\S]*$"));

		driver.findElement(By.linkText("Sign Up")).click();

		// This method is user to enter registration fields details
		userRegFun.RegistrationDetails(driver, proUtil.getProperty("ZIP"),
				proUtil.getProperty("REG_PASSWORD"),
				proUtil.getProperty("REG_PASSWORD"));

		// Select terms and condition check box.
		driver.findElement(
				By.xpath("//*[@id='step-0']/fieldset[4]/div[1]/label")).click();

		driver.findElement(By.id("user_login")).click();

		// This method is used to logout from application.
		userLogin.LogOut(driver);
	}
}
