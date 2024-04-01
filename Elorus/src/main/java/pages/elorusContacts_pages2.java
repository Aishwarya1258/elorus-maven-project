package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*POM class for contacts page*/
public class elorusContacts_pages2 {
	/*identifies add button*/
	@FindBy(xpath="//div[@id='add-contact-tool']")
	 private WebElement btnAdd;
	
	/*identifies add import button*/
	@FindBy(xpath="//div[@class='btn btn-default']")
	 private  WebElement btnImport;
	
	/* methad to Click add button*/
	public void clickAdd() {
		this.btnAdd.click();
	}
	
	/* methad to Click Import button*/
	public void clickImport() {
		this.btnImport .click();
	}

	/*constructors*/
	public elorusContacts_pages2(WebDriver driver) {
		/*initialises the webElements*/
		PageFactory.initElements(driver,this);
	}
}
