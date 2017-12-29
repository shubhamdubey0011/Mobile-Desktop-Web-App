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
 * Class Name: VerifyPlayListEmailSharringFunctionality Description: This test
 * script verifies the opening of play list sharing popup window after clicking
 * on Email button from Play list sharing menu. Author: Manoj
 * **/

public class VerifyPlayListEmailSharringFunctionality extends BaseTest {
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testVerifyPlayListEmailSharringFunctionality() throws Exception {

		try {

			log.info("Script: VerifyPlayListEmailSharringFunctionality");
			log.info("*************************************************");

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

				// Verify Play list Email Share button share option
				assertTrue(
						"Email button not present in play list share option",
						CommonFun.isElementPresent(driver,
								By.id(XpathObjectRepo.playlistShareEmail_ID)));
				log.info("Email button present in play list share option");

				Thread.sleep(LessSleepTime);

				// Click on Play list Email Share button
				PlayListsFun.clickOnPlayListEmailShareButton();

				// Verify Play List Email sharing pop up window is displayed
				assertTrue(
						"Play List Email sharing pop up window is not displayed after clicking on Email button",
						CommonFun.isElementPresent(
								driver,
								By.xpath(XpathObjectRepo.playlistemailShareForm_XPATH)));

				log.info("Play List Email sharing pop up window is displayed after clicking on Email button");

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