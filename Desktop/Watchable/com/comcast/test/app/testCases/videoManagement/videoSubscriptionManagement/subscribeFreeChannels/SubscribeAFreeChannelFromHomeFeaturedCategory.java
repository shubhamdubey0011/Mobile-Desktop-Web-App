package comcast.test.app.testCases.videoManagement.videoSubscriptionManagement.subscribeFreeChannels;

import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.constant.XidioConstant;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.app.common.videoManagement.subscriptionsPage.common.SubscriptionsPageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;
import comcast.test.config.dataServices.vo.VideoDetails;

/**
 * Class Name: SubscribeAFreeChannelFromHomeFeaturedCategory Description: This
 * test case allows a user to subscribe a channel for free from the 'Featured'
 * section of 'Home' Page and also verifies if the user has been subscribed
 * successfully by navigating to 'My Channels' screen by logging into Watchable
 * application.
 */

public class SubscribeAFreeChannelFromHomeFeaturedCategory extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();
	HomePageCommonFunctions homePageCommonFun = new HomePageCommonFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	SubscriptionsPageCommonFunctions subscriptionsPageCommonFun = new SubscriptionsPageCommonFunctions();

	@Test
	public void testSubscribeAFreeChannelFromFeaturedCategory()
			throws Exception {

		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.HomeFeaturedAPI();
		List<VideoDetails> ChannelsList = videoDetails.get("show");

		try {
			/*
			 * This Method is to register new user using Watchable application
			 * and to change a password.
			 */
			RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

			// This method is to ensure Home is Active page when Login into
			// Application.
			assertionFunction.assertHomeActiveLink();

			// This Method verifies Channel present in Featured list and selects
			// a Channel.
			// homePageCommonFun.selectFeaturedChannel();

			// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Free[\\s\\S]*$"));

			// driver.findElement(By.xpath("//*[@id='content-wrap']/article/div/div[1]/div/span[2]/a/img")).click();

			// driver.findElement(By.xpath("//*[@id='cluetip']/div[1]/div/div[2]/form/fieldset/input")).click();

			boolean isFollowNowPresent = false;
			// Verify for the Channel subscription by checking the
			// "Follow Now" Button
			try {
				driver.findElement(By
						.xpath(XpathObjectRepo.CHANNELFOLLOWNOWIMAGE_XPATH));
				isFollowNowPresent = true;
			} catch (NoSuchElementException nse) {
				System.out.println("In exception");
			}
			// click on the "Follow Now" button if present else go back to
			// Home Page
			if (isFollowNowPresent) {
				driver.findElement(
						By.xpath(XpathObjectRepo.CHANNELFOLLOWNOWIMAGE_XPATH))
						.click();

			}

			Thread.sleep(sleepTime);
			// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*You have been subscribed\\.[\\s\\S]*$"));

			// Thread.sleep(sleepTime);
			// String
			// getUnsubsccribedText=driver.findElement(By.xpath(".//*[@id='content-wrap']/article/div/div[1]/div/span[2]/a/img")).getText();
			// assertEquals("",getUnsubsccribedText);

			// Verify Successful subscription message is displayed

			assertTrue(driver.findElement(
					By.xpath(XpathObjectRepo.FOLLOWUP_MSG_XPATH)).isDisplayed());

			// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*UNSUBSCRIBE[\\s\\S]*$"));

			// This method is to navigate My Channels Page.
			subscriptionsPageCommonFun.navigateToMyChannelsPage();

			// This method is to ensure My Channels is Active page when Login
			// into Application.
			assertionFunction.assertMyChannelsActiveLink();

			Thread.sleep(sleepTime);
			// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*"+ChannelsList.get(XidioConstant.selectFeaturedChannel).getTitle()+"[\\s\\S]*$"));

			assertTrue(driver
					.findElement(
							By.xpath(XpathObjectRepo.MYCHANNEL_SUBSCRIBEDCHANNELS_XPATH))
					.getText()
					.contains(
							ChannelsList.get(
									XidioConstant.selectFeaturedChannel)
									.getTitle()));

			driver.findElement(
					By.linkText(ChannelsList.get(
							XidioConstant.selectFeaturedChannel).getTitle()))
					.click();

			// This method asserts Home and My Channels inactive link when user
			// clicks on Bundle/Channel/Show.
			assertionFunction.assertAllInActiveLink();

			// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Unsubscribe[\\s\\S]*$"));
			// assertEquals("",getUnsubsccribedText);

			// This method asserts Footer Logo and It's Text.
			assertionFunction.assertFooterLogo();

			// This method asserts Footer Copy Right Links.
			assertionFunction.assertFooterCopyRight();

			// This method is used to logout from Watchable Application.
			userLogin.LogOut(driver);

			// This method is to ensure Login page is displayed when user Sign
			// Out from Application.
			assertionFunction.assertLoginPageDetails();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}
