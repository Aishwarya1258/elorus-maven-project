package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import generic.basetest;
import generic.webActionUtil;

public class signInScript extends basetest {

	@Test
	public void signInScript() {
		/* creats an object to initialize the pages */
		pages.initialisePages pages = new pages.initialisePages(driver);
		/* enters the username */
		pages.elorusLogin.setUsername(data.getProperty("username"));
		/* enters the password */
		pages.elorusLogin.setPassword(data.getProperty("password"));
		/* clicks on sigin */
		pages.elorusLogin.clickSignIn();
		/* validation the login */
		actionUtil.validateTitle("Elorus");
		driver.quit();

	}
}
