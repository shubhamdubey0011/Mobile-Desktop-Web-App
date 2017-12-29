package comcast.test.app.testCases.videoManagement.videoPlay.videoStreamingTestCases.SeekFunctionalityTestCases;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.thoughtworks.selenium.webdriven.commands.Click;

import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.constant.XidioConstant;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.config.configServices.FlashObjectWebDriver;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.configServices.utils.TestDataGenerator;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;
import comcast.test.config.dataServices.vo.VideoDetails;

/**
 * Class Name: VerifySeekToNextPositionChangeFunctionality Description: This
 * test case is to verify seek to next position change functionality in video
 * player by logging into Gazeebo application.
 * **/

public class VerifySeekToNextPositionChangeFunctionality extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	HomePageCommonFunctions homePageCommonFun = new HomePageCommonFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testVideoSeekToNextPositionFunctionality() throws Exception {

		FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver,
				"PlayerPlatformAPI");

		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.featuredSectionVideos();
		List<VideoDetails> videoList = videoDetails.get("featuredVideoList");

		try {
			/*
			 * This Method is to register new user using watachable application
			 * and to change a password.
			 */
			RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);
			int loginError = driver
					.findElements(
							By.xpath(XpathObjectRepo.SIGNUPPAGE_INCORRECT_CREDENTIALS_MSG_XPATH))
					.size();

			if (loginError == 0) {

				// This method is to ensure Home is Active page when Login into
				// Application.
				assertionFunction.assertHomeActiveLink();

				if (videoList != null) {
					// This Method verifies Channel present in Featured list and
					// selects a Channel.
					homePageCommonFun.selectFeaturedChannel(videoList.get(
							XidioConstant.selectVideo).getTitle());

					Thread.sleep(XidioConstant.halfMin);

					// Manoj: Checking Selected video is partially played
					Thread.sleep(sleepTime);
					Thread.sleep(sleepTime);
					Thread.sleep(sleepTime);
					WebElement playFromPresent = driver.findElement(By
							.xpath(XpathObjectRepo.VIDEOPLAYFROMBUTTON_XPATH));

					if (playFromPresent.isDisplayed() == true) {
						Thread.sleep(sleepTime);
						Thread.sleep(sleepTime);
						driver.findElement(
								By.xpath(XpathObjectRepo.VIDEOPLAYFROMBUTTON_XPATH))
								.click();
						Thread.sleep(sleepTime);
						Thread.sleep(sleepTime);
						Thread.sleep(sleepTime);
						Thread.sleep(sleepTime);
						Thread.sleep(sleepTime);
					}

					Thread.sleep(sleepTime);
					Thread.sleep(sleepTime);

					boolean nowPlaying = driver
							.findElement(
									By.xpath(XpathObjectRepo.VIDEONOWPLAYINGOPOUP_XPATH))
							.isDisplayed();
					System.out.println("NOW PLAYING....." + nowPlaying);
					if (nowPlaying) {
						String getVideoPlayState = driver
								.findElement(
										By.xpath(XpathObjectRepo.VIDEOSTARTPOINTBUTTON_XPATH))
								.getText();
						assertEquals(
								UILablesRepo.VIDEOPLAYFROMSTARTBUTTON_TEXT,
								getVideoPlayState);
						// This method is to assert Up Next Header
						driver.findElement(
								By.xpath(XpathObjectRepo.VIDEODETAIL_POPUP_PLAYFROMSTARTBTN_XPATH))
								.click();

					} else {
						String getVideoPlayState = driver
								.findElement(
										By.xpath(XpathObjectRepo.VIDEOPLAYORPAUSEBUTTON_XPATH))
								.getAttribute("class");
						assertEquals(UILablesRepo.VIDEOPAUSEBUTTON_TEXT,
								getVideoPlayState);

						if (getVideoPlayState.equals("pause")) {
							flashApp.callFlashObject("setPosition",
									XidioConstant.setNextPosition);
							flashApp.callFlashObject("pause");
							Thread.sleep(XidioConstant.halfMin);
							String currentPosition = flashApp
									.callFlashObject("getCurrentPosition");

							assertEquals(XidioConstant.setNextPosition,
									currentPosition);

							Double tempcurrentPosition = Double
									.parseDouble(currentPosition);
							currentPosition = Integer.valueOf(
									tempcurrentPosition.intValue()).toString();
							currentPosition = TestDataGenerator
									.getFormattedTime(currentPosition);

							// String
							// pausedPositionFromUI=driver.findElement(By.xpath(".//*[@id='display']")).getText();
							String pausedPositionFromUI = driver
									.findElement(
											By.xpath(XpathObjectRepo.VIDEOCURRENTPOSITIONLABEL_XPATH))
									.getText();
							pausedPositionFromUI = pausedPositionFromUI.trim();
							assertEquals(currentPosition, pausedPositionFromUI);

							flashApp.callFlashObject("play");
							Thread.sleep(sleepTime);
						} else
							assertEquals("pause", getVideoPlayState);
					}

					Thread.sleep(sleepTime);
					// This method is used to logout from Watchable Application.
					userLogin.LogOut(driver);
				}
			}
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}

	}

}
