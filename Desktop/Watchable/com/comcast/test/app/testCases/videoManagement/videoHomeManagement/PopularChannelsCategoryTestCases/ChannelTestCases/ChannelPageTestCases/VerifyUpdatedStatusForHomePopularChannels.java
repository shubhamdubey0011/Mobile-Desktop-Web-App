package comcast.test.app.testCases.videoManagement.videoHomeManagement.PopularChannelsCategoryTestCases.ChannelTestCases.ChannelPageTestCases;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Map;
import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;
import comcast.test.config.dataServices.vo.VideoDetails;

/**
 * Class Name: VerifyUpdatedStatusForHomePopularChannels Description: This test
 * case validates whether 'Updated' status is displayed in channel page for the
 * channel present under Popular Channels section in Home page by logging
 * registered user into Watchable application.
 * **/

public class VerifyUpdatedStatusForHomePopularChannels extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	HomePageCommonFunctions homePageCommonFun = new HomePageCommonFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testVerifyUpdatedStatusForHomePopularChannels()
			throws Exception {

		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.allPopularChannelsList();
		List<VideoDetails> channelList = videoDetails
				.get("popularChannelsList");

		try {
			/*
			 * This Method is to register new user using Gazeebo application and
			 * to change a password.
			 */
			// RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

			driver.get(DataServiceProperties.HOMEAPPURL);

			// This method is used to enter user name and password credential
			Thread.sleep(sleepTime);

			// This method is to ensure Home is Active page when Login into
			// Application.
			assertionFunction.assertHomeActiveLink();

			// This method asserts Popular Channels title.
			assertionFunction.assertPopularChannelsTitle();

			if (channelList != null) {
				// This method is to scroll UI to Popular Channels Section.
				homePageCommonFun.scrollToPopularChannelsSection();

				int loopMaxIndex = 0;
				if (channelList.size() < 4)
					loopMaxIndex = channelList.size();
				else
					loopMaxIndex = 4;

				for (int index = 0; index < loopMaxIndex; index++) {
					VideoDetails channels = channelList.get(index);
					// This Method verifies Channel present in Popular Channel
					// Section and selects a Channel.
					homePageCommonFun.selectPopularChannel(channels.getTitle());

					// Manoj: Object modified and moved to XpathObjectProp file

					// String
					// publishedDate=driver.findElement(By.xpath(".//*[@id='content-wrap']/article/div/div[2]/div[2]/div[1]/ul/li[3]")).getText();
					String publishedDate = driver
							.findElement(
									By.xpath(XpathObjectRepo.CHANNELDETAILLASTUPDATED_XPATH))
							.getText();
					assertEquals(channels.getLastPublished(), publishedDate);
					// assertEquals(channels.getLastPublished(), publishedDate);

					driver.navigate().back();
					Thread.sleep(sleepTime);
				}
			}

			// This method is used to logout from Watchable Application.
			// userLogin.LogOut(driver);

			// This method is to ensure Login page is displayed when user Sign
			// Out from Application.
			// assertionFunction.assertLoginPageDetails();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}
