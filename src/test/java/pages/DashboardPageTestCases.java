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
			DashboardPageVariable.applyPinCodeButton.click();
			Thread.sleep(2000);
		}
		
		@Test(priority = 9)
		public void TestCaseChangeWebsiteLanguage() throws InterruptedException {
			DashboardPageVariable.languageButton.click();
			Thread.sleep(3000);
			DashboardPageVariable.hindiRadioButton.click();
			Thread.sleep(3000);
			DashboardPageVariable.clickLogo();
			Thread.sleep(2000);
		}
		
		
		@Test(priority = 10)
		public void TestCaseSignInPage() throws InterruptedException {
			DashboardPageVariable.clickOnSignInButton();
			Thread.sleep(2000);
			String expected_url = "https://www.amazon.in/ap/signin";
			String actual_url = driver.getCurrentUrl();
			
			if(actual_url.contains(expected_url)) {
				System.out.println("Sign In URL is verified!");
			}
			else {
				System.out.println("Sign In URL verification failed!");
			}
			driver.navigate().back();
			Thread.sleep(2000);
			
		}
		
		@Test(priority = 11)
		public void TestCaseClickOnAboutUsButton() throws InterruptedException {
			DashboardPageVariable.clickOnAboutUsButton();
			String url_expected = "https://www.aboutamazon.in/";
			String url_actual = driver.getCurrentUrl();
			
			if(url_actual.contains(url_expected)) {
				System.out.println("About Us URL is verified");
			}else {
				System.out.println("About Us URL verification failed");
			}
			driver.navigate().back();
			Thread.sleep(2000);
			
		}
		
		@Test(priority = 12)
		public void TestCaseFooterGetToKnowUsLinksVerification() throws InterruptedException {
			DashboardPageVariable.careersPageButton.click();
			String url_expected1 = "https://amazon.jobs/";
			String url_actual1 = driver.getCurrentUrl();
			
			if(url_actual1.contains(url_expected1)) {
				System.out.println("Career Page URL is verified");
			}else {
				System.out.println("Career Page URL verification failed");
			}
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			DashboardPageVariable.pressReleaseButton.click();
			String url_expected2 = "https://press.aboutamazon.in/";
			String url_actual2 = driver.getCurrentUrl();
			
			if(url_actual2.contains(url_expected2)) {
				System.out.println("Press release URL is verified");
			}else {
				System.out.println("Press release URL verification failed");
			}
			
			driver.navigate().back();
			Thread.sleep(2000);
			
			DashboardPageVariable.amazonSciencePageButton.click();
			String url_expected3 = "https://www.amazon.science/";
			String url_actual3 = driver.getCurrentUrl();
			
			if(url_actual3.contains(url_expected3)) {
				System.out.println("Amazon Science URL is verified");
			}else {
				System.out.println("Amazon Science URL verification failed");
			}
			
			driver.navigate().back();
			Thread.sleep(2000);
		}
		
		@Test(priority = 13)
		public void TestCaseSocialMediaPages() throws InterruptedException {
			// Navigate to Facebook
			DashboardPageVariable.facebookPageButton.click();
			Thread.sleep(2000);
			DashboardPageVariable.goToFacebookPageButton.click();
			Thread.sleep(2000);
			String url_expected1 = "https://www.facebook.com/AmazonIN";
			String url_actual1 = driver.getCurrentUrl();
			
			if(url_actual1.contains(url_expected1)) {
				System.out.println("Facebook Page URL is verified");
			}else {
				System.out.println("Facebook Page URL verification failed");
			}
				
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(2000);
			
			
			// Navigate to Twitter
			DashboardPageVariable.twitterPageButton.click();
			Thread.sleep(2000);
			DashboardPageVariable.goToTwitterPageButton.click();
			String url_expected2 = "https://x.com/AmazonIN";
			String url_actual2 = driver.getCurrentUrl();
			if(url_actual2.contains(url_expected2)) {
				System.out.println("Twitter Handle URL is verified");
			}else {
				System.out.println("Twitter Handle URL verification failed");
			}
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(2000);
			
			// Navigate to Instagram
			DashboardPageVariable.instagramPageButton.click();
			Thread.sleep(2000);
			DashboardPageVariable.goToInstagramPageButton.click();
			String url_expected3 = "https://www.instagram.com/amazondotin";
			String url_actual3 = driver.getCurrentUrl();
			if(url_actual3.contains(url_expected3)) {
				System.out.println("Instagram Handle URL is verified");
			}else {
				System.out.println("Instagram Handle URL verification failed");
			}
			driver.navigate().back();
			driver.navigate().back();
			Thread.sleep(2000);
			
		}
		
		@Test(priority = 14)
		public void TestCaseMakeMoneyWithUsLinksVerify() throws InterruptedException {
			// Link1
			DashboardPageVariable.sellOnAmazonButton.click();
			String url_expected1 = "nav_footer_sell_C";
			String url_actual1 = driver.getCurrentUrl();
			if(url_actual1.contains(url_expected1)) {
				System.out.println("Sell on Amazon URL is verified");
			}else {
				System.out.println("Sell on Amazon URL verification failed");
			}
			Thread.sleep(2000);
			driver.navigate().back();
			
			// Link2
			DashboardPageVariable.sellUnderAmazonAcceleratorButton.click();
			String url_expected2 = "map_1_b2b_GW_FT";
			String url_actual2 = driver.getCurrentUrl();
			if(url_actual2.contains(url_expected2)) {
				System.out.println("Sell under amazon accelerator URL is verified");
			}else {
				System.out.println("Sell under amazon accelerator URL verification failed");
			}
			Thread.sleep(2000);
			driver.navigate().back();
			
			// Link3
			DashboardPageVariable.protectAndBuildYourBrandButton.click();
			String url_expected3 = "https://brandservices.amazon.in/";
			String url_actual3 = driver.getCurrentUrl();
			if(url_actual3.contains(url_expected3)) {
				System.out.println("Protect and Build Your Brand URL is verified");
			}else {
				System.out.println("Protect and Build Your Brand URL verification failed");
			}
			Thread.sleep(2000);
			driver.navigate().back();
			
			// Link4
			DashboardPageVariable.amazonGlobalSellingButton.click();
			String url_expected4 = "https://sell.amazon.in/";
			String url_actual4 = driver.getCurrentUrl();
			if(url_actual4.contains(url_expected4)) {
				System.out.println("Amazon Global Selling URL is verified");
			}else {
				System.out.println("Amazon Global Selling URL verification failed");
			}
			Thread.sleep(2000);
			driver.navigate().back();
			
			// Link5
			DashboardPageVariable.supplyToAmazonButton.click();
			String url_expected5 = "https://supply.amazon.com/";
			String url_actual5 = driver.getCurrentUrl();
			if(url_actual5.contains(url_expected5)) {
				System.out.println("Supply to Amazon URL is verified");
			}else {
				System.out.println("Supply to Amazon URL verification failed");
			}
			Thread.sleep(2000);
			driver.navigate().back();
			
			// Link6
			DashboardPageVariable.becomeAnAffiliateButton.click();
			String url_expected6 = "https://affiliate-program.amazon.in/";
			String url_actual6 = driver.getCurrentUrl();
			if(url_actual6.contains(url_expected6)) {
				System.out.println("Become an Affiliate URL is verified");
			}else {
				System.out.println("Become an Affiliate URL verification failed");
			}
			Thread.sleep(2000);
			driver.navigate().back();
			
			// Link7
			DashboardPageVariable.fulfilmentByAmazonButton.click();
			String url_expected7 = "fulfillment-by-amazon";
			String url_actual7 = driver.getCurrentUrl();
			if(url_actual7.contains(url_expected7)) {
				System.out.println("Fulfilment by Amazon URL is verified");
			}else {
				System.out.println("Fulfilment by Amazon verification failed");
			}
			Thread.sleep(2000);
			driver.navigate().back();
			
			// Link8
			DashboardPageVariable.advertiseYourProductsButton.click();
			String url_expected8 = "https://advertising.amazon.com/";
			String url_actual8 = driver.getCurrentUrl();
			if(url_actual8.contains(url_expected8)) {
				System.out.println("Advertise Your Products URL is verified");
			}else {
				System.out.println("Advertise Your Products verification failed");
			}
			Thread.sleep(2000);
			driver.navigate().back();
			
			// Link9
			DashboardPageVariable.amazonPayOnMerchantsButton.click();
			String url_expected9 = "https://www.amazon.in/amazonpay";
			String url_actual9 = driver.getCurrentUrl();
			if(url_actual9.contains(url_expected9)) {
				System.out.println("Amazon Pay on Merchants URL is verified");
			}else {
				System.out.println("Amazon Pay on Merchants verification failed");
			}
			Thread.sleep(2000);
			driver.navigate().back();
		}
		
		
		
		
		
		@AfterTest
		public void teardown() throws InterruptedException {
			Thread.sleep(3000);
			driver.quit();
		}
}
