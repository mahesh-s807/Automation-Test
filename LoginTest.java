package com.qa.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.page.Loginpage;
import com.qa.utility.ExcelRead;

public class LoginTest extends BaseTest {

	@Test(dataProvider = "loginData")
	public void verifyLogin(String username, String password) throws Exception {

		Loginpage p1 = new Loginpage(driver);

		p1.doLoginTest(username, password);
		p1.doLogin(username, password);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleIs("Login"));
		String actualtitle = driver.getTitle();
		String expectedtitle = "Login";
		Assert.assertEquals(actualtitle, expectedtitle, "Title verified ");
		System.out.println("I am in Login Test" + Thread.currentThread().getId());

	}

	@DataProvider
	public Object[][] loginData() throws InvalidFormatException, IOException {

		Object[][] data = ExcelRead.getDataFromExcel("D:\\excel\\payrolllogindata.xlsx", "Sheet1");
		return data;

	}

}
