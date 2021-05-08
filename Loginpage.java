package com.qa.page;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Elementutil;

public class Loginpage {
	WebDriver driver;
	Elementutil eleutil;
	@FindBy(id = "loginform-username")
	private WebElement usernamefld;
	@FindBy(id = "loginform-password")
	private WebElement passwordfld;
	@FindBy(name = "login-button")
	private WebElement submitbtn;
	/// test
	@FindBy(id = "passwordresetrequestform-email")
	private WebElement emailbox;

	@FindBy(xpath = "	//*[@id=\"login-form\"]/div[4]/a")
	private WebElement reset;
	
	@FindBy(xpath = "//button[@class='btn btn-default']")
	private WebElement emailsendButton;

	@FindBy(xpath = "//*[@id=\"request-password-reset-form\"]/div[2]/a")
	private WebElement emailcancelButton;
	
	@FindBy(xpath = "//*[@id=\"loginform-rememberme\"]")
	private WebElement rcheckbox;
	@FindBy(xpath = "//a[@href='#']")
	private WebElement profile;
	@FindBy(xpath = "//a[@class='logout-btn']")
	private WebElement signout;

	public Loginpage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);

	}

	public void doLogin(String username, String password)

	{

		eleutil.doSendkey(usernamefld, username);
		eleutil.doSendkey(passwordfld, password);
		eleutil.doClick(submitbtn);

	}

	public void doLoginTest(String username, String password) throws Exception

	{

		boolean usernamefld1 = usernamefld.isDisplayed();
		if (usernamefld1 == true) {
			System.out.println(" usernamefld displayed");
		}
		boolean passwordfld1 = passwordfld.isDisplayed();
		if (passwordfld1 == true) {
			System.out.println(" passwordfld1 displayed");
		}
        reset.click();
		boolean eboxStaus = emailbox.isDisplayed();
		if (eboxStaus == true) {
			System.out.println("ebox displayed");
		}

		boolean emailsendButtonStatus = emailsendButton.isDisplayed();
		if (emailsendButtonStatus == true) {
			System.out.println(" ebuttonStaus displayed");
		}

		boolean emailcancelButton1 = emailcancelButton.isDisplayed();
		if (emailcancelButton1 == true) {
			System.out.println(" emailcancelButton1 displayed");
		}
		emailcancelButton.click();

		Thread.sleep(2000);
		boolean rcheckbox1 = rcheckbox.isDisplayed();
		if (rcheckbox1 == true) {
			System.out.println(" remember checkbox default tick displayed");
			rcheckbox.click();
		}
		eleutil.doSendkey(usernamefld, username);
		eleutil.doSendkey(passwordfld, password);
		eleutil.doClick(submitbtn);
		/*
		 * Alert al=driver.switchTo().alert(); String alertMessage=al.getText();
		 * System.out.println("alert message==="+alertMessage); al.accept();
		 */
		Thread.sleep(2000);
		eleutil.doClickAction(profile);

		eleutil.doClick(signout);

		System.out.println(" Login Page Test completed and do other functions");

	}

}
