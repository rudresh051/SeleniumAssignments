package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.DashboardPage;
import pageObjects.ProductListingPage;

public class ProductListingPageTestCases extends BaseTest {

	private DashboardPage DashboardPageVariable;
	private ProductListingPage ProductListingPageVariable;

	@BeforeClass
	public void setUp() {
		initializeDriver();
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
			wait.until(ExpectedConditions.urlContains("iphone"));
			String expected_text1 = "iphone 15";
			String actual_text1 = ProductListingPageVariable.firstProduct1.getText();
			if(actual_text1.toLowerCase().contains(expected_text1.toLowerCase())) {
				System.out.println("First product is accurately fetched");
			}else {
				System.out.println("First product is not accurately fetched");
			}
			Thread.sleep(4000);
			ProductListingPageVariable.clickOnAppleCheckbox();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
			e.printStackTrace();
			Assert.fail("Test case failed due to an exception: " + e.getMessage());
		}
	}
	

}
