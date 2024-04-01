package dataproviders;

import org.testng.annotations.DataProvider;

import generic.basetest;
import generic.webActionUtil;

public class elorusDataProvider {
	@DataProvider
	public Object[] demoData() {
		Object[] data = { "sam", 100, 25.5f, '$' };
		return data;
	}

	@DataProvider
	public Object[][] fbLoginData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Abhi";
		data[0][1] = "12345";
		data[1][0] = "sam";
		data[1][1] = "4567";
		data[2][0] = "Thamanna";
		data[2][1] = "789";
		return data;
	}

	@DataProvider
	public Object[][] elorusContactData() throws Throwable {
		Object[][] data = new Object[1][6];
		data[0][0] = webActionUtil.getdata(basetest.ExcelPath, "eloruslogin", 1, 0);
		data[0][1] = webActionUtil.getdata(basetest.ExcelPath, "eloruslogin", 1, 1);
		data[0][2] = webActionUtil.getdata(basetest.ExcelPath, "elorusAddContact", 1, 0);
		data[0][3] = webActionUtil.getdata(basetest.ExcelPath, "elorusAddContact", 1, 1);
		data[0][4] = webActionUtil.getdata(basetest.ExcelPath, "elorusAddContact", 1, 2);
		data[0][5] = webActionUtil.getdata(basetest.ExcelPath, "elorusAddContact", 1, 3);
		return data;
	}
}
