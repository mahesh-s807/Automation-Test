package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.CreateClientpage;
import com.qa.page.Loginpage;
import com.qa.utility.Elementutil;

public class CreateClientTest extends BaseTest {

	@Test(priority = 1)
	public void verifyLogin() {
		Loginpage p1 = new Loginpage(driver);
		p1.doLogin(Constant.username, Constant.password);
		String Title = "Payroll Application";
		System.out.println("shami==" + Title);
		eleutil.waitforElementTitle(Title);
		String actualtitle = driver.getTitle();
		System.out.println("value clientPage===" + actualtitle);
		Assert.assertEquals(actualtitle, Constant.expectedtitle, "Title matched ");
		System.out.println("I am inCreateClientTestt" + Thread.currentThread().getId());
	}

	@Test(priority = 2)

	public void client() throws Exception {
		CreateClientpage cp = new CreateClientpage(driver);
		cp.doClientCreateTest();
		String actualtitle = cp.doClientCreate();
		System.out.println("value clientPage===" + actualtitle);
		String expectedtitle = "Clients";
		Assert.assertEquals(actualtitle, expectedtitle, "Title matched ");
		System.out.println("I am inCreateClientTestt" + Thread.currentThread().getId());

	}
}
