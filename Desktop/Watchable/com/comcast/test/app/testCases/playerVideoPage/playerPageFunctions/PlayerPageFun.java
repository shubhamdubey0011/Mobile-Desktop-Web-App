package comcast.test.app.testCases.playerVideoPage.playerPageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.commonFunctions.CommonFun;
import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;

public class PlayerPageFun extends BaseTest {

	/**
	 * Method Name: clickOnFeaturedVideoTitle Description: This method used to
	 * click on first video title form featured video section of home page.
	 * 
	 * */
	public static void clickOnFeaturedVideoTitle() throws Exception {

		// Click on video title form featured video section
		driver.findElement(
				By.xpath(XpathObjectRepo.featuredFirstVideoTitle_XPATH))
				.click();
		log.info("Successfully clicked on video title form video section");

		Thread.sleep(sleepTimeForVideoPlay);

	}

	/**
	 * Method Name: clickOnMyWatchlistVideoTitle Description: This method used
	 * to click on first video title form featured video section of My watch
	 * list.
	 * 
	 * */
	public static void clickOnMyWatchlistVideoTitle() throws Exception {

		// Click on video title form My watch list video section
		driver.findElement(
				By.xpath(XpathObjectRepo.myWatchlistFirstVideoTitle_XPATH))
				.click();
		log.info("Successfully clicked on video title form  My watch list video section");

		Thread.sleep(sleepTimeForVideoPlay);

	}

	/**
	 * Method Name: clickOnFeaturedVideoTitle Description: This method used to
	 * click on first video title form search result page.
	 * 
	 * */
	public static void clickOnSearchResultVideoTitle() throws Exception {

		// Click on video title form featured video section
		driver.findElement(
				By.xpath(XpathObjectRepo.searchResultFirstVideoTitle_XPATH))
				.click();
		log.info("Successfully clicked on video title form video section of search result page");

		Thread.sleep(sleepTimeForVideoPlay);
	}

	/**
	 * Method Name: clickOnMyWatchlistMenu Description: This method used to
	 * click on My Watchlist menu from header
	 * 
	 * */
	public static void clickOnMyWatchlistMenu() throws Exception {

		// Click on My Watchlist menu from header
		driver.findElement(By.xpath(XpathObjectRepo.myWatchlistMenu_XPATH))
				.click();
		log.info("Successfully clicked on My Watchlist menu from header");

		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: mouseOverVideoPlayer Description: This method used to mouse
	 * over video player to make video controls visible
	 * 
	 * */
	public static void mouseOverVideoPlayer() throws Exception {

		// Mouse over video player
		// Thread.sleep(LessSleepTime);

		CommonFun.mouseOverElement(driver,
				driver.findElement(By.id(XpathObjectRepo.videoPlayer_ID)));
		/*
		 * CommonFun.mouseOverElement(driver,
		 * driver.findElement(By.xpath(XpathObjectRepo
		 * .playerVideoContainer_XPATH)));
		 */
		CommonFun.mouseOverElement(driver, driver.findElement(By
				.xpath(XpathObjectRepo.playerContainer_XPATH)));

	}

	/**
	 * Method Name: mouseOverShareIcon Description: This method used to mouse
	 * over share icon in video player
	 * 
	 * */
	public static void mouseOverShareIcon() throws Exception {

		// Mouse over video player
		CommonFun.mouseOverElement(driver,
				driver.findElement(By.id(XpathObjectRepo.videoPlayer_ID)));

		new WebDriverWait(driver, 40).until(ExpectedConditions
				.elementToBeClickable(By
						.xpath(XpathObjectRepo.playerShareButton_XPATH)));

		driver.findElement(By.xpath(XpathObjectRepo.playerShareButton_XPATH))
				.click();

	}

	/**
	 * Method Name: clickOnPauseButton Description: This method used to click on
	 * pause button from video player controls
	 * 
	 * */
	public static void clickOnPauseButton() throws Exception {

		/*
		 * //driver.findElement(By.id(XpathObjectRepo.videoPlayer_ID)).click();
		 * 
		 * //driver.findElement(By.xpath("//div[contains(@id, 'player_overlay')]"
		 * )) .click();
		 */

		CommonFun.mouseOverElement(driver,
				driver.findElement(By.id(XpathObjectRepo.videoPlayer_ID)));
		new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(By
						.xpath(XpathObjectRepo.playerpauseButton_XPATH)));

		driver.findElement(By.xpath(XpathObjectRepo.playerpauseButton_XPATH))
				.click();

		log.info("Successfully clicked on pause button from player");
		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: clickOnFollowButton Description: This method used to click
	 * on follow button from video player controls
	 * 
	 * */
	public static void clickOnFollowButton() throws Exception {

		CommonFun.mouseOverElement(driver,
				driver.findElement(By.id(XpathObjectRepo.videoPlayer_ID)));

		// HomePageCommonFunctions.scrollOverPlayer();

		new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(By
						.xpath(XpathObjectRepo.playerFollowButton_XPATH)));

		// HomePageCommonFunctions.scrollOverPlayer();

		driver.findElement(By.xpath(XpathObjectRepo.playerFollowButton_XPATH))
				.click();

		log.info("Successfully clicked on follow button from player");
		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: clickOnUnFollowButton Description: This method used to click
	 * on un follow button from video player controls
	 * 
	 * */
	public static void clickOnUnFollowButton() throws Exception {

		CommonFun.mouseOverElement(driver,
				driver.findElement(By.id(XpathObjectRepo.videoPlayer_ID)));

		// HomePageCommonFunctions.scrollOverPlayer();

		new WebDriverWait(driver, 50).until(ExpectedConditions
				.elementToBeClickable(By
						.xpath(XpathObjectRepo.playerUnfollowButton_XPATH)));

		// HomePageCommonFunctions.scrollOverPlayer();

		driver.findElement(By.xpath(XpathObjectRepo.playerUnfollowButton_XPATH))
				.click();

		log.info("Successfully clicked on un follow button from player");
		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: clickOnChannelTitleLink Description: This method used to
	 * click on channel title link from video page
	 * 
	 * */
	public static void clickOnChannelTitleLink() throws Exception {

		// Click on channel title link
		driver.findElement(
				By.xpath(XpathObjectRepo.playingVideoChannelTitle_XPATH))
				.click();
		log.info("Successfully clicked on channel title link from video page");

		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: clickOnLikeButton Description: This method used to click on
	 * like button from video player controls
	 * 
	 * */
	public static void clickOnLikeButton() throws Exception {

		CommonFun.mouseOverElement(driver,
				driver.findElement(By.id(XpathObjectRepo.videoPlayer_ID)));

		HomePageCommonFunctions.scrollOverPlayer();

		new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(By
						.xpath(XpathObjectRepo.playerLikeButton_XPATH)));

		HomePageCommonFunctions.scrollOverPlayer();

		driver.findElement(By.xpath(XpathObjectRepo.playerLikeButton_XPATH))
				.click();

		log.info("Successfully clicked on like button from player");
		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: clickOnReportButton Description: This method used to click
	 * on report button from video player controls li.more > svg
	 * 
	 * */
	public static void clickOnReportButton() throws Exception {

		CommonFun.mouseOverElement(driver,
				driver.findElement(By.id(XpathObjectRepo.videoPlayer_ID)));

		// HomePageCommonFunctions.scrollOverPlayer();

		new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(By
						.xpath(XpathObjectRepo.playerMoreButton_XPATH)));

		// HomePageCommonFunctions.scrollOverPlayer();

		driver.findElement(By.xpath(XpathObjectRepo.playerMoreButton_XPATH))
				.click();

		CommonFun.mouseOverElement(driver, driver.findElement(By
				.xpath(XpathObjectRepo.playerMoreButton_XPATH)));

		new WebDriverWait(driver, 30).until(ExpectedConditions
				.elementToBeClickable(By
						.xpath(XpathObjectRepo.playerReportButton_XPATH)));

		driver.findElement(By.xpath(XpathObjectRepo.playerReportButton_XPATH))
				.click();

		log.info("Successfully clicked on report button from player");
		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: selectReportReason Description: This method used to select
	 * report reason from Report This Video pop up
	 * 
	 * */
	public static void selectReportReason() throws Exception {

		// select reason

		driver.findElement(
				By.xpath(XpathObjectRepo.reportVideopReasonRadioButton_XPATH))
				.click();

		log.info("Successfully selected the report reason");
		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: selectReportReason Description: This method used to click on
	 * report submit button from Report This Video pop up
	 * 
	 * */
	public static void clickonReportSubmitButton() throws Exception {

		// Click on report submit button

		driver.findElement(By.id(XpathObjectRepo.reportVideopSubmitButton_ID))
				.click();

		log.info("Successfully clicked on report submit button");
		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: clickonReportCancelButton Description: This method used to
	 * click on report cancel button from Report This Video pop up
	 * 
	 * */
	public static void clickonReportCancelButton() throws Exception {

		// Click on report cancel button

		driver.findElement(
				By.xpath(XpathObjectRepo.reportVideopCancelButton_XPATH))
				.click();

		log.info("Successfully clicked on report cancel button");
		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: clickonVideoPlayer Description: This method used to click on
	 * video player to pause the play
	 * 
	 * */
	public static void clickonVideoPlayer() throws Exception {

		// Click on video player

		driver.findElement(By.id(XpathObjectRepo.videoPlayer_ID)).click();

		log.info("Successfully clicked on video player");
		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: clickOnShowTitle Description: This method used to click on
	 * show title from up next section
	 * 
	 * */
	public static void clickOnShowTitle() throws Exception {

		// Click on show Title

		String showTitle = driver.findElement(
				By.xpath(XpathObjectRepo.videoPageUpNexSectionShowTitle_XPATH))
				.getText();

		driver.findElement(
				By.xpath(XpathObjectRepo.videoPageUpNexSectionShowTitle_XPATH))
				.click();

		log.info("Successfully clicked on the show title " + showTitle);
		Thread.sleep(sleepTime);
	}
	
	
	
	/**
	 * Method Name: clickOnNextButton 
	 * Description: This method used to click on next button from up next video section
	 * 
	 * */
	public static void clickOnNextButton() throws Exception {

		// Click on next button

		
		driver.findElement(
				By.xpath(XpathObjectRepo.videoPageUpNexSectionNextButton_XPATH))
				.click();

		log.info("Successfully clicked on Next button from up next section");
		Thread.sleep(sleepTime);
	}

}