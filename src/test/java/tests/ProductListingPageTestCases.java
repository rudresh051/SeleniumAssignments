package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.DashboardPage;
import pageObjects.ProductListingPage;

public class ProductListingPageTestCases extends BaseTest {

	DashboardPage DashboardPageVariable;
	ProductListingPage ProductListingPageVariable;

	@BeforeTest
	public void setUp() {
		//		super.setUpSuite();
		DashboardPageVariable = new DashboardPage(driver);
		ProductListingPageVariable = new ProductListingPage(driver);
	}


	@Test(priority = 24)
	public void TestCaseProductFilter() throws InterruptedException{
		try {
			DashboardPageVariable.clickOnSearchBar("iphone 15 pro max");
			Thread.sleep(3000);
			DashboardPageVariable.clickOnFirstOption();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.urlContains("https://www.amazon.in/s?k=iphone"));
			String expected_text1 = "iphone 15";
			String actual_text1 = ProductListingPageVariable.firstProduct1.getText();
			if(actual_text1.contains(expected_text1)) {
				System.out.println("First product is accurately fetched");
			}else {
				System.out.println("First product is not accurately fetched");
			}
			ProductListingPageVariable.clickOnGetItByTomorrowCheckBox();
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
			e.printStackTrace();
			Assert.fail("Test case failed due to an exception: " + e.getMessage());
		}
	}

}
