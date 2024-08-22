package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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
	
	@Test(priority = 25)
	public void TestCaseSortProduct() {
		try {
			DashboardPageVariable.clickLogo();
			Thread.sleep(3000);
			DashboardPageVariable.clickOnSearchBar("iphone 15 pro max");
			Thread.sleep(3000);
			DashboardPageVariable.clickOnFirstOption();
			Thread.sleep(2000);
//			ProductListingPageVariable.sortingDropdown.click();
//			Thread.sleep(3000);
			// Select Low to High
			Select sel1 = new Select(ProductListingPageVariable.sortingDropdown);
			sel1.selectByIndex(1);
			Thread.sleep(5000);
			
			// Select High to Low
			Select sel2 = new Select(ProductListingPageVariable.sortingDropdown);
			sel2.selectByIndex(2);
			Thread.sleep(5000);
			
			// Select Average Customer Review
			Select sel3 = new Select(ProductListingPageVariable.sortingDropdown);
			sel3.selectByIndex(3);
			Thread.sleep(5000);
			
			// Newest Arrivals
			Select sel4 = new Select(ProductListingPageVariable.sortingDropdown);
			sel3.selectByIndex(4);
			Thread.sleep(5000);
			
			// Best Sellers
			Select sel5 = new Select(ProductListingPageVariable.sortingDropdown);
			sel3.selectByIndex(5);
			Thread.sleep(5000);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
			e.printStackTrace();
			Assert.fail("Test case failed due to an exception: " + e.getMessage());
		}
	}

}
