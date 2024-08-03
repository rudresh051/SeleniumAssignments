package pages;

import org.openqa.selenium.WebDriver;
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
		
		
		@Test(priority=1)
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
		
		
		
		@AfterTest
		public void teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}
}
