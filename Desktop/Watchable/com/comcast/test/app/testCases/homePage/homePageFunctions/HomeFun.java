package comcast.test.app.testCases.homePage.homePageFunctions;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.commonFunctions.CommonFun;
import comcast.test.config.configServices.utils.BaseTest;

public class HomeFun extends BaseTest {

	/**
	 * Method Name: clickOnFirstChannelLink Description: This method used click
	 * On First Channel Link from FEATURED CHANNELS
	 * 
	 * @throwsdException
	 */
	public static void clickOnFirstChannelLink() throws Exception {

		// click On First show Link from Watchable SHOWS OF THE WEEK
		driver.findElement(
				By.xpath(XpathObjectRepo.featuredFirstChannelTitle_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked On First show Link from Watchable SHOWS OF THE WEEK section");

		// Verify successfully navigate to channel details page

		assertTrue(
				"Failed to navigate to show details page",
				CommonFun.isElementPresent(
						driver,
						By.xpath(XpathObjectRepo.channelPageVideoSectionTitle_XPATH)));
		log.info("Successfully navigate to show details page");

	}

	/**
	 * Method Name: clickOnFirstGenreChannelLink Description: This method used
	 * click On First Channel Link from CHANNELS BY GENRE
	 * 
	 * @throwsdException
	 */
	public static void clickOnFirstGenreChannelLink() throws Exception {

		// click On First Channel Link from CHANNELS BY GENRE

		String channelTitle = driver.findElement(
				By.xpath(XpathObjectRepo.genreCategoryFirstChannelTitle_XPATH))
				.getText();

		driver.findElement(
				By.xpath(XpathObjectRepo.genreCategoryFirstChannelTitle_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked On First Channel '" + channelTitle
				+ "' from CHANNELS BY GENRE section");

		// Verify successfully navigate to show details page

		assertTrue(
				"Failed to navigate to show details page",
				CommonFun.isElementPresent(
						driver,
						By.xpath(XpathObjectRepo.channelPageVideoSectionTitle_XPATH)));
		log.info("Successfully navigate to show details page");

	}

	/**
	 * Method Name: clickOnTopWatchableLogo Description: This method used click
	 * On Top Watchable Logo from any page
	 * 
	 * @throwsdException
	 */
	public static void clickOnTopWatchableLogo() throws Exception {

		// click On Top Watchable Logo

		driver.findElement(By.xpath(XpathObjectRepo.watchableTopLogo_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked On Top Watchable Logo");

	}

	/**
	 * Method Name: clickOnBottomWatchableLogo Description: This method used
	 * click On Bottom Watchable Logo from any page
	 * 
	 * @throwsdException
	 */
	public static void clickOnBottomWatchableLogo() throws Exception {

		// click On footer Watchable Logo

		driver.findElement(By.xpath(XpathObjectRepo.footerwatchableLogo_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked On footer Watchable Logo");

	}
	
	
	
	/**
	 * Method Name: clickOnBottomWatchableLogo Description: This method used
	 * click On captcha Anchor button
	 * 
	 * @throwsdException
	 */
	public static void clickOnCaptchaAnchorButton() throws Exception {

		// click On captcha Anchor button 

		/*driver.findElement(By.id(XpathObjectRepo.recaptchaAnchorButton_ID))
				.click();*/
		/*driver.findElement(By.xpath(XpathObjectRepo.recaptchaAnchorButton_XPATH))
		.click();*/
		
		 CommonFun.mouseOverElementAndClick(driver, driver.findElement(By
		 .id(XpathObjectRepo.recaptchaAnchorButton_ID)), "Captcha Button");

		
		Thread.sleep(sleepTime);
		log.info("Successfully clicked On captcha Anchor button");
		Thread.sleep(sleepTime);

	}
	
	
	/**
	 * Method Name: clickOnCaptchaPrivacyLink Description: This method used
	 * click On captcha Privacy Link
	 * 
	 * @throwsdException
	 */
	public static void clickOnCaptchaPrivacyLink() throws Exception {

		// click On captcha Privacy Link
		
		CommonFun.mouseOverElement(driver, driver.findElement(By
				.xpath(XpathObjectRepo.recaptchaPrivacyLink_XPATH)));
		
		driver.findElement(By.xpath(XpathObjectRepo.recaptchaPrivacyLink_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked On captcha Privacy Link");
		Thread.sleep(sleepTime);

	}
	
	
	/**
	 * Method Name: clickOnCaptchaTermsLink Description: This method used
	 * click On captcha Terms Link
	 * 
	 * @throwsdException
	 */
	public static void clickOnCaptchaTermsLink() throws Exception {

		// click On captcha Terms Link

		driver.findElement(By.xpath(XpathObjectRepo.recaptchaTermsLink_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked On captcha Terms Link");
		Thread.sleep(sleepTime);

	}


	
	/**
	 * Method Name: clickOnSearchButton Description: This method
	 * used to click on search icon
	 * 
	 */
	public static void clickOnSearchButton()
			throws Exception {

		// Click on search icon to make search text box visible
		driver.findElement(By.xpath(XpathObjectRepo.searchButton_XPATH))
				.click();
		log.info("Successfully clicked on Search icon");

		CommonFun.mouseOverElement(driver, driver.findElement(By
				.xpath(XpathObjectRepo.searchButton_XPATH)));

	}
	
	
	

	/**
	 * Method Name: clickOnMoreShowsButton Description: This method
	 * used to click on More shows button
	 * 
	 */
	public static void clickOnMoreShowsButton()
			throws Exception {

		// Click on  More shows button
		driver.findElement(By.xpath(XpathObjectRepo.featuredShowsMoreShowsButton_XPATH))
				.click();
		log.info("Successfully clicked on  More shows button");
		
		Thread.sleep(sleepTime);

		

	}
	
	
	
	/**
	 * Method Name: clickOnFaceBookButton Description: This method
	 * used to click on face book  button
	 * 
	 */
	public static void clickOnFaceBookButton()
			throws Exception {

		// Click on  face book sharing  button
		
		CommonFun.mouseOverElement(driver, driver.findElement(By
				.xpath(XpathObjectRepo.homePageFaceBookButton_XPATH)));
		
		driver.findElement(By.xpath(XpathObjectRepo.homePageFaceBookButton_XPATH))
				.click();
		log.info("Successfully clicked on face book sharing button");
		
		Thread.sleep(sleepTime);

		

	}
	
	/**
	 * Method Name: clickOnTwitterButton Description: This method
	 * used to click on twitter  button 
	 * 
	 */
	public static void clickOnTwitterButton()
			throws Exception {

		// Click on  twitter sharing  button
		
		CommonFun.mouseOverElement(driver, driver.findElement(By
				.xpath(XpathObjectRepo.homePageTwitterButton_XPATH)));
		
		driver.findElement(By.xpath(XpathObjectRepo.homePageTwitterButton_XPATH))
				.click();
		log.info("Successfully clicked on twitter sharing button");
		
		Thread.sleep(sleepTime);

		

	}
	
	
	/**
	 * Method Name: clickOnInstagramButton Description: This method
	 * used to click on Instagram  button 
	 * 
	 */
	public static void clickOnInstagramButton()
			throws Exception {

		// Click on  Instagram sharing  button
		
		CommonFun.mouseOverElement(driver, driver.findElement(By
				.xpath(XpathObjectRepo.homePageInstagramButton_XPATH)));
		
		driver.findElement(By.xpath(XpathObjectRepo.homePageInstagramButton_XPATH))
				.click();
		log.info("Successfully clicked on Instagram sharing button");
		
		Thread.sleep(sleepTime);

		

	}
	
	
}
