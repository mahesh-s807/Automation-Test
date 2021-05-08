package com.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.utility.Elementutil;

public class BaseTest {
	WebDriver driver;
	Elementutil eleutil;

	@BeforeTest
	public void beforeTest() throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize(); // maximize the browser
		driver.get("https://www.qabible.in/payrollapp/");// launch the url
		eleutil = new Elementutil(driver);
	}
}
