package com.qa.page;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.utility.Elementutil;

public class CreateClientpage {

	WebDriver driver;
	Elementutil eleutil;

	@FindBy(xpath = "//div[@class='row']//li//a[text()='Clients']") // client path
	private WebElement client;

	@FindBy(xpath = "//div[@class='row']//li//a[text()='Create Client']") // create client path
	private WebElement create;

	@FindBy(xpath = "//div[@class='row']//li//a[text()='Home']") // home
	private WebElement home;

	@FindBy(xpath = "//div[@class='row']//li//a[text()='Clients'] ") // client path
	private WebElement client12;

	@FindBy(xpath = " //*[@id=\"w1\"]/table/tbody/tr/td[6]/a[1]/span") // view
	private WebElement v;

	@FindBy(xpath = "//div[@class='row']//li//a[text()='Clients']  ") // view
	private WebElement clientx;

	@FindBy(id = "client-invoice_contact") // client invoice field
	private WebElement clientInvoice;

	@FindBy(id = "client-phone") // clientPhone
	private WebElement clientPhone;

	@FindBy(id = "client-client_address") // client-client_address
	private WebElement clientAddress;

	@FindBy(id = "client-fax") // client-fax
	private WebElement clientFax;

	@FindBy(id = "client-settilement_days") // client-settilement_days
	private WebElement clientDays;

	@FindBy(id = "client-email") // clientPhone
	private WebElement clientEmail;

	@FindBy(id = "clientsearch-client_name") // clientPhone
	private WebElement clientSearchName1;

	@FindBy(xpath = "//button[@class='btn btn-success']") // submitButton
	private WebElement submitLast;

	@FindBy(xpath = "//*[@id=\"client-your_ref\"]") // client-your_ref
	private WebElement clientref;

	@FindBy(id = "client-client_name") // client-client_name
	private WebElement clientName;

	@FindBy(id = "client-postcode") // client-postcode
	private WebElement clientPostcode;

	@FindBy(id = "client-company_reg") // client-company_reg
	private WebElement clientReg;

	@FindBy(xpath = "//*[@id=\"w0\"]/div[3]/button[1]") // submitButton
	private WebElement submitButton;

	@FindBy(id = "clientsearch-client_name") // clientsearch-client_name
	private WebElement clientSearchName2;

	@FindBy(xpath = "//*[@id=\"w0\"]/div[3]/button[1]") // subButton
	private WebElement subButton;
	/// drop down check///
	@FindBy(id = "client-branch_id") // client-branch_id
	private WebElement branch;

	@FindBy(id = "client-invoice_order") // client-invoice_id
	private WebElement invoiceDrop;
	@FindBy(id = "client-division_id") // client-division_id
	private WebElement divisionDrop;

	@FindBy(id = "client-invoice_delivery_method") // client-division_id
	private WebElement dinvoiceDrop;

	@FindBy(id = "client-master_document") // client-master_document
	private WebElement md;

	@FindBy(id = "client-vat_rate") // client-vat_rate
	private WebElement vat;

	@FindBy(xpath = "//input[@id='client-require_po']") // checkbox
	private WebElement clientReqDrop;

	public CreateClientpage(WebDriver driver) {
		this.driver = driver;
		eleutil = new Elementutil(driver);
		PageFactory.initElements(driver, this);
	}

	public String doClientCreate() throws Exception {

		String elementPath = "//div[@class='row']//li//a[text()='Clients']";
		eleutil.waitforVisibleElement(elementPath);
		eleutil.doClickAction(client);// client method
		String elementPath2 = " //div[@class='row']//li//a[text()='Create Client']";
		eleutil.waitforVisibleElement(elementPath2);
		eleutil.doClickAction(create);// client create method
//branch drop down
		eleutil.selectDropdownByText(branch, "Alpha_new");
		String elementPath3 = "//*[@id=\"client-your_ref\"]";
		eleutil.waitforVisibleElement(elementPath3);
		String clientrname = "fahad";
		eleutil.doSendkey(clientref, clientrname);
///invoice drop down
		eleutil.selectDropdownByText(invoiceDrop, "Single timesheet per client");
//division dropdown
		eleutil.selectDropdownByValue(divisionDrop, "1");
		String clientInvoicename = "shami2 the complete man";
		eleutil.doSendkey(clientInvoice, clientInvoicename);
////dm invoice drop
		eleutil.selectDropdownByValue(dinvoiceDrop, "Electronic");
		String elementPath4 = "//*[@id=\"client-client_name\"]";
		eleutil.waitforVisibleElement(elementPath4);
		String clientName1 = "dq2";
		eleutil.doSendkey(clientName, clientName1);
		String clientPhone1 = "dq2";
		eleutil.doSendkey(clientPhone, clientPhone1);
//drop down
		eleutil.selectDropdownByIndex(md, 1);
		String elementPath5 = "//*[@id=\"client-client_address\"]";
		eleutil.waitforVisibleElement(elementPath5);
		String clientAddress1 = "dq2";
		eleutil.doSendkey(clientAddress, clientAddress1);
		String clientFax1 = "22552255";
		eleutil.doSendkey(clientFax, clientFax1);
		String clientDays1 = "15";
		eleutil.doSendkey(clientDays, clientDays1);
		String clientEmail1 = "shami @gmail.com";
		eleutil.doSendkey(clientEmail, clientEmail1);
		String elementPath6 = "//*[@id=\"client-postcode\"]";
		eleutil.waitforVisibleElement(elementPath6);
		String clientPostcode1 = "shami @gmail.com";
		eleutil.doSendkey(clientPostcode, clientPostcode1);
		String elementPath7 = "//*[@id=\"client-company_reg\"]";
		eleutil.waitforVisibleElement(elementPath7);
		String clientReg1 = "shami @gmail.com";
		eleutil.doSendkey(clientReg, clientReg1);
//drop down
		eleutil.selectDropdownByText(vat, "VAT 5.00%");
//check box
		clientReqDrop.click();
///save button
		submitLast.submit();
/////home
		String elementPath8 = "//div[@class='row']//li//a[text()='Home']";
		eleutil.waitforVisibleElement(elementPath8);
		eleutil.doClick(home);// home method
		String elementPath9 = "//div[@class='row']//li//a[text()='Clients']";
		eleutil.waitforVisibleElement(elementPath9);
		eleutil.doClick(client12);// client method
		String clientSearchName11 = "dq2";
		eleutil.doSendkey(clientSearchName1, clientSearchName11);
		String elementPath10 = "//*[@id=\"w0\"]/div[3]/button[1]";
		eleutil.waitforVisibleElement(elementPath10);
		submitButton.submit();
		String elementPath11 = " //*[@id=\"w1\"]/table/tbody/tr/td[6]/a[1]/span";
		eleutil.waitforVisibleElement(elementPath11);
		eleutil.doClick(v);// client view method
		System.out.println("client verified");
		String elementPath12 = "//div[@class='row']//li//a[text()='Clients']";
		eleutil.waitforVisibleElement(elementPath12);
		eleutil.doClick(clientx);// client click
		String clientSearchName111 = "dq2";
		eleutil.doSendkey(clientSearchName1, clientSearchName111);
		String elementPath14 = "//*[@id=\"w0\"]/div[3]/button[1]";
		eleutil.waitforVisibleElement(elementPath14);
		eleutil.doClick(subButton);// subButton click
		subButton.submit();
		String actualtitle = driver.getTitle();
		System.out.println("exit create client page");
//update check
		return actualtitle;

	}

	public void doClientCreateTest() {
		String elementPath = "//div[@class='row']//li//a[text()='Clients']";
		eleutil.waitforVisibleElement(elementPath);
		eleutil.doClickAction(client);// client method
		String elementPath2 = " //div[@class='row']//li//a[text()='Create Client']";
		eleutil.waitforVisibleElement(elementPath2);
		eleutil.doClickAction(create);// client create method
		// branch drop down

		boolean branchdropDown = branch.isDisplayed();
		if (branchdropDown == true) {
			System.out.println(" branchdropDown displayed");

		}
		Select n = new Select(branch);
		WebElement firstselectedOptionb = n.getFirstSelectedOption();
		System.out.println("firstselectedOptionb===" + firstselectedOptionb.getText());
		List<WebElement> branchdroptext = n.getOptions();
		for (WebElement branchtext : branchdroptext) {
			String branchText = branchtext.getText();
			System.out.println("branchTextvalue===" + branchText);
		}
		eleutil.selectDropdownByText(branch, "Alpha_new");
		///// end///
		/// invoice drop down
		boolean invoicedropDown = invoiceDrop.isDisplayed();
		if (invoicedropDown == true) {
			System.out.println("  invoicedropDown displayed");

		}
		Select n1 = new Select(invoiceDrop);
		WebElement firstselectedOptioninvoiceDrop = n.getFirstSelectedOption();
		System.out.println(" firstselectedOptioninvoiceDrop===" + firstselectedOptioninvoiceDrop.getText());
		List<WebElement> invoiceDroptext = n1.getOptions();
		for (WebElement invoiceDroptext1 : invoiceDroptext) {
			System.out.println(invoiceDroptext1.getText());
			/*
			 * String invoiceDroptext1t=invoiceDroptext1.getText();
			 * System.out.println("invoiceDropTextvalue==="+invoiceDroptext1t);
			 */
		}

		eleutil.selectDropdownByText(invoiceDrop, "Single timesheet per client");
		/////////
		boolean divisionDrop1 = divisionDrop.isDisplayed();
		if (divisionDrop1 == true) {
			System.out.println("  divisionDrop displayed");

		}
		eleutil.selectDropdownByValue(divisionDrop, "1");
		boolean clientInvoice1 = clientInvoice.isDisplayed();
		if (clientInvoice1 == true) {
			System.out.println("  clientInvoice displayed");

		}
		String clientInvoicename = "shami2 the complete man";
		eleutil.doSendkey(clientInvoice, clientInvoicename);
		//
		//// dm invoice drop

		boolean dinvoiceDrop1 = dinvoiceDrop.isDisplayed();
		if (dinvoiceDrop1 == true) {
			System.out.println(" dinvoiceDrop displayed");

		}
		eleutil.selectDropdownByValue(dinvoiceDrop, "Electronic");
		boolean clientName11 = clientName.isDisplayed();
		if (clientName11 == true) {
			System.out.println(" clientName displayed");

		}
		String clientName1 = "dq2";
		eleutil.doSendkey(clientName, clientName1);

		boolean clientPhone11 = clientPhone.isDisplayed();
		if (clientPhone11 == true) {
			System.out.println(" clientPhone displayed");

		}
		String clientPhone1 = "dq2";
		eleutil.doSendkey(clientPhone, clientPhone1);

		/// bulk
		// drop down
		boolean md1 = md.isDisplayed();
		if (md1 == true) {
			System.out.println(" mdDrop displayed");

		}

		eleutil.selectDropdownByIndex(md, 1);
		boolean clientAddress11 = clientAddress.isDisplayed();
		if (clientAddress11 == true) {
			System.out.println(" clientAddress displayed");

		}

		String clientAddress1 = "dq2";
		eleutil.doSendkey(clientAddress, clientAddress1);

		boolean clientFax111 = clientFax.isDisplayed();
		if (clientFax111 == true) {
			System.out.println(" clientFax displayed");
		}

		boolean clientDays11 = clientDays.isDisplayed();
		if (clientDays11 == true) {
			System.out.println(" clientDays displayed");

		}

		String clientDays1 = "15";
		eleutil.doSendkey(clientDays, clientDays1);
		boolean clientEmail11 = clientEmail.isDisplayed();
		if (clientEmail11 == true) {
			System.out.println(" clientEmail displayed");

		}

		String clientEmail1 = "shami @gmail.com";
		eleutil.doSendkey(clientEmail, clientEmail1);
		boolean clientPostcode111 = clientPostcode.isDisplayed();
		if (clientPostcode111 == true) {
			System.out.println(" clientPostcode displayed");

		}

		String clientPostcode1 = "shami @gmail.com";
		eleutil.doSendkey(clientPostcode, clientPostcode1);

		boolean clientReg111 = clientReg.isDisplayed();
		if (clientReg111 == true) {
			System.out.println(" clientReg displayed");

		}

		String clientReg1 = "shami @gmail.com";
		eleutil.doSendkey(clientReg, clientReg1);

		// drop down

		boolean vat1 = vat.isDisplayed();
		if (vat1 == true) {
			System.out.println(" vatdDrop displayed");

		}
		eleutil.selectDropdownByText(vat, "VAT 5.00%");
		// check box
		boolean clientReqDrop1 = clientReqDrop.isDisplayed();
		if (clientReqDrop1 == true) {
			System.out.println(" clientReqDrop displayed");

		}
		clientReqDrop.click();
		/// save button
		boolean submitLast1 = submitLast.isDisplayed();
		if (submitLast1 == true) {
			System.out.println(" submit button displayed");

		}
		submitLast.submit();
		String elementPath8 = "//div[@class='row']//li//a[text()='Home']";
		eleutil.waitforVisibleElement(elementPath8);
		eleutil.doClick(home);// home method
		String elementPath9 = "//div[@class='row']//li//a[text()='Clients']";
		eleutil.waitforVisibleElement(elementPath9);
		eleutil.doClick(client12);// client method

	}

}
