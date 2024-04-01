package generic;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class basetest {
	/* constants */
	public static final String UserDir = System.getProperty("user.dir");
	public static final String Chromekey = "webdriver.chrome.driver";
	public static final String Geckokey = "webdriver.gecko.driver";
	public static final String Edgekey = "webdriver.edge.driver";

	public static final String ChromeValue = UserDir + "\\drivers\\chromedriver.exe";
	public static final String GeckoValue = UserDir + "\\drivers\\geckodriver.exe";
	public static final String edgeValue = UserDir + "\\drivers\\msedgedriver.exe";
	public static final String ExcelPath = UserDir + "\\data\\MyExcel.xlsx";
	public static final String PropertyPath = UserDir + "\\data\\elorus.properties";

	public WebDriver driver;
	public  static Properties data;
	public static webActionUtil actionUtil;
	
	static
	{
	try
	{
		FileInputStream f = new FileInputStream(PropertyPath);
		data = new Properties();
		data.load(f);
	}catch (Exception e) {

	}
	}	
	/* sets the path for drivers */
	@BeforeClass
	public void setpath() {
		System.setProperty(Chromekey, ChromeValue);
		System.setProperty(Geckokey, GeckoValue);
		System.setProperty(Edgekey, edgeValue);
	}

	/* launches the browser */
	@Parameters("BrowserName")

	@BeforeMethod
	public void launchBrrowser(String BrName) {

		if (BrName.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (BrName.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (BrName.equals("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(data.getProperty("url"));
	}

	/* closes the browse */
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
		/*terminates the drivers from background*/
		@AfterSuite
		public void killDrivers() {
		try{
			Runtime.getRuntime().exec("taskkill /IM chromedriver.exe /F");
			Runtime.getRuntime().exec("taskkill /IM geckodriver.exe /F");
			Runtime.getRuntime().exec("taskkill /IM msedgedriver.exe /F");
		}
		catch (Exception e) {
		}
	}
}
