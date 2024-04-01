package pages;

import org.openqa.selenium.WebDriver;

public class initialisePages {
	public elorusLogin_page2 elorusLogin;
	public elorusHome_page2 elorusHome;
	public elorusContacts_pages2 elorusContacts;
	public elorusAddContacts_pages2 elorusAddContacts;

	public initialisePages(WebDriver driver) {
		this.elorusLogin = new elorusLogin_page2(driver);
		this.elorusHome = new elorusHome_page2(driver);
		this.elorusContacts = new elorusContacts_pages2(driver);
		this.elorusAddContacts = new elorusAddContacts_pages2(driver);
	}
}
