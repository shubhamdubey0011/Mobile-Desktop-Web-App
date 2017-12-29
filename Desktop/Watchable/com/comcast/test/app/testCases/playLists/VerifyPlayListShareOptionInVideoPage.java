package comcast.test.app.testCases.playLists;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.commonFunctions.CommonFun;
import comcast.test.app.testCases.playLists.playListsFunctions.PlayListsFun;
import comcast.test.config.configServices.DataServiceProperties;
import comcast.test.config.configServices.utils.BaseTest;

/**
 * Class Name: VerifyPlayListShareOptionInVideoPage Description: This test
 * script verifies play list share option present in the video page. Author:
 * Manoj
 * **/

public class VerifyPlayListShareOptionInVideoPage extends BaseTest {
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testVerifyPlayListShareOptionInVideoPage() throws Exception {

		try {

			log.info("Script: VerifyPlayListShareOptionInVideoPage");
			log.info("********************************************");

			// Navigate to the Home page of the application
			driver.get(DataServiceProperties.HOMEAPPURL);

			// Verify application is opened successfully.
			AssertionRepoFunctions.assertWatchableTitle();
			log.info("Successfully opened the application");

			Thread.sleep(sleepTime);

			// Verify Play List menu is present
			assertTrue(
					"Play Lists menu is not present",
					CommonFun.isElementPresent(driver,
							By.xpath(XpathObjectRepo.playLists_XPATH)));
			log.info("Play Lists menu is present");

			// Click on 'PLAYLISTS' menu
			PlayListsFun.clickOnPlaylistsMenu();

			// Verify All Play Lists page title
			AssertionRepoFunctions.assertAllPlayListsPageTitle();
			int playListCount = driver.findElements(
					By.xpath(XpathObjectRepo.allPlaylistsIcon_XPATH)).size();
			if (playListCount > 0) {

				// Verify Play Icon in Play List
				assertTrue("Play Icon not present in play list",
						CommonFun.isElementPresent(driver, By
								.xpath(XpathObjectRepo.playlistPlayIcon_XPATH)));
				log.info("Play Icon present in play list");

				// Click on Play Icon
				PlayListsFun.clickOnPlayIconFromPlayList();

				// Verify Video page title
				AssertionRepoFunctions.assertVideoPageTitleFromPlayList();
				log.info("The Video page title displayed after navigating from play list is '"
						+ driver.getTitle() + "'");

				// Verify video player is displayed in video page
				AssertionRepoFunctions.assertVideoPlayer();

				// Verify Play List share button
				assertTrue(
						"Play List share button not present in play list",
						CommonFun.isElementPresent(
								driver,
								By.xpath(XpathObjectRepo.playlistShareButton_XPATH)));
				log.info("Play List share button present in play list");

				// Mouse over Play List share button
				CommonFun.mouseOverElement(driver, driver.findElement(By
						.xpath(XpathObjectRepo.playlistShareButton_XPATH)));

				// Verify Copy Play List URL button in share option
				/*assertTrue(
						"Play List URL button not present in Play List share option",
						CommonFun.isElementPresent(driver, By
								.xpath(XpathObjectRepo.playlistShareUrl_XPATH)));
				log.info("Play List URL button present in play list share option");*/

				Thread.sleep(LessSleepTime);

				// Verify Play list Email Share button share option
				assertTrue(
						"Email button not present in play list share option",
						CommonFun.isElementPresent(driver,
								By.id(XpathObjectRepo.playlistShareEmail_ID)));
				log.info("Email button present in play list share option");

				Thread.sleep(LessSleepTime);

				// Verify Play list Face Book Share button share option
				assertTrue(
						"Face Book button not present in play list share option",
						CommonFun.isElementPresent(driver,
								By.id(XpathObjectRepo.playlistShareFB_ID)));
				log.info("Face Book button present in play list share option");

				Thread.sleep(LessSleepTime);

				// Verify Play list Twitter Share button share option
				assertTrue(
						"Twitter button not present in play list share option",
						CommonFun.isElementPresent(driver,
								By.id(XpathObjectRepo.playlistShareTW_ID)));
				log.info("Twitter button present in play list share option");

				Thread.sleep(LessSleepTime);

				log.info("");
			} else {
				log.info("Play Lists does NOT contains Play list");
			}

		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}

}
