package comcast.test.app.common.AssertionRepo.common;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.xml.sax.SAXException;

import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.commonFunctions.CommonFun;
import comcast.test.app.testCases.playerVideoPage.playerPageFunctions.PlayerPageFun;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.TestDataGenerator;

/**
 * Class Name: UserRegistrationUsingComcast Description: This test case allows
 * the user to register into Comcast application including credit card details.
 **/

public class AssertionRepoFunctions extends BaseTest {

	TestDataGenerator dataGenerator = new TestDataGenerator();

	/**
	 * Method Name: assertWatchableLogo This is method verify Watchable
	 * application is successfully opened
	 * 
	 * @return
	 */
	public static void assertWatchableTitle() throws Exception {
		Thread.sleep(sleepTime);
		assertTrue("Failed to navigate to Watchable Home Page", driver
				.getTitle().contains(UILablesRepo.HOMEPAGE_TITLE));

	}
	
	
	/**
	 * Method Name: assertErrorPageTitle This is method verifies display of error page
	 * 
	 * @return
	 */
	public static void assertErrorPageTitle() throws Exception {
		Thread.sleep(sleepTime);
		assertTrue("Error Page is not displayed", driver
				.getTitle().contains(UILablesRepo.ERRORPAGE_TITLE));
		
		log.info("Error Page is displayed");

	}

	/**
	 * Method Name: assertSearchResultPageTitle This is method verify search
	 * result page is displays a
	 * 
	 * @return
	 */
	public static void assertSearchResultPageTitle() throws Exception {
		Thread.sleep(sleepTime);
		assertTrue("Failed to navigate to search result page", driver
				.getTitle().contains(UILablesRepo.SEARCR_RESULT_PAGE_TITLE));

		log.info("Successfully navigate to search result page");

	}

	/**
	 * Method Name: assertHelpPageTitle This is method verify Help page is
	 * displayed
	 * 
	 * @return
	 */
	public static void assertHelpPageTitle() throws Exception {
		Thread.sleep(sleepTime);
		assertTrue("Failed to navigate to Help page", driver.getTitle()
				.contains(UILablesRepo.HELP_PAGE_TITLE));

		log.info("Successfully navigate to Help page");

	}
	
	
	/**
	 * Method Name: assertPrivacyPolicyPageTitle This is method verify Privacy Policy page is
	 * displayed
	 * 
	 * @return
	 */
	public static void assertPrivacyPolicyPageTitle() throws Exception {
		Thread.sleep(sleepTime);
		assertTrue("Failed to navigate to Privacy Policy page", driver.getTitle()
				.contains(UILablesRepo.PRIVACY_POLICY_PAGE_TITLE));

		log.info("Successfully navigate to Privacy Policy page");

	}
	
	/**
	 * Method Name: assertTermsOfServicePageTitle This is method verify Terms Of Service page is
	 * displayed
	 * 
	 * @return
	 */
	public static void assertTermsOfServicePageTitle() throws Exception {
		Thread.sleep(sleepTime);
		assertTrue("Failed to navigate to Terms Of Use page", driver.getTitle()
				.contains(UILablesRepo.TERMS_USE_PAGE_TITLE));

		log.info("Successfully navigate to Terms Of Use page");

	}
	
	
	/**
	 * Method Name: assertAllPlayListsPageTitle This is method verify All Play Lists page is
	 * displayed
	 * 
	 * @return
	 */
	public static void assertAllPlayListsPageTitle() throws Exception {
		Thread.sleep(sleepTime);
		assertTrue("Failed to navigate to Terms Of Use page", driver.getTitle()
				.contains(UILablesRepo.ALL_PLAY_LISTS_PAGE_TITLE));

		log.info("Successfully navigate to All Play Lists page");

	}

	/**
	 * Method Name: assertVideoPageTitle This is method verify video page is
	 * displays
	 * 
	 * 
	 * @return
	 */
	public static void assertVideoPageTitle() throws Exception {
		//Thread.sleep(sleepTime);
		assertTrue("Failed to navigate to video page", driver.getTitle()
				.contains(UILablesRepo.VIDEO_PAGE_TITLE));

		log.info("Successfully navigate to video page");

	}
	
	
	/**
	 * Method Name: assertVideoPageTitleFromPlayList This is method verify video page is
	 * displays after navigating from play list.
	 * 
	 * 
	 * @return
	 */
	public static void assertVideoPageTitleFromPlayList() throws Exception {
		
		assertTrue("Failed to navigate to video page", driver.getTitle()
				.contains(UILablesRepo.VIDEO_PAGE_FROM_PL_TITLE));

		log.info("Successfully navigate to video page");

	}

	/**
	 * Method Name: assertVideoPlayer This is method verify video player in
	 * video page
	 * 
	 * 
	 * @return
	 */
	public static void assertVideoPlayer() throws Exception {
		assertTrue(
				"Video player is not present in video page",
				CommonFun.isElementPresent(driver,
						By.id(XpathObjectRepo.videoPlayer_ID)));
		log.info("Video player is present in video page");

	}

	/**
	 * Method Name: assertVideoPlayerControls This is method verify controls in
	 * video playe
	 * 
	 * 
	 * @return
	 */
	public static void assertVideoPlayerControls() throws Exception {

		// Mouse over video player
		PlayerPageFun.mouseOverVideoPlayer();
		// Verify Rewind Button in player
		assertTrue(
				"Rewind Button is not present in video player",
				CommonFun.isElementPresent(driver,
						By.xpath(XpathObjectRepo.playerRewindButton_XPATH)));
		log.info("Rewind Button is present in video player");

		// Mouse over video player
		PlayerPageFun.mouseOverVideoPlayer();
		// Verify video played time display in player
		assertTrue(
				"Video played time display is not present in video player",
				CommonFun.isElementPresent(driver,
						By.xpath(XpathObjectRepo.playerDisplayButton_XPATH)));
		log.info("Video played time display is present in video player");

		// Mouse over video player
		PlayerPageFun.mouseOverVideoPlayer();
		// Verify Scrubber Button in player
		assertTrue(
				"Scrubber Button is not present in video player",
				CommonFun.isElementPresent(driver,
						By.xpath(XpathObjectRepo.playerScrubberButton_XPATH)));
		log.info("Scrubber Button is present in video player");

		// Mouse over video player
		PlayerPageFun.mouseOverVideoPlayer();
		// Verify Video duration time in player
		assertTrue(
				"Video duration time is not present in video player",
				CommonFun.isElementPresent(driver,
						By.xpath(XpathObjectRepo.playerDurationButton_XPATH)));
		log.info("Video duration time is present in video player");

		// Mouse over video player
		PlayerPageFun.mouseOverVideoPlayer();
		// Verify Volume Button in player
		assertTrue(
				"Volume Button is not present in video player",
				CommonFun.isElementPresent(driver,
						By.xpath(XpathObjectRepo.playerVolumeButton_XPATH)));
		log.info("Volume Button is present in video player");

		// Mouse over video player
		PlayerPageFun.mouseOverVideoPlayer();
		// Verify Share Button in player
		assertTrue(
				"Share Button is not present in video player",
				CommonFun.isElementPresent(driver,
						By.xpath(XpathObjectRepo.playerShareButton_XPATH)));
		log.info("Share Button is present in video player");

		// Mouse over video player
		PlayerPageFun.mouseOverVideoPlayer();
		// Verify Like Button in player - Like button is removed now from video controller
		/*assertTrue(
				"Like Button is not present in video player",
				CommonFun.isElementPresent(driver,
						By.xpath(XpathObjectRepo.playerLikeButton_XPATH)));
		log.info("Like Button is present in video player");*/

		// Mouse over video player
		PlayerPageFun.mouseOverVideoPlayer();
		// Verify Follow Button in player
		assertTrue(
				"Follow Button is not present in video player",
				CommonFun.isElementPresent(driver,
						By.xpath(XpathObjectRepo.playerFollowButton_XPATH)));
		log.info("Follow Button is present in video player");

		// Mouse over video player
		PlayerPageFun.mouseOverVideoPlayer();
		// Verify Full screen Button in player
		assertTrue(
				"Full screen Button is not present in video player",
				CommonFun.isElementPresent(driver,
						By.xpath(XpathObjectRepo.playerFullscreenButton_XPATH)));
		log.info("Full screen Button is present in video player");

		// Mouse over video player
		PlayerPageFun.mouseOverVideoPlayer();
		// Verify More Button in player
		assertTrue(
				"More Button is not present in video player",
				CommonFun.isElementPresent(driver,
						By.xpath(XpathObjectRepo.playerMoreButton_XPATH)));
		log.info("More Button is present in video player");

	}

	/**
	 * Method Name: assertMyWatchlistPageTitle This is method my watch list
	 * video page is displays
	 * 
	 * 
	 * @return
	 */
	public static void assertMyWatchlistPageTitle()
			throws XPathExpressionException, ParserConfigurationException,
			SAXException, IOException, InterruptedException {
		Thread.sleep(sleepTime);
		assertTrue("Failed to navigate to my Shows page", driver.getTitle()
				.contains(UILablesRepo.MY_WATCHLIST_PAGE_TITLE));

		log.info("Successfully navigate to my Shows page");

	}

	/**
	 * Method Name: assertChannelPageTitle This is method verifies Show page
	 * title.
	 * 
	 * @return
	 */
	public static void assertChannelPageTitle()
			throws XPathExpressionException, ParserConfigurationException,
			SAXException, IOException, InterruptedException {
		Thread.sleep(sleepTime);
		assertTrue("Failed to Navigate to Show details page", driver
				.getTitle().contains(UILablesRepo.CHANNEL_PAGE_TITLE));
		log.info("User is successfully navigate to Show detail page.");

	}

	/**
	 * Method Name: assertProviderPageTitle This is method verifies provider
	 * page title.
	 * 
	 * @return
	 */
	public void assertProviderPageTitle() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);
		assertTrue("Failed to Navigate to Provider details page", driver
				.getTitle().contains(UILablesRepo.PROVIDER_PAGE_TITLE));
		log.info("User is successfully navigate to Provider detail page.");

	}

	/**
	 * Method Name: assertLoginPageDetails Description: This is method is to
	 * ensure Home is Active page.
	 */
	public void assertLoginPageDetails() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);
	}

	/**
	 * Method Name: assertHomeActiveLink Description: This is method is to
	 * ensure Home is Active page.
	 * 
	 * @throws Exception
	 */
	public void assertHomeActiveLink() throws Exception {
		Thread.sleep(sleepTime);

		// Lekshmi : Change the object identifier

		String getHomePageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HOME_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HOME button is not active",
				UILablesRepo.TOPMENU_HOMEACTIVECLASS, getHomePageState);

		String getSubscriptionPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_MYCHANNELS_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("MY CAHNNELS button is not active",
				UILablesRepo.TOPMENU_MYCHANNELSCLASS, getSubscriptionPageState);

		String getHelpPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HELP_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HELP button is not active",
				UILablesRepo.TOPMENU_HELPCLASS, getHelpPageState);
	}

	/**
	 * Method Name: assertSubscriptionsActiveLink Description: This is method is
	 * to ensure Subscriptions is Active page.
	 */
	public void assertMyChannelsActiveLink() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);

		String getSubscriptionPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_MYCHANNELS_BUTTON_XPATH))
				.getAttribute("class");

		assertTrue("MY CAHNNELS button is not active",
				getSubscriptionPageState.contains("active"));

	}

	/**
	 * Method Name: assertHelpActiveLink Description: This is method is to
	 * ensure Help is Active page.
	 */
	public void assertHelpActiveLink() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);

		String getHelpPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HELP_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HELP button is not active",
				UILablesRepo.TOPMENU_HELPACTIVECLASS, getHelpPageState);

	}

	/**
	 * Method Name: assertHelpActiveLink Description: This is method is to
	 * ensure Help is Active page.
	 */
	public void assertHelpActiveLinkAfterLogin()
			throws XPathExpressionException, ParserConfigurationException,
			SAXException, IOException, InterruptedException {

		// Lekshmi: Change the object identifier
		Thread.sleep(sleepTime);
		String getHomePageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HOME_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HOME button is not active",
				UILablesRepo.TOPMENU_HOMEINACTIVECLASS, getHomePageState);

		String getSubscriptionPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_MYCHANNELS_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("MY CHANNELS button is not active",
				UILablesRepo.TOPMENU_MYCHANNELSCLASS, getSubscriptionPageState);

		String getHelpPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HELP_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HELP button is not active",
				UILablesRepo.TOPMENU_HELPACTIVECLASS, getHelpPageState);

		driver.findElement(By.xpath(XpathObjectRepo.TOPMENUDOWNARROW_XPATH))
				.click();
		Thread.sleep(sleepTime);
		String logOut = driver.findElement(
				By.xpath(XpathObjectRepo.LOGOUT_XPATH)).getText();
		assertEquals(UILablesRepo.LOGOUT, logOut);
	}

	/**
	 * Method Name: assertAllInActiveLink Description: This is method asserts
	 * all inactive links i.e. Home and Subscriptions.
	 */
	public void assertAllInActiveLink() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);
		String getHomePageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HOME_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HOME button is not active",
				UILablesRepo.TOPMENU_HOMEINACTIVECLASS, getHomePageState);

		String getSubscriptionPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_MYCHANNELS_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("MY CAHNNELS button is not active",
				UILablesRepo.TOPMENU_MYCHANNELSCLASS, getSubscriptionPageState);

		String getHelpPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HELP_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HELP button is not active",
				UILablesRepo.TOPMENU_HELPCLASS, getHelpPageState);
	}

	/**
	 * Method Name: assertXidioLogo Description: This is method is to assert
	 * WATCHABLE Logo.
	 */
	public void assertGazeeboLogo() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
	}

	/**
	 * Method Name: assertWatchableLogo Description: This is method is to assert
	 * the Watchable Logo. Lekshmi added the method.
	 * 
	 * @return
	 */
	public void assertWatchableLogo() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {

		boolean isPresent = false;
		try {
			isPresent = driver.findElement(By
					.xpath(XpathObjectRepo.watchableTopLogo_XPATH)) != null;
			isPresent = true;
		} catch (NoSuchElementException nse) {
		}
		assertTrue("Watchable log is not present in header section", isPresent);

	}

	/**
	 * Method Name: assertFooterCopyRight Description: This is method is to
	 * assert footer links.
	 */
	public void assertFooterCopyRight() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {

		String Os = proUtil.getProperty("OS");
		if (Os.equalsIgnoreCase("Mac")) {
			assertEquals(
					UILablesRepo.FOOTERCOPYRIGHT_MAC_OS_TEXT,
					driver.findElement(
							By.xpath(XpathObjectRepo.FOOTERCOPYRIGHTID_XPATH))
							.getText());
		} else if (Os.equalsIgnoreCase("Windows")) {
			assertEquals(
					UILablesRepo.FOOTERCOPYRIGHT_TEXT,
					driver.findElement(
							By.xpath(XpathObjectRepo.FOOTERCOPYRIGHTID_XPATH))
							.getText());
		}
	}

	/**
	 * Method Name: assertFooterCategoryLinks Description: This is method is to
	 * assert all footer Category links.
	 */
	public void assertFooterCategoryLinks() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		// Below assertions is for "Video Categories" Category Links

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERVIDEOCATEGORIES_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.VIDEOCATEGORIES));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_ANIMATION_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.ANIMATION));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_ENTERTAINMENT_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.ENTERTAINMENT));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_FASHIONSTYLE_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.FASHIONANDSTYLE));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_FOOD_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.FOOD));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_FUNNY_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.FUNNY));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_GAMING_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.GAMING));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_MUSIC_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.MUSIC));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_NEWS_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.NEWS));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_SCIENCETECH_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.SCIANDTECHNOLOGY));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_SERIES_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.SERIES));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_SPORTS_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.SPORTS));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTERCATEGORIES_TRAVELEVENTS_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.TRAVELSANDEVENTS));

		// Below assertions is for "Watchable" Category Links
		// Lekshmi: Change the object identifier.

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTER_WATCHABLE_TITLE_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.FOOTER_WATCHABLE_TITLE));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTER_WATCHABLEFORIPAD_LINK_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.FOOTER_WATCHABLEFORIPAD_LINK));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTER_WATCHABLEFORTV_LINK_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.FOOTER_WATCHABLEFORTV_LINK));
		assertTrue(driver
				.findElement(By.xpath(XpathObjectRepo.FOOTER_HELP_LINK_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.FOOTER_HELP_LINK));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTER_SIGNUP_AFTERLOGIN_SPAN_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.FOOTER_SIGNUP_AFTERLOGIN_SPAN));

		// Below assertions is for "Company" Category Links
		// Lekshmi : Change the object identifier
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTER_COMPANY_TITLE_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.FOOTER_COMPANY_TITLE));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTER_PRIVACYPOLICY_LINK_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.FOOTER_PRIVACYPOLICY_LINK));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTER_TERMSOFUSE_LINK_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.FOOTER_TERMSOFUSE_LINK));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTER_ADCHOICES_LINK_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.FOOTER_ADCHOICES_LINK));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTER_ADVERTISEWITHUS_LINK_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.FOOTER_ADVERTISEWITHUS_LINK));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.FOOTER_CONTACTUS_LINK_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.FOOTER_CONTACTUS_LINK));

	}

	/**
	 * Method Name: assertSearchTextBox Description: This is method is to assert
	 * Search Text Box.
	 */
	public void assertSearchTextBox() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		// Lekshmi : Change the object identifier
		assertEquals("search-query",
				driver.findElement(By.xpath(XpathObjectRepo.SEARCH_XPATH))
						.getAttribute("id"));

		assertEquals("Search",
				driver.findElement(By.xpath(XpathObjectRepo.SEARCH_XPATH))
						.getAttribute("value"));
	}

	/**
	 * Method Name: assertHelpLink Description: This is method is to assert Help
	 * Link.
	 */
	public void assertHelpLink() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		// Lekshmi : Update the assert as part of refactoring.
		assertEquals(
				UILablesRepo.TOPMENU_HELP,
				driver.findElement(
						By.xpath(XpathObjectRepo.TOP_MENU_HELP_BUTTON_XPATH))
						.getText());
	}

	/**
	 * Method Name: assertSignOutLink Description: This is method is to assert
	 * Sign Out Link.
	 */
	public void assertSignOutLink() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {

		driver.findElement(By.xpath(XpathObjectRepo.USERNAME_TOPMENU_XPATH))
				.click();
		CommonFun.waitObjectToLoad(driver,
				By.xpath(XpathObjectRepo.LOGOUT_XPATH), 60);
		Thread.sleep(sleepTime);
		String val = driver.findElement(By.xpath(XpathObjectRepo.LOGOUT_XPATH))
				.getText();
		assertTrue(val.equalsIgnoreCase(UILablesRepo.LOGOUT));

	}

	/**
	 * Method Name: assertActiveROWSLink Description: This is method is to
	 * ensure ROWS link is Active.
	 * 
	 * Lekshmi : As the Rows link functionality is removed from the Watchable
	 * application, the assertion is not refactoring.
	 */

	public void assertActiveROWSLink() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);
		String getRowsLinkState = driver
				.findElement(
						By.xpath("//*[@id='content-wrap']/article/section/article/div/header/nav[2]/ul/li[1]/a"))
				.getAttribute("class");
		assertEquals("icn-rows active", getRowsLinkState);

		String getShowsLinkState = driver
				.findElement(
						By.xpath("//*[@id='content-wrap']/article/section/article/div/header/nav[2]/ul/li[2]/a"))
				.getAttribute("class");
		assertEquals("", getShowsLinkState);

		String getVideoLinkState = driver
				.findElement(
						By.xpath("//*[@id='content-wrap']/article/section/article/div/header/nav[2]/ul/li[3]/a"))
				.getAttribute("class");
		assertEquals("", getVideoLinkState);
	}

	/**
	 * Method Name: assertActiveCHANNELSLink Description: This is method is to
	 * ensure CHANNELS link is Active.
	 * 
	 * Lekshmi : As the Channels link functionality is removed from the
	 * Watchable application, the assertion is not refactoring.
	 */
	public void assertActiveCHANNELSLink() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);
		String getChannelsLinkState = driver
				.findElement(
						By.xpath(".//*[@id='content-wrap']/article/section/article/div/div/header/header/nav/ul/li[1]/a"))
				.getAttribute("class");
		assertEquals("icn-rows active", getChannelsLinkState);
	}

	/**
	 * Method Name: assertActiveSHOWSLink Description: This is method is to
	 * ensure SHOWS link is Active.
	 * 
	 * Lekshmi : As the Shows link functionality is removed from the Watchable
	 * application, the assertion is not refactoring.
	 */
	public void assertActiveSHOWSLink() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);

		String getShowsLinkState = driver.findElement(
				By.xpath(XpathObjectRepo.CHANNEL_DETAILS_SHOWS_LINK_XPATH))
				.getAttribute("class");
		assertEquals("icn-rows active", getShowsLinkState);

	}

	/**
	 * Method Name: assertActiveVIDEOSLink Description: This is method is to
	 * ensure VIDEOS link is Active.
	 * 
	 * Lekshmi : As the Videos link functionality is removed from the Watchable
	 * application, the assertion is not refactoring.
	 */
	public void assertActiveVIDEOSLink() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);
		String getRowsLinkState = driver
				.findElement(
						By.xpath("//*[@id='content-wrap']/article/section/article/div/header/nav[2]/ul/li[1]/a"))
				.getAttribute("class");
		assertEquals("", getRowsLinkState);

		String getShowsLinkState = driver
				.findElement(
						By.xpath("//*[@id='content-wrap']/article/section/article/div/header/nav[2]/ul/li[2]/a"))
				.getAttribute("class");
		assertEquals("", getShowsLinkState);

		String getVideoLinkState = driver
				.findElement(
						By.xpath("//*[@id='content-wrap']/article/section/article/div/header/nav[2]/ul/li[3]/a"))
				.getAttribute("class");
		assertEquals("icn-tile-wide active", getVideoLinkState);
	}

	/**
	 * Method Name: assertSubscriptionsROWSActiveLink Description: This is
	 * method is to ensure Shows link is Active in Subscription page.
	 * 
	 * Lekshmi : As the Rows link functionality is removed from the Watchable
	 * application, the assertion is not refactoring.
	 */
	public void assertSubscriptionsROWSActiveLink()
			throws XPathExpressionException, ParserConfigurationException,
			SAXException, IOException, InterruptedException {
		Thread.sleep(sleepTime);
		String getShowsLinkState = driver
				.findElement(
						By.xpath("//*[@id='content-wrap']/article/section/article/div/div/header/div/nav/ul/li[1]/a"))
				.getAttribute("class");

		assertEquals("icn-rows active", getShowsLinkState);

	}

	/**
	 * Method Name: assertFooterLogo Description: This is method asserts Footer
	 * Logo and it's Text
	 **/
	public void assertFooterLogo() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {

		assertTrue(driver.findElement(
				By.xpath(XpathObjectRepo.FOOTERLOGOIMAGE_XPATH)).isDisplayed());

	}

	/**
	 * Method Name: assertSignUpActiveLink Description: This is method is to
	 * ensure Sign Up is Active page.
	 * 
	 * @throws Exception
	 */
	public void assertSignUpActiveLink() throws Exception {
		Thread.sleep(sleepTime);
		String getHomePageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HOME_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HOME button is not active",
				UILablesRepo.TOPMENU_HOMEINACTIVECLASS, getHomePageState);

		String getSubscriptionPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_MYCHANNELS_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("MY CAHNNELS button is not active",
				UILablesRepo.TOPMENU_MYCHANNELSCLASS, getSubscriptionPageState);

		String getHelpPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HELP_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HELP button is not active",
				UILablesRepo.TOPMENU_HELPCLASS, getHelpPageState);

		String getSignUpPageState = driver.findElement(
				By.xpath(XpathObjectRepo.SIGNUP_ACTIVE_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals(UILablesRepo.SIGNUP_ACTIVE_BUTTON_TEXT, getSignUpPageState);
	}

	/**
	 * Method Name: assertWelcomeToGazeeboBanner Description: This is method
	 * asserts Welcome to Gazeebo Banner.
	 * 
	 * Lekshmi : As the Gazeebo banner is removed from the Watchable
	 * application, the assertion is not refactoring.
	 */
	public void assertWelcomeToGazeeboBanner() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);
		String WelcomeToGazeeboLogo = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[1]/div/section/div/div/ul[1]/li/article/div[1]/a/div/img"))
				.getAttribute("alt");
		assertEquals("gazeebo logo", WelcomeToGazeeboLogo);

		String welcomeTxt = driver
				.findElement(
						By.xpath("//*[@id='banner']/div/div[1]/div/section/div/div/ul[1]/li/article/div[2]/a/div[1]"))
				.getText();
		assertEquals("Welcome", welcomeTxt);

		String GazeeboTxt = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[1]/div/section/div/div/ul[1]/li/article/div[2]/a/div[2]/span[1]"))
				.getText();
		assertEquals("Watchable.", GazeeboTxt);

		String BestVideoTxt = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[1]/div/section/div/div/ul[1]/li/article/div[2]/a/div[2]/span[2]"))
				.getText();
		assertEquals("Best videos ever!", BestVideoTxt);

		String FindYourFavoriteTxt = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[1]/div/section/div/div/ul[1]/li/article/div[2]/a/div[3]"))
				.getText();
		assertEquals("Find your favorite videos on Watchable",
				FindYourFavoriteTxt);
	}

	/**
	 * Method Name: assertGettingStartedGazeeboBanner Description: This is
	 * method asserts Getting Started Gazeebo Banner.
	 * 
	 * Lekshmi : As the Getting Started Gazeebo banner is removed from the
	 * Watchable application, the assertion is not refactoring.
	 */
	public void assertGettingStartedGazeeboBanner()
			throws XPathExpressionException, ParserConfigurationException,
			SAXException, IOException, InterruptedException {
		Thread.sleep(sleepTime);
		String JoinGazeeboBannerLineOneTxt = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[1]/div/section/div/div/ul[1]/li/article/div[2]/a/div[1]"))
				.getText();
		String toAllLineTwoTxt = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[1]/div/section/div/div/ul[1]/li/article/div[2]/a/div[2]"))
				.getText();
		assertEquals("Join Watchable and get full access",
				JoinGazeeboBannerLineOneTxt);
		assertEquals("to all the site's features. It is easy and free.",
				toAllLineTwoTxt);
	}

	/**
	 * Method Name: assertJoinGazeeboBanner Description: This is method asserts
	 * Join Gazeebo Log in/SignUp/Subscriptions page Banner.
	 **/
	public void assertJoinWatchableBanner() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		String LoginpageHeader = driver.findElement(
				By.xpath(XpathObjectRepo.JOIN_WATCHABLE_XPATH)).getText();
		assertEquals(UILablesRepo.JOIN_WATCHABLE_HEADER, LoginpageHeader);
	}

	/**
	 * Method Name: assertGazeeboOniPadAndTVBanner Description: This is method
	 * asserts Gazeebo On iPad and TV Gazeeno Banner.
	 * 
	 * Lekshmi : As the Gazeebo on iPad and TV banner is removed from the
	 * Watchable application, the assertion is not refactoring.
	 */
	public void assertGazeeboOniPadAndTVBanner()
			throws XPathExpressionException, ParserConfigurationException,
			SAXException, IOException, InterruptedException {
		Thread.sleep(sleepTime);
		String WelcomeToGazeeboLogo = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[1]/div/section/div/div/ul[1]/li/article/div[1]/a/div/img"))
				.getAttribute("alt");
		assertEquals("gazeebo logo", WelcomeToGazeeboLogo);

		String JoinGazeeboBannerLineOneTxt = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[1]/div/section/div/div/ul[1]/li/article/div[2]/a/div[1]"))
				.getText();
		String toAllLineTwoTxt = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[1]/div/section/div/div/ul[1]/li/article/div[2]/a/div[2]"))
				.getText();
		assertEquals("Join Watchable and get full access",
				JoinGazeeboBannerLineOneTxt);
		assertEquals("to all the site's features. It is easy and free.",
				toAllLineTwoTxt);
	}

	/**
	 * Method Name: assertGazeeboTopMiddleMenu Description: This is method
	 * asserts Watchable Top Middle Menu. //Uncomment once this features is
	 * implemented back.
	 * 
	 * Lekshmi : As the Gazeebo Top Middle Menu is removed from the Watchable
	 * application, the assertion is not refactoring.
	 */
	public void assertGazeeboTopMiddleMenu() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		String GazeeboTopMiddleMenu = driver.findElement(
				By.xpath("//*[@id='topmiddle_menu']/div")).getText();
		assertEquals("Welcome to Watchable!", GazeeboTopMiddleMenu);

		// Assert links to ensure its not visible.
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Welcome to Watchable[\\s\\S]*$"));
		assertFalse(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Getting Started[\\s\\S]*$"));
		assertFalse(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Watchable on IPad and TV[\\s\\S]*$"));
	}

	/**
	 * Method Name: assertLoginActiveLink Description: This is method is to
	 * ensure Login is Active page.
	 * 
	 * @throws Exception
	 */
	public void assertLoginActiveLink() throws Exception {
		Thread.sleep(sleepTime);
		String getHomePageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HOME_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HOME button is not active",
				UILablesRepo.TOPMENU_HOMEINACTIVECLASS, getHomePageState);

		String getSubscriptionPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_MYCHANNELS_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("MY CAHNNELS button is not active",
				UILablesRepo.TOPMENU_MYCHANNELSCLASS, getSubscriptionPageState);

		String getHelpPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HELP_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("HELP button is not active",
				UILablesRepo.TOPMENU_HELPCLASS, getHelpPageState);

		String getSignUpPageState = driver.findElement(
				By.xpath(XpathObjectRepo.SIGNUP_INACTIVE_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals(UILablesRepo.SIGNUP_INACTIVE_BUTTON_TEXT,
				getSignUpPageState);

		if (!driver.findElement(By.xpath(XpathObjectRepo.TOPMENULOGIN_XPATH))
				.getAttribute("class").contains("active")) {
			driver.findElement(By.xpath(XpathObjectRepo.TOPMENULOGIN_XPATH))
					.click();

		}

		String getLoginPageState = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_LOGIN_BUTTON_XPATH))
				.getAttribute("class");
		assertEquals("LOGIN button is not active",
				UILablesRepo.LOGIN_ACTIVE_BUTTON_TEXT, getLoginPageState);
	}

	/**
	 * Method Name: assertAllHeaderLink Description: This is method is to ensure
	 * All Header links are displayed.
	 * 
	 * @throws Exception
	 */
	public void assertAllHeaderLink() throws Exception {
		Thread.sleep(sleepTime);
		String getHomeLink = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HOME_BUTTON_XPATH)).getText();
		assertEquals(UILablesRepo.TOPMENU_HOME, getHomeLink);

		String getSubscriptionLink = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_MYCHANNELS_BUTTON_XPATH))
				.getText();
		assertEquals(UILablesRepo.TOPMENU_MYCHANNELS, getSubscriptionLink);

		String getHelpLink = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HELP_BUTTON_XPATH)).getText();
		assertEquals(UILablesRepo.TOPMENU_HELP, getHelpLink);

		String getLoginLink = driver.findElement(
				By.xpath(XpathObjectRepo.TOPMENULOGIN_XPATH)).getText();
		assertEquals(UILablesRepo.TOPMENU_LOGIN, getLoginLink);

		String getSignUpLink = driver.findElement(
				By.xpath(XpathObjectRepo.SIGNUP_INACTIVE_BUTTON_XPATH))
				.getText();
		assertEquals(UILablesRepo.TOPMENU_SIGNUP, getSignUpLink);
	}

	/**
	 * Method Name: assertAllHeaderLinkAfterLogin Description: This is method is
	 * to ensure All Header links are displayed After login to Application.
	 * 
	 * @throws Exception
	 */
	public void assertAllHeaderLinkAfterLogin() throws Exception {
		orProUtil.load(new FileInputStream(new File("com/OR.properties")));
		Thread.sleep(sleepTime);

		String getHomeLink = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HOME_BUTTON_XPATH)).getText();
		assertEquals(UILablesRepo.TOPMENU_HOME, getHomeLink);

		String getSubscriptionLink = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_MYCHANNELS_BUTTON_XPATH))
				.getText();
		assertEquals(UILablesRepo.TOPMENU_MYCHANNELS, getSubscriptionLink);

		String getHelpLink = driver.findElement(
				By.xpath(XpathObjectRepo.TOP_MENU_HELP_BUTTON_XPATH)).getText();
		assertEquals(UILablesRepo.TOPMENU_HELP, getHelpLink);

		driver.findElement(By.xpath(XpathObjectRepo.TOPMENUDOWNARROW_XPATH))
				.click();
		Thread.sleep(sleepTime);
		String logOut = driver.findElement(
				By.xpath(XpathObjectRepo.LOGOUT_XPATH)).getText();
		assertEquals(UILablesRepo.LOGOUT, logOut);

		driver.findElement(By.xpath(XpathObjectRepo.TOPMENUUPARROW_XPATH))
				.click();
	}

	/**
	 * Method Name: assertHeaderLinksWithoutLogin Description: This is method is
	 * to ensure All Header links are displayed After login to Application.
	 * 
	 * @throws Exception
	 */

	// Lekshmi Added
	public void assertHeaderLinksWithoutLogin() throws Exception {
		orProUtil.load(new FileInputStream(new File("com/OR.properties")));
		Thread.sleep(sleepTime);

		String getPlaylistsLink = driver.findElement(
				By.xpath(XpathObjectRepo.playLists_XPATH)).getText();
		assertEquals("Playlists menu is not present in Header section",
				UILablesRepo.TOPMENU_PLAYLISTS, getPlaylistsLink);
		log.info("Playlists menu is present in Header section");

		//All Shows Menu removed now
		/*String getAllChannelsLink = driver.findElement(
				By.xpath(XpathObjectRepo.allChannelsMenu_XPATH)).getText();
		assertEquals("All Shows menu is not present in Header section",
				UILablesRepo.TOPMENU_ALLCHANNELS, getAllChannelsLink);
		log.info("All Shows menu is present in Header section");*/

		String getSubscriptionLink = driver.findElement(
				By.xpath(XpathObjectRepo.myWatchlistMenu_XPATH)).getText();
		assertEquals("My Shows menu is not present in Header section",
				UILablesRepo.TOPMENU_MYWATCHLIST, getSubscriptionLink);
		log.info("My Shows menu is present in Header section");

		String getLogInLink = driver.findElement(
				By.xpath(XpathObjectRepo.loginMenu_XPATH)).getText();
		assertEquals("Login menu is not present in Header section",
				UILablesRepo.TOPMENU_LOGIN_TEXT, getLogInLink);
		log.info("Login menu is present in Header section");

		String getSignUpLink = driver.findElement(
				By.xpath(XpathObjectRepo.signUpMenu_XPATH)).getText();
		assertEquals("Sign Up menu is not present in Header section",
				UILablesRepo.TOPMENU_SIGNUP_TEXT, getSignUpLink);
		log.info("Sign Up menu is present in Header section");

	}

	/**
	 * Method Name: assertWelcomeToGazeeboActiveLink Description: This is method
	 * is to ensure Welcome To Gazeebo link is Active.
	 * 
	 * @throws Exception
	 * 
	 *             Lekshmi : As the Welcome to Gazeebo is removed from the
	 *             Watchable application, the assertion is not refactoring.
	 */
	public void assertWelcomeToGazeeboActiveLink() throws Exception {
		String getWelcomeToGazeeboLinkState = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[2]/header/nav/ul/li[1]/a"))
				.getAttribute("class");
		assertEquals("icn-rows active", getWelcomeToGazeeboLinkState);

		String getGettingStartedLinkState = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[2]/header/nav/ul/li[2]/a"))
				.getAttribute("class");
		assertEquals("icn-tile", getGettingStartedLinkState);

		String getGazeeboOniPadAndTVLinkState = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[2]/header/nav/ul/li[3]/a"))
				.getAttribute("class");
		assertEquals("icn-tile-wide", getGazeeboOniPadAndTVLinkState);
	}

	/**
	 * Method Name: assertGettingStartedActiveLink Description: This is method
	 * is to ensure assert Getting Started Active Link.
	 * 
	 * @throws Exception
	 * 
	 *             Lekshmi : As the Getting Started is removed from the
	 *             Watchable application, the assertion is not refactoring.
	 */
	public void assertGettingStartedActiveLink() throws Exception {
		String getWelcomeToGazeeboLinkState = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[2]/header/nav/ul/li[1]/a"))
				.getAttribute("class");
		assertEquals("icn-rows", getWelcomeToGazeeboLinkState);

		String getGettingStartedLinkState = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[2]/header/nav/ul/li[2]/a"))
				.getAttribute("class");
		assertEquals("icn-tile active", getGettingStartedLinkState);

		String getGazeeboOniPadAndTVLinkState = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[2]/header/nav/ul/li[3]/a"))
				.getAttribute("class");
		assertEquals("icn-tile-wide", getGazeeboOniPadAndTVLinkState);
	}

	/**
	 * Method Name: assertGazeeboOniPadAndTVActiveLink Description: This is
	 * method is to ensure assert Gazeebo On iPad And TV Active Link.
	 * 
	 * @throws Exception
	 * 
	 *             Lekshmi : As the Gazeebo on iPad and TV is removed from the
	 *             Watchable application, the assertion is not refactoring.
	 */
	public void assertGazeeboOniPadAndTVActiveLink() throws Exception {
		String getWelcomeToGazeeboLinkState = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[2]/header/nav/ul/li[1]/a"))
				.getAttribute("class");
		assertEquals("icn-rows", getWelcomeToGazeeboLinkState);

		String getGettingStartedLinkState = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[2]/header/nav/ul/li[2]/a"))
				.getAttribute("class");
		assertEquals("icn-tile", getGettingStartedLinkState);

		String getGazeeboOniPadAndTVLinkState = driver
				.findElement(
						By.xpath(".//*[@id='banner']/div/div[2]/header/nav/ul/li[3]/a"))
				.getAttribute("class");
		assertEquals("icn-tile-wide active", getGazeeboOniPadAndTVLinkState);
	}

	/**
	 * Method Name: assertCategoryHeadersAfterLogin Description: This is method
	 * is to ensure assert Category Headers After Login
	 * 
	 * @throws Exception
	 */
	public void assertCategoryHeadersAfterLogin() throws Exception {

		Thread.sleep(sleepTime);
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.YOUAREWATCHINGHEADERLABEL_XPATH))
				.getText().matches(UILablesRepo.HOMEPAGE_YOUAREWATCHING));
		Thread.sleep(sleepTime);
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.HOMEFEATUREDCONTAINERLABEL_XPATH))
				.getText().matches(UILablesRepo.HOMEPAGE_FEATURED));
		Thread.sleep(sleepTime);
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.HOMEPOPULARSHOWSTITLELABEL_XPATH))
				.getText().matches(UILablesRepo.HOMEPAGE_POPULARSHOWS));
		Thread.sleep(sleepTime);
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.HOMEPOPULARCHANNELSTITLELABEL_XPATH))
				.getText().matches(UILablesRepo.HOMEPAGE_FEATUREDCHANNELS));
	}

	/**
	 * Method Name: assertChannelDetailsPageLinks Description: This is method is
	 * to ensure SHOWS, UNWATCHED and LAST UPDATED links are present.
	 * 
	 * @throws Exception
	 */
	public void assertChannelDetailsPageLinks() throws Exception {
		Thread.sleep(5000);
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.PUBLISHERPAGE_CHANNELSHEADER_XPATH))
				.getText()
				.matches(UILablesRepo.CHHANNEL_DETAILPAGE_SHOWSLINK_XPATH));

	}

	/**
	 * Method Name: assertMyChannelsPageLinks Description: This is method is to
	 * ensure CHANNELS, CATEGORIES, UNWATCHED and LAST UPDATED links are present
	 * in My Channels page.
	 * 
	 * @throws Exception
	 */
	public void assertMyChannelsPageLinks() throws Exception {
		Thread.sleep(sleepTime);

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.MYCHANNELS_CHANNELS_TITLE_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.MYCHANNELS_CHANNELS_TITLE_TEXT));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.MYCHANNELS_CATEGORIES_TITLE_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.MYCHANNELS_CATEGORIES_TITLE_TEXT));
	}

	/**
	 * Method Name: assertPMLinks Description: This is method is to assert all
	 * Profile Management Links.
	 */
	public void assertPMLinks() throws XPathExpressionException,
			ParserConfigurationException, SAXException, IOException,
			InterruptedException {
		Thread.sleep(sleepTime);

		driver.findElement(By.xpath(XpathObjectRepo.USERNAME_TOPMENU_XPATH))
				.click();

		Thread.sleep(sleepTime);

		String Account = driver.findElement(
				By.xpath(XpathObjectRepo.ACCOUNT_TOPMENU_XPATH)).getText();
		assertEquals("Account", Account);

		String logOut = driver.findElement(
				By.xpath(XpathObjectRepo.LOGOUT_XPATH)).getText();
		assertEquals("Log Out", logOut);
	}

	/**
	 * Method Name: assertGenresSectionLinks Description: This is method is to
	 * ensure CATEGORIES, CHANNELS and LAST UPDATED links are present in genres
	 * section.
	 * 
	 * @throws Exception
	 */
	public void assertGenresSectionLinks() throws Exception {
		Thread.sleep(sleepTime);
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.HOMEPAGE_GENRES_SHOWS_HEADER_XPATH))
				.getText().equalsIgnoreCase("SHOWS"));

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.HOMEGENRESCHNNLHEADERLABEL_XPATH))
				.getText().equalsIgnoreCase("CHANNELS"));

	}

	/**
	 * Method Name: assertUpNextTitle Description: This is method is to assert
	 * Up Next Title.
	 */
	public void assertUpNextTitle() throws Exception {
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.VIDEOPAGEYOUAREWATCHINGTITLE_XPATH))
				.getText().matches(UILablesRepo.HOMEPAGE_YOUAREWATCHING));
	}

	/**
	 * Method Name: assertNotWatchingTitle Description: This is method is to
	 * ensure Watching Title is not present on Home page.
	 * 
	 * Lekshmi : As the Watching is removed from the Watchable application, the
	 * assertion is not refactoring.
	 */
	public void assertNotWatchingTitle() throws Exception {
		assertFalse(driver.findElement(By.cssSelector("BODY")).getText()
				.matches("^[\\s\\S]*Watching[\\s\\S]*$"));
	}

	/**
	 * Method Name: assertFeaturedTitle Description: This is method is to assert
	 * featured Title.
	 */
	public static void assertFeaturedTitle() throws Exception {
		Thread.sleep(sleepTime);

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.featuredSectionTitle_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.HOMEPAGE_FEATURED_VIDEOS));

		log.info("Video Section title '"
				+ UILablesRepo.HOMEPAGE_FEATURED_VIDEOS
				+ "' is present in Home Page");
	}
	
	
	/**
	 * Method Name: assertFeaturedPlaylistsTitle Description: This is method is to assert
	 * featured Playlists Title.
	 */
	public void assertFeaturedPlaylistsTitle() throws Exception {
		Thread.sleep(sleepTime);
		
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.playlistsSectionTitle_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.HOMEPAGE_PLAYLISTS_VIDEOS));

		log.info("The featured video Section title '"
				+ UILablesRepo.HOMEPAGE_PLAYLISTS_VIDEOS
				+ "' is present in Home Page");

		
	}
	

	/**
	 * Method Name: assertPopularChannelsTitle Description: This is method is to
	 * assert Popular Channels Header Title.
	 */
	public void assertPopularChannelsTitle() throws Exception {
		Thread.sleep(sleepTime);

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.featuredChannelsTitle_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.HOMEPAGE_FEATUREDCHANNELS));
		log.info("The featured Setion title '"
				+ UILablesRepo.HOMEPAGE_FEATUREDCHANNELS
				+ "' is present  in Home Page");
	}

	/**
	 * Method Name: assertFeaturedChannelsTitle Description: This is method is
	 * to assert Featured Channels Header Title.
	 */
	public static void assertFeaturedChannelsTitle() throws Exception {
		Thread.sleep(sleepTime);

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.featuredChannelsTitle_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.HOMEPAGE_FEATUREDCHANNELS));
		log.info("The shows Section title '"
				+ UILablesRepo.HOMEPAGE_FEATUREDCHANNELS
				+ "' is present  in Home Page");
	}

	/**
	 * Method Name: assertGenreChannelsTitle Description: This is method is to
	 * assert Genre Channels Header Title.
	 */
	public void assertGenreChannelsTitle() throws Exception {
		Thread.sleep(sleepTime);
		
		driver
		.findElement(By.xpath(XpathObjectRepo.featuredChannelsTitle_XPATH)) // 
		.getText();
		
		

		assertTrue(driver
				.findElement(By.xpath(XpathObjectRepo.featuredChannelsTitle_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.HOMEPAGE_CHANNELS_BY_GENRE));
		log.info("The Genre Channel Section title '"
				+ UILablesRepo.HOMEPAGE_CHANNELS_BY_GENRE
				+ "' is present  in Shows by genre Page");
	}

	/**
	 * Method Name: assertPopularShowsTitle Description: This is method is to
	 * assert Popular Shows Header Title.
	 */
	public void assertPopularShowsTitle() throws Exception {
		Thread.sleep(sleepTime);
		// Lekshmi : Change the object identifier

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.HOMEPOPULARSHOWSTITLELABEL_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.HOMEPAGE_POPULARSHOWS));
	}

	/**
	 * Method Name: assertRegistreationPageDetails Description: This is method
	 * is to ensure all labels are present in Registration page.
	 * 
	 * @throws Exception
	 */
	public void assertRegistreationPageDetails() throws Exception {
		Thread.sleep(sleepTime);
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.SIGNUPFORM_EMAIL_HEADER_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.SIGNUPFORM_EMAIL_HEADER));

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.SIGNUPFORM_PASSWD_HEADER_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.SIGNUPFORM_PASSWD_HEADER));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.SIGNUPFORM_CONFPASSWD_HEADER_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.SIGNUPFORM_CONFPASSWD_HEADER));
		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.SIGNUPFORM_ZIP_HEADER_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.SIGNUPFORM_ZIP_HEADER));

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.SIGNUPFORM_CAPTCHA_IMAGE_HEADER_XPATH))
				.getText()
				.equalsIgnoreCase(UILablesRepo.SIGNUPFORM_CAPTCHA_IMAGE_HEADER));

		assertTrue(driver
				.findElement(
						By.xpath(XpathObjectRepo.SIGNUPFORM_TERMSCONDITIONS_HEDAER_XPATH))
				.getText()
				.equalsIgnoreCase(
						UILablesRepo.SIGNUPFORM_TERMSCONDITIONS_HEDAER));
		assertTrue(driver
				.findElement(By.xpath(XpathObjectRepo.LOGINBUTTON_XPATH))
				.getText().equalsIgnoreCase(UILablesRepo.JOINNOW));
	}
}
