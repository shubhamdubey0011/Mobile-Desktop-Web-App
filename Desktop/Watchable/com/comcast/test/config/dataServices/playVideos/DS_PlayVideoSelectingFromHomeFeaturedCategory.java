package comcast.test.config.dataServices.playVideos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.constant.XidioConstant;
import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.vo.VideoDetails;

/**
 * Class Name: DS_PlayVideoSelectingFromHomeFeaturedCategory Description: This
 * data service is to play the video by clicking video from 'Featured' section
 * on 'Home' screen by logging into Watchable application.
 */

public class DS_PlayVideoSelectingFromHomeFeaturedCategory extends BaseTest {

	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();
	HomePageCommonFunctions homePageCommonFun = new HomePageCommonFunctions();

	@Test
	public void testDS_PlayVideoSelectingFromHomeFeaturedCategory()
			throws Exception {

		Map<String, List<VideoDetails>> videoList = RestAPIServices
				.nFeaturedAPI();
		List<VideoDetails> featuredVideoList = videoList
				.get("featuredVideoList");
		Actions actions = new Actions(driver);
		int durationInSeconds = 0;
		int durationInMins = 0;

		try {
			if (featuredVideoList != null) {
				// This Method verifies Episode present in Featured list and
				// selects a Episode.
				homePageCommonFun.selectHomeFeaturedShow(featuredVideoList.get(
						XidioConstant.selectVideo).getTitle());

				/*
				 * boolean isPopupPresent=false;
				 * isPopupPresent=driver.findElement
				 * (By.xpath(XpathObjectRepo.VIDEONOWPLAYINGOPOUP_XPATH
				 * )).findElements
				 * (By.xpath(XpathObjectRepo.VIDEOSTARTPOINTBUTTON_XPATH
				 * )).size()>0; if(isPopupPresent==true)
				 * 
				 * Thread.sleep(sleepTime); if
				 * (driver.findElement(By.xpath(XpathObjectRepo
				 * .VIDEOSTARTPOINTBUTTON_XPATH)).isDisplayed() == true){
				 * driver.
				 * findElement(By.xpath(XpathObjectRepo.VIDEOSTARTPOINTBUTTON_XPATH
				 * )).click(); }
				 */
				Thread.sleep(sleepTime);
				Thread.sleep(sleepTime);
				Thread.sleep(sleepTime);
				Thread.sleep(sleepTime);
				Thread.sleep(sleepTime);
				WebElement playFromStart = driver.findElement(By
						.xpath(XpathObjectRepo.VIDEOPLAYSTARTBUTTON_XPATH));

				if (playFromStart.isDisplayed()) {

					driver.findElement(
							By.xpath(XpathObjectRepo.VIDEOPLAYSTARTBUTTON_XPATH))
							.click();

					Thread.sleep(sleepTime);
					Thread.sleep(sleepTime);
					Thread.sleep(sleepTime);
					Thread.sleep(sleepTime);

				}

				durationInSeconds = featuredVideoList.get(
						XidioConstant.selectVideo).getDuration();
				durationInMins = durationInSeconds / 60;
				int loopIndex = 0;
				if (durationInMins < 2)
					loopIndex = durationInMins;
				else
					loopIndex = 2;
				for (int j = 0; j < loopIndex; j++) {
					Thread.sleep(XidioConstant.halfMin);
					WebElement videoPage = driver.findElement(By
							.xpath(XpathObjectRepo.VIDEODETAILSPAGE_XPATH));
					actions.moveToElement(videoPage);
					actions.perform();

					String getVideoPlayState = driver
							.findElement(
									By.xpath(XpathObjectRepo.VIDEOPLAYORPAUSEBUTTON_XPATH))
							.getAttribute("class");
					assertEquals(UILablesRepo.VIDEOPAUSEBUTTON_TEXT,
							getVideoPlayState);

					// assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*"+featuredVideoList.get(XidioConstant.selectVideo).getTitle()+"[\\s\\S]*$"));

					// This method is to assert Up Next Header
					assertionFunction.assertUpNextTitle();
				}

			}
			// This method Navigate to Home page.
			homePageCommonFun.navigateToHomePage();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}
