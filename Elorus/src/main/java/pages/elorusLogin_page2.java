package pages;
/*POM class for sigin page*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elorusLogin_page2 {
	/*identifies username*/
	@FindBy(id="id_email")
	 private WebElement tbUsername;
	
	/*identifies password*/
	@FindBy(name="password")
	 private  WebElement tbPassword;
	
	/*identifies sigin */
	@FindBy(xpath="//input[@value='SIGN IN']")
	 private WebElement btnSignIn;
	
	/*methad to enter the usernamw*/
	public void setUsername(String un) {
		this.tbUsername.sendKeys(un);
	}
	
	/*methad to enter the password*/
	public void setPassword(String pw) {
		this.tbPassword.sendKeys(pw);
	}
	
	/*methad to enter the password*/
	public void clickSignIn() {
		this.btnSignIn.click();;
	}

	/*constructors*/
	public elorusLogin_page2(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
}
