package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardPageTestCases {
		
		private WebDriver driver;
		private DashboardPage DashboardPageVariable; // Create an instance of Dashboard page
		
		
	
		@BeforeTest
		public void setup() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			DashboardPageVariable = new DashboardPage(driver);
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
		
		
		@Test(priority=0)
		public void TestCaseVerifyTitle() {
			String Expected_Title = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
			String Actual_Title = driver.getTitle();
			Assert.assertEquals(Actual_Title, Expected_Title);
			
		}
		
		
		@Test(priority=2)
		public void TestCaseClickOnCarousalLeftButton() throws InterruptedException {
			for (int i = 1; i <= 7; i++) {
				  System.out.println(i);
				  DashboardPageVariable.clickOnCarousalLeftButton();
				  Thread.sleep(1000);
			}
		}
		
		@Test(priority=3)
		public void TestCaseClickOnCarousalRightButton() throws InterruptedException {
			for (int i = 1; i <= 7; i++) {
				  System.out.println(i);
				  DashboardPageVariable.clickOnCarousalRightButton();
				  Thread.sleep(1000);
			}
		}
		
		@Test(priority = 4)
		public void TestCaseClickOnCarousalBanner() throws InterruptedException {
			DashboardPageVariable.clickOnCarousalBanner();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
		}
		
		@Test(priority = 5)
		public void TestCaseClickOnHamburgerMenuButton() throws InterruptedException {
			DashboardPageVariable.clickOnHamburgerMenuButton();
			Thread.sleep(2000);
			DashboardPageVariable.hamMenuCloseButton();
			Thread.sleep(2000);
		}
		
		@Test(priority = 6)
		public void TestCaseSearchForProduct() throws InterruptedException {
			DashboardPageVariable.clickOnSearchBar("iphone 15 pro max");
			Thread.sleep(3000);
			DashboardPageVariable.clickOnFirstOption();
			Thread.sleep(2000);
			DashboardPageVariable.scrollToPaginationButton();
			Thread.sleep(4000);	
			WebElement firstProduct = driver.findElement(By.xpath("(//img[@class='s-image'])[1]"));
			firstProduct.click();
			Thread.sleep(2000);
		}
		
		@Test(priority = 7)
		public void TestCaseAmazonLogo() {
			DashboardPageVariable.clickLogo();
			String url_expected = "https://www.amazon.in/ref=nav_logo";
			String url_actual = driver.getCurrentUrl();
			Assert.assertEquals(url_actual, url_expected);
			Assert.assertTrue(DashboardPageVariable.amazonLogo.isDisplayed());
			System.out.println(DashboardPageVariable.amazonLogo.isDisplayed());
		}
		
		@Test(priority = 8)
		public void TestCaseEnterCurrentPinCode() throws InterruptedException {
			DashboardPageVariable.location.click();
			Thread.sleep(3000);
			DashboardPageVariable.pincode.sendKeys("560029");
			Thread.sleep(3000);
			DashboardPageVariable.apply.click();
			Thread.sleep(2000);
		}
		
		
		@AfterTest
		public void teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}
}
