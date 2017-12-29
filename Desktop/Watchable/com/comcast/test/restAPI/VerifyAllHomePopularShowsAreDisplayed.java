package comcast.test.restAPI;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.openqa.selenium.By;

import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;
import comcast.test.config.dataServices.vo.VideoDetails;

/**
 * Class Name: VerifyAllHomePopularShowsAreDisplayed Description: This test case
 * is to verify Home/Popular Shows category all Shows are displayed and
 * clickable by comparing with API for registered Comcast Application user.
 * **/

public class VerifyAllHomePopularShowsAreDisplayed extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Rule
	public ErrorCollector errCol = new ErrorCollector();

	@Test
	public void testVerifyAllHomePopularShowsAreDisplayed() throws Exception {

		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.HomePopularShowsAPIs();
		List<VideoDetails> popularShowList = videoDetails.get("popularShows");

		try {
			/*
			 * This Method is to register new user using Comcast application and
			 * to change a password.
			 */
			RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

			// This method is ensure Home is Active page when Login into
			// Application.
			assertionFunction.assertHomeActiveLink();

			Thread.sleep(sleepTime);
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
					.matches("^[\\s\\S]*Popular Shows[\\s\\S]*$"));
			for (VideoDetails showList : popularShowList) {
				System.out.println("showList:>>>" + showList.getTitle());
			}

			if (popularShowList != null && popularShowList.size() < 25) {
				for (VideoDetails showList : popularShowList) {
					int listIndex = popularShowList.indexOf(showList) + 1;
					System.out.println("Show List:>>" + showList.getTitle());
					if (listIndex <= 5) {
						assertEquals(
								showList.getTitle(),
								driver.findElement(
										By.xpath("//*[@id='popular_shows']/div/section/div/div/ul[1]/li["
												+ listIndex + "]/article/h1/a"))
										.getText());
						driver.findElement(
								By.xpath("//*[@id='popular_shows']/div/section/div/div/ul[1]/li["
										+ listIndex + "]/article/h1/a"))
								.click();
						assertTrue(driver
								.findElement(By.cssSelector("BODY"))
								.getText()
								.matches(
										"^[\\s\\S]*" + showList.getTitle()
												+ "[\\s\\S]*$"));

						// This method asserts Home and Subscriptions inactive
						// link when user clicks on Bundle/Channel/Show.
						assertionFunction.assertAllInActiveLink();

						// This method asserts XIDIO Logo.
						assertionFunction.assertWatchableLogo();

						// This method asserts Help link.
						assertionFunction.assertHelpLink();

						// This method asserts Search Text Box and its value.
						assertionFunction.assertSearchTextBox();

						driver.navigate().back();
						Thread.sleep(sleepTime);
					} else {
						driver.findElement(
								By.xpath(".//*[@id='popular_shows']/div/section/a[2]/span"))
								.click();

						Thread.sleep(sleepTime);
						assertEquals(
								showList.getTitle(),
								driver.findElement(
										By.xpath("//*[@id='popular_shows']/div/section/div/div/ul[1]/li["
												+ listIndex + "]/article/h1/a"))
										.getText());
						driver.findElement(
								By.xpath("//*[@id='popular_shows']/div/section/div/div/ul[1]/li["
										+ listIndex + "]/article/h1/a"))
								.click();
						assertTrue(driver
								.findElement(By.cssSelector("BODY"))
								.getText()
								.matches(
										"^[\\s\\S]*" + showList.getTitle()
												+ "[\\s\\S]*$"));

						driver.navigate().back();
						Thread.sleep(sleepTime);
					}
				}
			} else {
				for (int index = 0; index < 10; index++) {
					VideoDetails showList = popularShowList.get(index);

					int listIndex = popularShowList.indexOf(showList) + 1;
					System.out.println("Show List:>>" + showList.getTitle());
					if (listIndex <= 5) {
						assertEquals(
								showList.getTitle(),
								driver.findElement(
										By.xpath("//*[@id='popular_shows']/div/section/div/div/ul[1]/li["
												+ listIndex + "]/article/h1/a"))
										.getText());
						driver.findElement(
								By.xpath("//*[@id='popular_shows']/div/section/div/div/ul[1]/li["
										+ listIndex + "]/article/h1/a"))
								.click();
						assertTrue(driver
								.findElement(By.cssSelector("BODY"))
								.getText()
								.matches(
										"^[\\s\\S]*" + showList.getTitle()
												+ "[\\s\\S]*$"));

						// This method asserts Home and Subscriptions inactive
						// link when user clicks on Bundle/Channel/Show.
						assertionFunction.assertAllInActiveLink();

						// This method asserts XIDIO Logo.
						assertionFunction.assertWatchableLogo();

						// This method asserts Help link.
						assertionFunction.assertHelpLink();

						// This method asserts Search Text Box and its value.
						assertionFunction.assertSearchTextBox();

						driver.navigate().back();
						Thread.sleep(sleepTime);
					} else {
						driver.findElement(
								By.xpath(".//*[@id='popular_shows']/div/section/a[2]/span"))
								.click();

						Thread.sleep(sleepTime);
						assertEquals(
								showList.getTitle(),
								driver.findElement(
										By.xpath("//*[@id='popular_shows']/div/section/div/div/ul[1]/li["
												+ listIndex + "]/article/h1/a"))
										.getText());
						driver.findElement(
								By.xpath("//*[@id='popular_shows']/div/section/div/div/ul[1]/li["
										+ listIndex + "]/article/h1/a"))
								.click();
						assertTrue(driver
								.findElement(By.cssSelector("BODY"))
								.getText()
								.matches(
										"^[\\s\\S]*" + showList.getTitle()
												+ "[\\s\\S]*$"));

						driver.navigate().back();
						Thread.sleep(sleepTime);
					}
				}
			}
			// This method asserts Footer Logo and It's Text.
			assertionFunction.assertFooterLogo();

			// This method asserts Footer Copy Right Links.
			assertionFunction.assertFooterCopyRight();

			driver.findElement(By.linkText("Log Out")).click();

			// This method is to ensure Login page is displayed when user Sign
			// Out from Application.
			assertionFunction.assertLoginPageDetails();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}
