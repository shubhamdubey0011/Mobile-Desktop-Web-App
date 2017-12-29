package comcast.test.app.testCases.follow.followFunctions;

import comcast.test.config.configServices.utils.BaseTest;
import org.openqa.selenium.By;
import comcast.test.app.common.XpathObjectRepo;

public class FollowFun extends BaseTest {

	/**
	 * Method Name: clickOnFollowButtonFromChannelPage Description: This method
	 * used click On follow button from channel detail page 
	 * 
	 * @throwsdException
	 */
	public static void clickOnFollowButton() throws Exception {

		// click On follow button

		driver.findElement(By.xpath(XpathObjectRepo.followButton_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked on follow button");

	}
	
	/**
	 * Method Name: clickOnFollowButtonFromChannelPage Description: This method
	 * used click On follow button from video detail page 
	 * 
	 * @throwsdException
	 */
	public static void clickOnVideoFollowButton() throws Exception {

		// click On follow button

		driver.findElement(By.xpath(XpathObjectRepo.followVideoPageButton_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked on follow button");

	}

	/**
	 * Method Name: clickOnUnFollowButton Description: This method used click On
	 * un follow button from channel detail page 
	 * 
	 * @throwsdException
	 */
	public static void clickOnUnFollowButton() throws Exception {

		// click On un follow button

		driver.findElement(By.xpath(XpathObjectRepo.unFollowButton_XPATH))
				.click();
		log.info("Successfully clicked on un follow button");
		Thread.sleep(sleepTime);

	}
	
	
	/**
	 * Method Name: clickOnUnFollowButton Description: This method used click On
	 * un follow button from video page 
	 * 
	 * @throwsdException
	 */
	public static void clickOnVideoUnFollowButton() throws Exception {

		// click On un follow button

		driver.findElement(By.xpath(XpathObjectRepo.followVideoPageButton_XPATH))
				.click();
		log.info("Successfully clicked on un follow button");
		Thread.sleep(sleepTime);

	}
	
	
	/**
	 * Method Name: clickOnShowTitle Description: This method used click On
	 * Show title from My Shows page
	 * 
	 * @throwsdException
	 */
	public static void clickOnShowTitle() throws Exception {

		// click On show title

		driver
		.findElement(
				By.xpath(XpathObjectRepo.myWatchlistChannelTitlePartOne_XPATH
						+ 0
						+ XpathObjectRepo.myWatchlistChannelTitlePartTwo_XPATH))
				.click();
		
		log.info("Successfully clicked on First show title from My Shows Page");
		Thread.sleep(LessSleepTime);

	}

	/**
	 * Method Name: clickOnCancelButton Description: This method used click On
	 * cancel button from Un-follow confirmation pop up message
	 * 
	 * @throwsdException
	 */
	public static void clickOnCancelButton() throws Exception {

		// click On cancel button

		driver.findElement(By.xpath(XpathObjectRepo.unFollowCancelButton_XPATH))
				.click();

		Thread.sleep(sleepTime);
		log.info("Successfully clicked on cancel button");

	}

	/**
	 * Method Name: clickOnCancelButton Description: This method used click On
	 * confirm button from Un-follow confirmation pop up message
	 * 
	 * @throwsdException
	 */
	public static void clickOnConfirmButton() throws Exception {

		// click On cancel button

		driver.findElement(
				By.xpath(XpathObjectRepo.unFollowConfirmButton_XPATH)).click();
		Thread.sleep(sleepTime);
		log.info("Successfully clicked on confirm button");

	}

}