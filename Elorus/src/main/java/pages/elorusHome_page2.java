package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*POM class for Home page*/
public class elorusHome_page2 {
	/* identifies invoices */
	@FindBy(xpath = "//a[@title='Invoices']")
	private WebElement lnkInvoices;

	/* identifies expenses */
	@FindBy(xpath = "//a[@title='Expenses']")
	private WebElement lnkExpenses;

	/* identifies time */
	@FindBy(xpath = "//a[@title='Time']")
	private WebElement lnkTime;

	/* identifies contacts */
	@FindBy(xpath = "//a[@title='Contacts']")
	private WebElement lnkContacts;

	/* identifies estimates */
	@FindBy(xpath = "//a[@title='Estimates']")
	private WebElement lnkEstimates;

	/* identifies user menu */
	@FindBy(xpath = "//a[@title='User menu']")
	private WebElement lnkUserMenu;

	/* identifies logout */
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement btnLogout;

	/* methad to enter the invoices */
	public void clickInvoices() {
		this.lnkInvoices.click();
	}

	/* methad to enter the expenses */
	public void clickExpenses() {
		this.lnkExpenses.click();
	}

	/* methad to enter the time */
	public void clickTime() {
		this.lnkTime.click();
	}

	/* methad to enter the contacts */
	public void clickContacts() {
		this.lnkContacts.click();
	}

	/* methad to enter the Estimates */
	public void clickEstimates() {
		this.lnkEstimates.click();
	}

	/* methad to enter the Menu */
	public void clickUserMenu() {
		this.lnkUserMenu.click();
	}

	/* methad to enter the time */
	public void clicklogout() {
		this.btnLogout.click();
	}

	/* constructors */
	public elorusHome_page2(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
}
