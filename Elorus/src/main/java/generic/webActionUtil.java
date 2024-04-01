package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webActionUtil {

	WebDriver driver;

	/* program to read the data from excel */
	public static String getdata(String excellocation, String sheetname, int r, int c) {
		try {

			FileInputStream f1 = new FileInputStream(excellocation);
			Workbook book = WorkbookFactory.create(f1);
			String data = book.getSheet(sheetname).getRow(r).getCell(c).getStringCellValue();
			return data;
		} catch (Exception e) {
			return null;
		}
	}

	/* method to capture screenshot */
	public void capturescreenshot(String scriptName) {

		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);

		/* creates file class object pointing towards physical file */
		File dest = new File(basetest.UserDir + "\\screenshot\\" + scriptName + ".png");

		/* copies content from src to dest */
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
		/* close the browser */
		driver.quit();
	}

	/* method to validate title */
	public void validateTitle(String expectedTitle) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs(expectedTitle));
			System.out.println("pass:title is matching");
		} catch (Exception e) {
			System.out.println("fail:title is not matching");
			Assert.fail();
		}
	}

	/* method to validate visibility of webelement */
	public void validateElementVisibility(WebElement element)

	{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("pass:element is visible");
		} catch (Exception e) {
			System.out.println("fail:element is not visible");
			Assert.fail();
		}
	}

}
