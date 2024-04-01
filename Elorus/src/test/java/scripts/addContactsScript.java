package scripts;

import org.testng.annotations.Test;

import dataproviders.elorusDataProvider;
import generic.basetest;
import pages.initialisePages;

public class addContactsScript extends basetest {
	@Test(dataProviderClass = elorusDataProvider.class, dataProvider = "elorusContactData")
	public void addContactsScript(String un, String pw, String fn, String ln, String comp, String prof) {
		/* creats an object to initialize the pages */
		initialisePages pages = new initialisePages(driver);
		/* enters the username */
		pages.elorusLogin.setUsername(un);
		/* enters the password */
		pages.elorusLogin.setPassword(pw);
		/* clicks on sigin */
		pages.elorusLogin.clickSignIn();
		/* clicks on contacts */
		pages.elorusHome.clickContacts();
		/* clicks on addbutton */
		pages.elorusContacts.clickAdd();
		/* enters the firstname */
		pages.elorusAddContacts.setFirstName(fn);
		/* enters the lastname */
		pages.elorusAddContacts.setLastName(ln);
		/* enters the companyname */
		pages.elorusAddContacts.setCompany(comp);
		/* enters the profession */
		pages.elorusAddContacts.setProfession(prof);
		/* click on save */
		pages.elorusAddContacts.clickSave();
		driver.quit();
	}
}
