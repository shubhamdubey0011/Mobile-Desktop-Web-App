package comcast.test.app.testCases.misc;

import org.junit.Test;
import comcast.test.app.common.UILablesRepo;
import comcast.test.app.common.AssertionRepo.common.AssertionRepoFunctions;
import comcast.test.config.configServices.utils.BaseTest;

/**
 * Class Name: VerifyErrorPageTitle Description: This test case verifies title
 * of the error page. 
 * Author: Manoj
 **/

public class VerifyErrorPageTitle extends BaseTest {

	AssertionRepoFunctions assertionFunction = new AssertionRepoFunctions();

	@Test
	public void testVerifyErrorPageTitle() throws Exception {

		try {

			log.info("Script: VerifyErrorPageTitle");
			log.info("***************************");

			// Navigate to the Error page (Page Not Found)
			driver.get(UILablesRepo.PAGENOTFOUNDURL);
			Thread.sleep(sleepTime);

			// Verify Error page (Page Not Found) displayed
			AssertionRepoFunctions.assertErrorPageTitle();

			// Verify error page title
			log.info("The Error page title displayed is '" + driver.getTitle()
					+ "'");

			log.info("");

		} catch (Throwable t) {
			captureScreenshot();
			collector.addError(t);
		}
	}
}