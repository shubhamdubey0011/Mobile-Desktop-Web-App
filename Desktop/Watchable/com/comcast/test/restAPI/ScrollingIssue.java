package comcast.test.restAPI;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ScrollingIssue {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://www.projecthelen.net:3000/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testPl() throws Exception {
		driver.get(baseUrl + "/login");
		driver.findElement(By.id("login_username")).clear();
		driver.findElement(By.id("login_username")).sendKeys("test_360");
		driver.findElement(By.name("user[password]")).clear();
		driver.findElement(By.name("user[password]")).sendKeys("Demo1111");
		driver.findElement(By.id("user_login")).click();
		assertEquals(
				"Popular Shows",
				driver.findElement(
						By.cssSelector("#popular_shows > div.row > section.view-row > header > h1"))
						.getText());
		// driver.findElement(By.cssSelector("#popular_shows > div.row > section.view-row > div.caroufredsel_wrapper > div.slider > ul > li.cell.cell-show > article > h1 > a")).click();
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("(//a[contains(text(),'Abraham Lincoln Vampire Hunter')])[2]"))
				.click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Beyonce')])[2]"))
				.click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Brave')])[3]"))
				.click();
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Cookie Jar')])[4]"))
				.click();
		driver.navigate().back();
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
