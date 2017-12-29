package comcast.test.app.testCases.channelPage.channelPageFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import comcast.test.app.common.XpathObjectRepo;
//import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;
public class ChannelPageFun extends BaseTest {

	/**
	 * Method Name: clickOnFirstFeaturedChannelLink Description: This method
	 * used click On First Channel Link from Watchable SHOWS OF THE WEEK Section
	 * 
	 * @throwsdException
	 */
	public static void clickOnFirstFeaturedChannelLink() throws Exception {

		// click On First show Link from Watchable SHOWS OF THE WEEK Section

		String channelTitle = driver.findElement(
				By.xpath(XpathObjectRepo.featuredFirstChannelTitle_XPATH))
				.getText();

		driver.findElement(
				By.xpath(XpathObjectRepo.featuredFirstChannelTitle_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked On First Show '" + channelTitle
				+ "' from Watchable SHOWS OF THE WEEK section");

	}

	
	/**
	 * Method Name: clickOnFirstChannelLinkFromFeaturedVideos Description: This method
	 * used click On First Channel Link from What We're WATCHING Section
	 * 
	 * @throwsdException
	 */
	public static void clickOnFirstChannelLinkFromFeaturedVideos() throws Exception {

		// click On First Channel Link from What We're WATCHING Section

		String channelTitle = driver.findElement(
				By.xpath(XpathObjectRepo.featuredVideoFirstShowTitle_XPATH))
				.getText();

		driver.findElement(
				By.xpath(XpathObjectRepo.featuredVideoFirstShowTitle_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked On First Show '" + channelTitle
				+ "' from What We're WATCHING section");

	}
	
	/** // This method is to scroll UI to Featured Video from featured shows
			// section.
			HomePageCommonFunctions.scrollToVideoSectionFromChannelSection();
	 * Method Name: clickOnProviderLinkFromOtherChannel Description: This method
	 * used click On Provider name link from other Shows Section in channel
	 * detail page
	 * 
	 * @throwsdException
	 */
	public static void clickOnProviderLinkFromOtherChannel() throws Exception {

		// click On Provider name link

		String providerTitle = driver
				.findElement(
						By.xpath(XpathObjectRepo.channelPageOtherSectionProviderTitle_XPATH))
				.getText();

		driver.findElement(
				By.xpath(XpathObjectRepo.channelPageOtherSectionProviderTitle_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked On '" + providerTitle
				+ "' from Other Shows section");

	}

	/**
	 * Method Name: clickOnChannelLinkFromOtherChannel Description: This method
	 * used click On channel name link Link from other Channel Section in
	 * channel detail page
	 * 
	 * @throwsdException
	 */
	public static void clickOnChannelLinkFromOtherChannel() throws Exception {

		// click On First Shows Link

		String channelTitle = driver
				.findElement(
						By.xpath(XpathObjectRepo.channelPageOtherSectionChannelTitle_XPATH
								+ "1" + "]/descendant::h1/a")).getText();

		driver.findElement(
				By.xpath(XpathObjectRepo.channelPageOtherSectionChannelTitle_XPATH
						+ "1" + "]/descendant::h1/a")).click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked On '" + channelTitle
				+ "' from Other Shows section");

	}

	/**
	 * Method Name: clickOnNextPageButton Description: This method used click On
	 * next page button from other video Section in channel detail page
	 * 
	 * @throwsdException
	 */
	public static void clickOnNextPageButton() throws Exception {

		// click On next page button

		driver.findElement(
				By.xpath(XpathObjectRepo.channelPageNextPageButton_XPATH))
				.click();

		Thread.sleep(sleepTime);

	}

	/**
	 * Method Name: clickOnPreviousPageButton Description: This method used
	 * click On Previous page button from other video Section in channel detail
	 * page
	 * 
	 * @throwsdException
	 */
	public static void clickOnPreviousPageButton() throws Exception {

		// click On Previous page button

		driver.findElement(
				By.xpath(XpathObjectRepo.channelPagePreviousPageButton_XPATH))
				.click();

		Thread.sleep(sleepTime);

	}

	/*
	 * Method: scrollToOtherChannelsSection Description: This method scroll to
	 * Other Channels Section.
	 */
	public static void scrollToOtherChannelsSection()
			throws InterruptedException {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).perform();
		for (int i = 0; i < 16; i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
		}
	}

	/*
	 * Method: scrollToVideoSection Description: This method scroll to Video
	 * Section.
	 */
	public static void scrollToVideoSection() throws InterruptedException {
		Actions action = new Actions(driver);
		action.sendKeys(Keys.DOWN).perform();
		for (int i = 0; i < 6; i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.DOWN);
			Thread.sleep(1000);
		}
	}

}
