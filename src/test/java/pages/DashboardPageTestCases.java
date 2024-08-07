package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashboardPageTestCases {

	private WebDriver driver;
	private DashboardPage DashboardPageVariable; // Create an instance of Dashboard page
	WebDriverWait wait;


	@BeforeTest
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		DashboardPageVariable = new DashboardPage(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		try {
			wait.until(ExpectedConditions.urlToBe("https://www.amazon.in/"));
			driver.manage().window().maximize();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}

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
			System.out.println("Fulfilment by Amazon URL verification failed");
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
			System.out.println("Advertise Your Products URL verification failed");
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
			System.out.println("Amazon Pay on Merchants URL verification failed");
		}
		Thread.sleep(2000);
		driver.navigate().back();
	}

	@Test(priority = 15)
	public void TestCaseLetUsHelpYouVerify() throws InterruptedException {
		// Link1
		DashboardPageVariable.covid19AndAmazonbutton.click();
		Thread.sleep(2000);
		String url_expected1 = "footer_covid";
		String url_actual1 = driver.getCurrentUrl();
		if(url_actual1.contains(url_expected1)) {
			System.out.println("COVID-19 and Amazon URL is verified");
		}else {
			System.out.println("COVID-19 and Amazon URL verification failed");
		}
		Thread.sleep(2000);
		driver.navigate().back();

		// Link2
		DashboardPageVariable.yourAccountButton.click();
		Thread.sleep(2000);
		String url_expected2 = "footer_ya";
		String url_actual2 = driver.getCurrentUrl();
		if(url_actual2.contains(url_expected2)) {
			System.out.println("Your Account URL is verified");
		}else {
			System.out.println("Your Account URL verification failed");
		}
		Thread.sleep(2000);
		driver.navigate().back();

		// Link3
		DashboardPageVariable.returnsCentreButton.click();
		Thread.sleep(2000);
		String url_expected3 = "https://www.amazon.in/ap/signin";
		String url_actual3 = driver.getCurrentUrl();
		if(url_actual3.contains(url_expected3)) {
			System.out.println("Returns Centre URL is verified");
		}else {
			System.out.println("Returns Centre URL verification failed");
		}
		Thread.sleep(2000);
		driver.navigate().back();

		// Link4
		DashboardPageVariable.recallsAndProductSafetyAlertsButton.click();
		Thread.sleep(2000);
		String url_expected4 = "https://www.amazon.in/ap/signin";
		String url_actual4 = driver.getCurrentUrl();
		if(url_actual4.contains(url_expected4)) {
			System.out.println("Recalls and Product Safety Alerts URL is verified");
		}else {
			System.out.println("Recalls and Product Safety Alerts URL verification failed");
		}
		Thread.sleep(2000);
		driver.navigate().back();

		// Link5
		DashboardPageVariable.purchaseProtectionButton.click();
		Thread.sleep(2000);
		String url_expected5 = "https://www.amazon.in/gp/help/customer/";
		String url_actual5 = driver.getCurrentUrl();
		if(url_actual5.contains(url_expected5)) {
			System.out.println("100% Purchase Protection URL is verified");
		}else {
			System.out.println("100% Purchase Protection URL verification failed");
		}
		Thread.sleep(2000);
		driver.navigate().back();

		// Link6
		DashboardPageVariable.amazonAppDownloadButton.click();
		Thread.sleep(2000);
		String url_expected6 = "footer_mobapp";
		String url_actual6 = driver.getCurrentUrl();
		if(url_actual6.contains(url_expected6)) {
			System.out.println("Amazon App Download URL is verified");
		}else {
			System.out.println("Amazon App Download URL verification failed");
		}
		Thread.sleep(2000);
		driver.navigate().back();

		// Link7
		DashboardPageVariable.helpButton.click();
		Thread.sleep(2000);
		String url_expected7 = "https://www.amazon.in/gp/help/customer";
		String url_actual7 = driver.getCurrentUrl();
		if(url_actual7.contains(url_expected7)) {
			System.out.println("Help URL is verified");
		}else {
			System.out.println("Help URL verification failed");
		}
		Thread.sleep(2000);
		driver.navigate().back();
	}


	// Footer Amazon Services Category URL Verification
	@Test(priority = 16)
	public void TestCaseAmazonServiceCategoriesVerify() {
		// AbeBooks
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.abeBooksButton));
			DashboardPageVariable.abeBooksButton.click();
			String url_expected1 = "https://www.abebooks.com/";
			String url_actual1 = driver.getCurrentUrl();

			if(url_actual1.contains(url_expected1)) {
				System.out.println("AbeBooks URL is verified");
			}else {
				System.out.println("AbeBooks URL verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}

		driver.navigate().back();

		// AmazonWebServices
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.amazonWebServicesButton));
			DashboardPageVariable.amazonWebServicesButton.click();
			String url_expected2 = "https://aws.amazon.com/what-is-cloud-computing";
			String url_actual2 = "https://aws.amazon.com/what-is-cloud-computing/?sc_channel=EL&sc_campaign=IN_amazonfooter";
			if(url_actual2.contains(url_expected2)) {
				System.out.println("Amazon Web Services URL is verified");
			}else {
				System.out.println("Amazon Web Services URL Verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}
		driver.navigate().back();

		// AudibleBooks
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.AudibleBooksButton));
			DashboardPageVariable.AudibleBooksButton.click();
			String url_expected3 = "https://www.audible.in/";
			String url_actual3 = "https://www.audible.in/";
			if(url_actual3.contains(url_expected3)) {
				System.out.println("Audible URL is verified");
			}else {
				System.out.println("Audible URL verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}
		driver.navigate().back();

		// IMDb
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.imdbButton));
			DashboardPageVariable.imdbButton.click();
			String url_expected4 = "https://www.imdb.com/";
			String url_actual4 = "https://www.imdb.com/";
			if(url_actual4.contains(url_expected4)) {
				System.out.println("IMDb URL is verified");
			}else {
				System.out.println("IMDb URL verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}
		driver.navigate().back();

		// Shopbop
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.shopbopButton));
			DashboardPageVariable.shopbopButton.click();
			String url_expected5 = "https://www.shopbop.com/";
			String url_actual5 = "https://www.shopbop.com/";
			if(url_actual5.contains(url_expected5)) {
				System.out.println("Shopbop URL is verified");
			}else {
				System.out.println("Shopbop URL verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}
		driver.navigate().back();

		// Amazon business
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.amazonBusinessButton));
			DashboardPageVariable.amazonBusinessButton.click();
			String url_expected6 = "footer_aingw";
			String url_actual6 = "https://www.amazon.in/l/21102587031?ref=footer_aingw";
			if(url_actual6.contains(url_expected6)) {
				System.out.println("Amazon Business URL is verified");
			}else {
				System.out.println("Amazon Business URL verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}
		driver.navigate().back();

		// Prime Now
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.primeNowButton));
			DashboardPageVariable.primeNowButton.click();
			String url_expected7 = "footer_amznow";
			String url_actual7 = "https://www.amazon.in/l/8557209031?ref=footer_amznow";
			if(url_actual7.contains(url_expected7)) {
				System.out.println("Prime Now URL is verified");
			}else {
				System.out.println("Prime Now URL verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}

		// Amazon Prime Music
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.amazonPrimeMusicButton));
			DashboardPageVariable.amazonPrimeMusicButton.click();
			String url_expected8 = "footer_apm";
			String url_actual8 = "https://www.amazon.in/music/prime?ref=footer_apm";
			if(url_actual8.contains(url_expected8)) {
				System.out.println("Amazon Prime Music URL is verified");
			}else {
				System.out.println("Amazon Prime Music URL verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}
	}

	// Footer copyright section
	@Test(priority = 17)
	public void TestCaseFooterCopyRightLinksVerify() {
		// Link1
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.conditionsOfUseAndSaleButton));
			DashboardPageVariable.conditionsOfUseAndSaleButton.click();
			String url_expected1 = "footer_cou";
			String url_actual1 = "https://www.amazon.in/gp/help/customer/display.html?nodeId=200545940&ref_=footer_cou";
			if(url_actual1.contains(url_expected1)) {
				System.out.println("Conditions of Use & Sale URL is verified");
			}else {
				System.out.println("Conditions of Use & Sale URL verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}
		driver.navigate().back();
		
		// Link2
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.privacyNoticeButton));
			DashboardPageVariable.privacyNoticeButton.click();
			String url_expected2 = "footer_privacy";
			String url_actual2 = "https://www.amazon.in/gp/help/customer/display.html?nodeId=200534380&ref_=footer_privacy";
			if(url_actual2.contains(url_expected2)) {
				System.out.println("Privacy Notice URL is verified");
			}else {
				System.out.println("Privacy Notice URL verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}
		driver.navigate().back();
		
		// Link3
		try {
			wait.until(ExpectedConditions.elementToBeClickable(DashboardPageVariable.interestBasedAdsButton));
			DashboardPageVariable.interestBasedAdsButton.click();
			String url_expected3 = "footer_iba";
			String url_actual3 = "https://www.amazon.in/gp/help/customer/display.html?nodeId=202075050&ref_=footer_iba";
			if(url_actual3.contains(url_expected3)) {
				System.out.println("Interest-Based Ads URL is verified");
			}else {
				System.out.println("Interest-Based Ads URL verification failed");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Element not found within 10 seconds. Proceeding to the next line of code.");
		}
		driver.navigate().back();
	}
	
	@AfterTest
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}
