package comcast.test.app.testCases.videoManagement.videoPlay.HomeCategoryVideos.FeaturedVideos;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.constant.XidioConstant;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.app.common.videoManagement.homePage.common.VideoPlay;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;
import comcast.test.config.dataServices.vo.VideoDetails;

/**
 * Class Name: PlayHomeFeaturedVideoSelectingFromVideos Description: This test
 * case is to play the video from LAST UPDATED category by selecting the videos
 * in the channel page for featured section in Home page.
 * **/

public class PlayHomeFeaturedVideoSelectingFromVideos extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	HomePageCommonFunctions homePageCommonFun = new HomePageCommonFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();
	VideoPlay videoplay = new VideoPlay();

	@Test
	public void testPlayHomeFeaturedVideoSelectingFromVideos() throws Exception {

		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.nPopularAPI();
		List<VideoDetails> channelList = videoDetails
				.get("popularChannelsList");
		List<VideoDetails> showsListUnderChannel = videoDetails
				.get("popularChannelShowsList");
		List<VideoDetails> videoList = videoDetails
				.get("popularChannelShowVideosList");

		int durationInSeconds = 0;
		int durationInMins = 0;

		try {
			/*
			 * This Method is to register new user using Watchable application
			 * and to change a password.
			 */
			RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

			driver.get(proUtil.getProperty("HOMEAPPURL"));
			Thread.sleep(sleepTime);

			// This method is to ensure Home is Active page when Login into
			// Application.
			assertionFunction.assertHomeActiveLink();

			// This method asserts featured title.
			assertionFunction.assertFeaturedTitle();

			if (channelList != null) {
				/*
				 * //This Method verifies Channel present in Featured list and
				 * selects a Channel.
				 * //homePageCommonFun.selectFeaturedChannel(channelList
				 * .get(XidioConstant.selectFeaturedChannel).getTitle());
				 * homePageCommonFun
				 * .selectPopularChannel(channelList.get(XidioConstant
				 * .selectFeaturedChannel).getTitle());
				 * 
				 * //This Method is to navigate Last Updated detail page.
				 * //homePageCommonFun.clickOnLastUpdatedLink();
				 * Thread.sleep(sleepTime); //select show from channel
				 * driver.findElement
				 * (By.linkText(showsListUnderChannel.get(XidioConstant
				 * .selectShow).getTitle())).click(); Thread.sleep(sleepTime);
				 * //Select Video under Channel show. String
				 * videoName=videoList.
				 * get(XidioConstant.selectVideo).getTitle();
				 * driver.findElement(By.partialLinkText(videoName)).click();
				 * 
				 * durationInSeconds=videoList.get(XidioConstant.selectVideo).
				 * getDuration(); durationInMins=durationInSeconds/60;
				 * 
				 * //This method is to validate video play functionality.
				 * videoplay.videoPlayVerification(durationInMins,videoName);
				 */
				// This method asserts Popular Channels title.
				homePageCommonFun.scrollToPopularChannelsSection();

				// This Method verifies Channel present in Popular Channel
				// Section and selects a Channel.
				homePageCommonFun.selectPopularChannel(channelList.get(
						XidioConstant.selectPopularChannel).getTitle());

				// This Method is to navigate Unwatched detail page.
				// homePageCommonFun.clickOnUnwatchedLink();

				// Select Popular show
				driver.findElement(
						By.linkText(showsListUnderChannel.get(
								XidioConstant.selectShow).getTitle())).click();

				// Select Popular Video.
				String videoName = videoList.get(XidioConstant.selectVideo)
						.getTitle();
				driver.findElement(
						By.linkText(videoList.get(XidioConstant.selectVideo)
								.getTitle())).click();

				durationInSeconds = videoList.get(XidioConstant.selectVideo)
						.getDuration();
				durationInMins = durationInSeconds / 60;

				// This method is to validate video play functionality.
				videoplay.videoPlayVerification(durationInMins, videoName);
			}

			// This method asserts Footer Logo and It's Text.
			assertionFunction.assertFooterLogo();

			// This method asserts Footer Copy Right Links.
			assertionFunction.assertFooterCopyRight();

			// This method is used to logout from Watchable Application.
			userLogin.LogOut(driver);

			// This method is to ensure Login page is displayed when user Sign
			// Out from Application.
			// assertionFunction.assertLoginPageDetails();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}