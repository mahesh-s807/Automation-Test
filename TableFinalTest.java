package checkseleniumtestng;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TableFinalTest {
	WebDriver driver;

	@Test
	public void f() throws IOException {
		// To get column count of the table
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='dataTable']//thead//tr//th"));
		System.out.println("column count: " + columns.size());
		// To get row count of the table
		// List<WebElement>
		// rowslist=driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		List<WebElement> rowslist = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
		System.out.println("row count: " + rowslist.size());

		// To get cell data of the table 2nd row 3rd column
		WebElement cell = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[2]//td[3]"));
		String cellvalue = cell.getText();
		System.out.println("R2-C3 cell value: " + cellvalue);
		// To get cell data of the table 5th row 5th column
		WebElement cell5 = driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[5]//td[5]"));
		String cellvalue5 = cell5.getText();
		System.out.println("R5-C5 cell value: " + cellvalue5);

		int rsize = rowslist.size();
		int csize = columns.size();

		// To print all element in the table
		for (int i = 0; i < rsize; i++) {

			List<WebElement> celldata = rowslist.get(i).findElements(By.tagName("td"));
			/*
			 * for(WebElement t:celldata) { System.out.println("checkrow shami"); String
			 * checkrow=t.getText(); System.out.println(checkrow); }
			 */
			for (int j = 0; j < csize; j++) {

				String cellval = celldata.get(j).getText();
				System.out.print(" " + cellval);
			}
			System.out.println();
		}

	}

	@BeforeTest
	public void beforeTest() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();// launch the browser
		driver.manage().window().maximize(); // maximize the browser
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");// launch the url
		Thread.sleep(5000);
	}
}
