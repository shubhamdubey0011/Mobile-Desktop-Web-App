package comcast.test.config.dataServices.subscribeFreeFeaturedChannelFromHome;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.constant.XidioConstant;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.subscriptionsPage.common.SubscriptionsPageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;
import comcast.test.config.dataServices.vo.VideoDetails;

public class DS_SubscribeAFreeChannelFromHomeFeatured extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	SubscriptionsPageCommonFunctions subscriptionsPageCommonFun = new SubscriptionsPageCommonFunctions();

	@Test
	public void RegisterAndSubscribeAFreeChannelHomeFeatured() throws Exception {

		// Lekshmi : As featured container doesnot contain channel, using the
		// method allPopularChannelsList as temporary solution.
		// Map<String, List<VideoDetails>>
		// videoDetails=RestAPIServices.featuredChannelsList();
		// List <VideoDetails>
		// channelList=videoDetails.get("featuredChannelsList");
		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.allPopularChannelsList();
		List<VideoDetails> channelList = videoDetails
				.get("popularChannelsList");

		/*
		 * This Method is to register new user using Comcast application and to
		 * change a password.
		 */
		RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

		int loginError = driver
				.findElements(
						By.xpath(XpathObjectRepo.SIGNUPPAGE_INCORRECT_CREDENTIALS_MSG_XPATH))
				.size();

		if (loginError == 0) {

			// This method is to navigate My Channels Page.
			subscriptionsPageCommonFun.navigateToMyChannelsPage();

			boolean isPresent = false;
			try {
				isPresent = driver.findElement(By
						.xpath(XpathObjectRepo.MYCHANNEL_EMPTY_MESSAGE_XPATH)) != null;
				isPresent = true;
			} catch (NoSuchElementException nse) {
			}

			if (isPresent) {

				driver.findElement(
						By.xpath(XpathObjectRepo.TOP_MENU_HOME_BUTTON_XPATH))
						.click();
				Thread.sleep(sleepTime);
				// String
				// channelName=channelList.get(XidioConstant.selectFeaturedChannel).getTitle();
				String channelName = channelList.get(
						XidioConstant.selectPopularChannel).getTitle();
				subscriptionsPageCommonFun
						.subscribeChannelFromPopularChannels(channelName);
				userLogin.LogOut(driver);
				// driver.findElement(By.xpath(XpathObjectRepo.WATCHABLE_LOGO)).click();
			} else {

				// This method is used to logout from Watchable Application.
				userLogin.LogOut(driver);
				// driver.findElement(By.xpath(XpathObjectRepo.WATCHABLE_LOGO)).click();
				Thread.sleep(sleepTime);
			}
		}
	}
}