package com.qa.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.constant.Constant;

public class Elementutil {
	WebDriver driver;

	public Elementutil(WebDriver driver) {
		this.driver = driver;
	}

//login method
	public void doSendkey(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
//login test method	
	public void doSendkeyTest(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	

//click methods
	public void doClick(WebElement element) {
		element.click();
	}

//Action class method 
	public void doClickAction(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();

	}

//WebElement wait methods
	public void waitforVisibleElement(String path) {
		WebDriverWait wait = new WebDriverWait(driver, Constant.timeout);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path)));

	}

//drop down Text methods
	public void selectDropdownByText(WebElement checkboxElement, String string) {

		Select b = new Select(checkboxElement);
		b.selectByVisibleText(string);

	}

//drop down Value method 
	public void selectDropdownByValue(WebElement element, String string) {
		Select d = new Select(element);
		d.selectByValue(string);

	}

//drop down by index
	public void selectDropdownByIndex(WebElement element, int value) {
		Select f = new Select(element);
		f.selectByIndex(value);

	}

	public void waitforElementTitle(String check) {
		WebDriverWait wait = new WebDriverWait(driver, Constant.timeout);
		wait.until(ExpectedConditions.titleIs(check));
	}

	public void waitforVisibleWebElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Constant.timeout);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
