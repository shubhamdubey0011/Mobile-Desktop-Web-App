package comcast.test.app.testCases.videoManagement.genres.categories.Series;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.openqa.selenium.By;

import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.XpathObjectRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.app.common.userManagement.userLogin.common.UserLoginFunctions;
import comcast.test.app.common.videoManagement.homePage.common.HomePageCommonFunctions;
import comcast.test.config.configServices.utils.BaseTest;
import comcast.test.config.configServices.utils.RestAPIServices;
import comcast.test.config.dataServices.registerToXidioApplicationAndChangeAPassword.RegisterToXidioApplicationAndChangeAPassword;
import comcast.test.config.dataServices.vo.VideoDetails;

/**
 * Class Name: VerifyShowsInNonProfitCategory Description: This test case
 * validates whether shows are displayed in Non Profit Category in Home page by
 * with/without logging into Watchable application.
 * **/

public class VerifyShowsInSeriesCategory extends BaseTest {

	RegisterToXidioApplicationAndChangeAPassword RegUserAndChangePass = new RegisterToXidioApplicationAndChangeAPassword();
	HomePageCommonFunctions homePageCommonFun = new HomePageCommonFunctions();
	UserLoginFunctions userLogin = new UserLoginFunctions();
	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testVerifyShowsInNonProfitCategory() throws Exception {

		Map<String, List<VideoDetails>> videoDetails = RestAPIServices
				.GenreCategoriesDetail(UILablesRepo.SERIES);
		List<VideoDetails> genresCategoryList = videoDetails
				.get("genresCategoriesList");
		List<VideoDetails> genreCategoriesShowsList = videoDetails
				.get("GenreCategoriesAllShowList");

		try {
			/*
			 * This Method is to register new user using Watchable application
			 * and to change a password.
			 */
			RegUserAndChangePass.RegisterToComcastAppAndChangePassword(driver);

			int loginError = driver
					.findElements(
							By.xpath(XpathObjectRepo.SIGNUPPAGE_INCORRECT_CREDENTIALS_MSG_XPATH))
					.size();

			if (loginError == 0) {

				// This method is to ensure Home is Active page before Login
				// into Application.
				// assertionFunction.assertHomeActiveLink();

				boolean categoryFound = false;
				int noOfCategoriesDisplayed = genresCategoryList.size();
				if (genresCategoryList != null && noOfCategoriesDisplayed > 0
						&& genreCategoriesShowsList != null) {
					for (VideoDetails genreCategories : genresCategoryList) {
						if (genreCategories.getTitle().equalsIgnoreCase(
								UILablesRepo.SERIES)) {
							for (int category = 1; category <= noOfCategoriesDisplayed; category++) {
								String getCategoryTitle = driver
										.findElement(
												By.xpath(XpathObjectRepo.HOMEPAGE_GENRES_SHOWS_TITLEHEADERLIST_XPATH
														+ category
														+ "]"
														+ XpathObjectRepo.HOMEPAGE_GENRES_SHOWS_TITLEHEADER_XPATH))
										.getText();
								if (getCategoryTitle
										.equalsIgnoreCase(UILablesRepo.SERIES)) {
									/*
									 * driver.findElement(By.xpath(
									 * ".//*[@id='genre']/div/div[2]/div["
									 * +category
									 * +"]/div/section/header/h1/a")).click();
									 * Thread.sleep(sleepTime);
									 * driver.navigate().back();
									 * Thread.sleep(sleepTime);
									 */

									categoryFound = true;
									if (genreCategoriesShowsList != null) {
										int loopMaxIndex = 0;
										if (genreCategoriesShowsList.size() < 4)
											loopMaxIndex = genreCategoriesShowsList
													.size();
										else
											loopMaxIndex = 4;

										int i = 0;
										for (int index = 0; index < loopMaxIndex; index++) {
											VideoDetails showList = genreCategoriesShowsList
													.get(index);
											int listIndex = genreCategoriesShowsList
													.indexOf(showList);
											for (; i <= listIndex; i++) {
												int j = (i % 5) + 1;
												assertEquals(
														showList.getTitle(),
														driver.findElement(
																By.xpath((XpathObjectRepo.HOMEPAGE_GENRES_SHOWS_TITLEHEADERLIST_XPATH
																		+ category
																		+ "]" + XpathObjectRepo.HOMEPAGE_GENRES_SHOWSLIST_XPATH)))
																.getText());

												driver.findElement(
														By.xpath(
																XpathObjectRepo.HOMEPAGE_GENRES_SHOWS_TITLEHEADERLIST_XPATH
																		+ category
																		+ "]"
																		+ XpathObjectRepo.HOMEPAGE_GENRES_SHOWSLIST_XPATH)
																.partialLinkText(
																		showList.getTitle()))
														.click();
												// driver.findElement(By.xpath(".//*[@id='genre']/div/div[2]/div["+category+"]/div/section/div/div/ul").partialLinkText(showList.getTitle())).click();

												Thread.sleep(sleepTime);
												assertTrue(driver
														.findElement(
																By.cssSelector("BODY"))
														.getText()
														.matches(
																showList.getTitle()));

												driver.navigate().back();
												Thread.sleep(sleepTime);

												for (int k = 0; k < (i + 1) / 5; k++) {
													String isNextEnable = driver
															.findElement(
																	By.xpath(XpathObjectRepo.HOMEPAGE_GENRES_SHOWS_TITLEHEADERLIST_XPATH
																			+ category
																			+ "]"
																			+ XpathObjectRepo.HOMEPAGE_GENRES_SHOWLIST_NEXTBTN_XPATH))
															.getText();
													if (!isNextEnable
															.equalsIgnoreCase(UILablesRepo.PAGINATIONNEXTHIDDEN_CLASS)
															&& !isNextEnable
																	.equalsIgnoreCase(UILablesRepo.PAGINATIONNEXTDISABLED_CLASS)) {
														driver.findElement(
																By.xpath((XpathObjectRepo.HOMEPAGE_GENRES_SHOWS_TITLEHEADERLIST_XPATH
																		+ category
																		+ "]" + XpathObjectRepo.HOMEPAGE_GENRES_SHOWLIST_NEXTBTN_XPATH)))
																.click();
														Thread.sleep(5000);
													}
												}
											}
										}
									}
								}
								if (categoryFound == true)
									break;
							}
							/*
							 * if(categoryFound==false)
							 * assertTrue(driver.findElement
							 * (By.cssSelector("BODY"
							 * )).getText().matches("^[\\s\\S]*"
							 * +orProUtil.getProperty
							 * ("ANIMATIONANDGAMES")+"[\\s\\S]*$"));
							 */
						}
						if (categoryFound == true)
							break;
					}
				}

				// This method is used to logout from Watchable Application.
				userLogin.LogOut(driver);
			}
			// This method is to ensure Login page is displayed when user Sign
			// Out from Application.
			// assertionFunction.assertLoginPageDetails();
		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}