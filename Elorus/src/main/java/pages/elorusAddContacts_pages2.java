package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elorusAddContacts_pages2 {
	/* identifies firstname */
	@FindBy(name = "first_name")
	private WebElement tbFirstName;

	/* identifies lastname */
	@FindBy(name = "last_name")
	private WebElement tbLastName;

	/* identifies company */
	@FindBy(name = "company")
	private WebElement tbCompany;

	/* identifies profession */
	@FindBy(name = "profession")
	private WebElement tbProfession;

	/* identifies save */
	@FindBy(xpath = "//span[text()='Save']/parent::a")
	private WebElement btnSave;

	/* methad to enter firstname */
	public void setFirstName(String fn) {
		this.tbFirstName.sendKeys(fn);
	}

	/* methad to enters Lastname */
	public void setLastName(String ln) {
		this.tbLastName.sendKeys(ln);
	}

	/* methad to Click on Company */
	public void setCompany(String com) {
		this.tbCompany.sendKeys(com);
	}

	/* methad to Click on profesiion */
	public void setProfession(String pro) {
		this.tbProfession.sendKeys(pro);
	}

	/* methad to Click on profesiion */
	public void clickSave() {
		this.btnSave.click();
	}

	/* constructors */
	public elorusAddContacts_pages2(WebDriver driver) {
		/* initializes the webElements */
		PageFactory.initElements(driver, this);
	}
}
