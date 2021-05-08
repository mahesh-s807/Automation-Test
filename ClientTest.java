package com.qa.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.constant.Constant;
import com.qa.page.Clientpage;
import com.qa.page.Loginpage;

public class ClientTest extends BaseTest {
	@Test(priority = 1)
	public void verifyLogin() {
		Loginpage p1 = new Loginpage(driver);
		p1.doLogin(Constant.username, Constant.password);

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.titleIs("Payroll Application"));
		String actualtitle = driver.getTitle();
		System.out.println("value clientPage===" + actualtitle);
		String expectedtitle = "Payroll Application";
		Assert.assertEquals(actualtitle, expectedtitle, "Title matched ");
		System.out.println("I am inClientTestt" + Thread.currentThread().getId());
	}

	@Test(priority = 2)
	public void verifyClientSearch() throws Exception {
		Clientpage cp = new Clientpage(driver);
		cp.doClientTest();
		cp.doClientFunctionalTest();
		String actualtitle = cp.doSearchName();
		System.out.println("value clientPage===" + actualtitle);
		String expectedtitle = "Clients";
		Assert.assertEquals(actualtitle, expectedtitle, "Title matched ");
		System.out.println("I am inClientTestt" + Thread.currentThread().getId());

	}

	@Test(priority = 3)
	public void verifyClientUpdate() throws Exception {
		Clientpage cp = new Clientpage(driver);
		cp.doClientTest();
		String actualtitle = cp.doUpdateField();
		System.out.println("value clientPage===" + actualtitle);
		String expectedtitle = "Clients";
		Assert.assertEquals(actualtitle, expectedtitle, "Title matched ");
		System.out.println("I am inClientTestt" + Thread.currentThread().getId());

	}

	@Test(priority = 4)
	public void verifyClientView() throws Exception {
		Clientpage cp = new Clientpage(driver);
		cp.doClientTest();
		cp.doClientFunctionalTest();
		String actualtitle = cp.doViewField();
		System.out.println("value ViewField shami===" + actualtitle);
		String expectedtitle = "Clients";
		Assert.assertEquals(actualtitle, expectedtitle, "Title matched ");
		System.out.println("I am inClientTestt" + Thread.currentThread().getId());
	}
}
