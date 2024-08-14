package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	WebDriver driver;

	// constructor
	public DashboardPage(WebDriver d){
		driver  = d;
		PageFactory.initElements(driver,this);
		Actions act = new Actions(driver);
	}

	// Find all WebElements and Put it here as variable
	// create methods of operation to be performed on Webelements variables

	@FindBy(xpath = "//i[@class='a-icon a-icon-previous-rounded']") WebElement CarousalLeftButton;
	@FindBy(xpath = "//i[@class='a-icon a-icon-next-rounded']") WebElement CarousalRightButton;
	@FindBy(id="desktop-banner") WebElement CarousalBanner;
	@FindBy(id = "twotabsearchtextbox") WebElement SearchBar;
	@FindBy(xpath="(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]") WebElement firstOption;
	@FindBy(xpath="//span[@class='s-pagination-item s-pagination-selected']") WebElement pagination2ndButton;
	@FindBy(xpath="//input[@title='Add to Shopping Cart']") WebElement addCartButton;
	@FindBy(xpath = "//a[@href='/ref=nav_logo']")
	public WebElement amazonLogo;
	@FindBy(id = "glow-ingress-block")
	public WebElement location;
	@FindBy(className="GLUX_Full_Width")
	public WebElement pincode;
	@FindBy(xpath = "(//input[@class='a-button-input'])[3]")
	public WebElement applyPinCodeButton;
	@FindBy(xpath = "(//a[@aria-label='Choose a language for shopping.'])[1]")
	public WebElement languageButton;
	@FindBy(xpath = "(//i[@class='a-icon a-icon-radio'])[2]")
	public WebElement hindiRadioButton;
	@FindBy(id = "nav-link-accountList") WebElement signinButton;

	// Get to Know Us
	@FindBy(xpath = "//a[@href='https://www.aboutamazon.in/?utm_source=gateway&utm_medium=footer']") WebElement aboutUsButton;
	@FindBy(xpath = "//a[@href='https://amazon.jobs']")
	public WebElement careersPageButton;
	@FindBy(xpath = "//a[@href='https://press.aboutamazon.in/?utm_source=gateway&utm_medium=footer']")
	public WebElement pressReleaseButton;
	@FindBy(xpath = "//a[@href='https://www.amazon.science']")
	public WebElement amazonSciencePageButton;

	// Connect with Us
	@FindBy(xpath = "(//a[@class='nav_a'])[5]")
	public WebElement facebookPageButton;
	@FindBy(xpath = "//a[@href='http://www.facebook.com/AmazonIN']")
	public WebElement goToFacebookPageButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[6]")
	public WebElement twitterPageButton;
	@FindBy(xpath = "//a[@href='http://twitter.com/AmazonIN']")
	public WebElement goToTwitterPageButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[7]")
	public WebElement instagramPageButton;
	@FindBy(xpath = "//a[@href='https://www.instagram.com/amazondotin']")
	public WebElement goToInstagramPageButton;

	// Make Money with Us
	@FindBy(xpath = "(//a[@class='nav_a'])[8]")
	public WebElement sellOnAmazonButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[9]")
	public WebElement sellUnderAmazonAcceleratorButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[10]")
	public WebElement protectAndBuildYourBrandButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[11]")
	public WebElement amazonGlobalSellingButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[12]")
	public WebElement supplyToAmazonButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[13]")
	public WebElement becomeAnAffiliateButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[14]")
	public WebElement fulfilmentByAmazonButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[15]")
	public WebElement advertiseYourProductsButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[16]")
	public WebElement amazonPayOnMerchantsButton;

	// Let us help you
	@FindBy(xpath = "(//a[@class='nav_a'])[17]")
	public WebElement covid19AndAmazonbutton;
	@FindBy(xpath = "(//a[@class='nav_a'])[18]")
	public WebElement yourAccountButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[19]")
	public WebElement returnsCentreButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[20]")
	public WebElement recallsAndProductSafetyAlertsButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[21]")
	public WebElement purchaseProtectionButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[22]")
	public WebElement amazonAppDownloadButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[23]")
	public WebElement helpButton;

	// Amazon Services categories
	@FindBy(xpath = "//a[@href='https://www.abebooks.com/']")
	public WebElement abeBooksButton;
	@FindBy(xpath = "//a[@href='https://aws.amazon.com/what-is-cloud-computing/?sc_channel=EL&sc_campaign=IN_amazonfooter']")
	public 
	WebElement amazonWebServicesButton;
	@FindBy(xpath = "//a[@href='https://www.audible.in/']")
	public WebElement AudibleBooksButton;
	@FindBy(xpath = "//a[@href='https://www.imdb.com/']")
	public WebElement imdbButton;
	@FindBy(xpath = "//a[@href='https://www.shopbop.com/']")
	public WebElement shopbopButton;
	@FindBy(xpath = "//a[@href='/business?ref=footer_aingw']")
	public WebElement amazonBusinessButton;
	@FindBy(xpath = "//a[@href='/now?ref=footer_amznow']")
	public WebElement primeNowButton;
	@FindBy(xpath = "//a[@href='/music/prime?ref=footer_apm']")
	public WebElement amazonPrimeMusicButton;

	// Amazon Footer CopyRight Section
	@FindBy(xpath = "//a[@href='/gp/help/customer/display.html?nodeId=200545940&ref_=footer_cou']")
	public WebElement conditionsOfUseAndSaleButton;
	@FindBy(xpath = "//a[@href='/gp/help/customer/display.html?nodeId=200534380&ref_=footer_privacy']")
	public WebElement privacyNoticeButton;
	@FindBy(xpath = "//a[@href='/gp/help/customer/display.html?nodeId=202075050&ref_=footer_iba']")
	public WebElement interestBasedAdsButton;
	@FindBy(xpath = "//span[text()='© 1996-2024, Amazon.com, Inc. or its affiliates']")
	public WebElement amazonText;

	@FindBy(css = "div.nav-logo-base")
	public WebElement amazonFooterLogo;
	@FindBy(id = "icp-touch-link-language")
	public WebElement footerLanguageButton;
	@FindBy(xpath = "(//div[@class='a-radio a-radio-fancy'])[2]")
	public WebElement fromFooterHindiButton;
	@FindBy(xpath = "(//div[@class='a-radio a-radio-fancy'])[1]")
	public WebElement fromFooterEnglishButton;
	@FindBy(xpath = "//input[@class='a-button-input']")
	public WebElement languageSaveButton;

	@FindBy(id = "icp-touch-link-country")
	public WebElement footerCountryButton;
	@FindBy(xpath = "//span[@class='a-button-text a-declarative']")
	public WebElement countryDropdownButton;
	@FindBy(xpath = "//li[@id='icp-dropdown-item-22']")
	public WebElement selectUnitedStatesButton;
	@FindBy(xpath = "(//input[@type='submit'])[2]")
	public WebElement countrySubmitButton;

	// Back to top
	@FindBy(xpath = "//span[@class='navFooterBackToTopText']")
	public WebElement backToTopButton;
	
	// Left Side Navigation Verification
	@FindBy(id="nav-hamburger-menu") WebElement HamburgerMenuButton;
	@FindBy(css = "div.hmenu-close-icon") WebElement hamClosebutton;
	// Trending Locators
	@FindBy(xpath = "(//a[text()='Best Sellers'])[2]")
	public WebElement bestSellersButton;
	@FindBy(xpath = "(//a[text()='New Releases'])[2]")
	public WebElement newReleaseButton;
	@FindBy(xpath = "(//a[text()='Movers and Shakers'])")
	public WebElement moversAndShakersButton;
	// Digital content and devices
	@FindBy(xpath = "(//a[text()='Amazon miniTV- FREE entertainment'])") WebElement amazonMiniTvButton;
	@FindBy(xpath = "//div[text()='Echo & Alexa']")
	public WebElement echoAndAlexaForwardArrowButton;
	@FindBy(xpath = "(//li//a[@class='hmenu-item'])[37]") WebElement seeAllDevicesWithAlexaButton;
	@FindBy(xpath="//a[normalize-space()='Meet Alexa']")
	public WebElement meetAlexa;
	@FindBy(xpath="//a[normalize-space()='Alexa Skills']")
	public WebElement alexaSkills;
	@FindBy(xpath="//a[normalize-space()='Alexa App']")
	public WebElement alexaApp;
	@FindBy(xpath="//a[normalize-space()='Alexa Smart Home']")
	public WebElement alexaSmartHome;
	@FindBy(xpath="//ul[@class='hmenu hmenu-visible hmenu-translateX']//a[@class='hmenu-item'][normalize-space()='Amazon Prime Music']")
	public WebElement amazonPrimeMusic;

	// Product Filter page
	@FindBy(xpath = "(//span[text()='Apple iPhone 15 Pro Max (256 GB) - Natural Titanium'])[3]") WebElement firstProduct;
	@FindBy(xpath = "//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple iPhone 15 Pro Max (256 GB) - Natural Titaniu')]")
	public WebElement firstProduct1;
	@FindBy(xpath = "(//input[@type='checkbox'])[1]") WebElement getItByTomorrow;
	
	
	
	// Methods
	public void clickOnCarousalLeftButton() {
		CarousalLeftButton.click();
	}
	public void clickOnCarousalRightButton() {
		CarousalRightButton.click();
	}
	public void clickOnCarousalBanner() {
		CarousalBanner.click();
	}

	public void clickOnHamburgerMenuButton() {
		HamburgerMenuButton.click();
	}

	public void clickOnSearchBar(String product) {
		SearchBar.sendKeys(product);
	}

	public void clickOnFirstOption() {
		firstOption.click();
	}

	public void clickOnPaginationButton() throws InterruptedException {
		pagination2ndButton.click();
	}

	public void scrollToPaginationButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", pagination2ndButton); 
		pagination2ndButton.click();
	}


	public void scrollToAddCartButton() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", addCartButton); 
		addCartButton.click();
	}

	public void hamMenuCloseButton() {
		hamClosebutton.click();
	}

	public void clickLogo() {
		amazonLogo.click();
	}

	public void clickOnSignInButton() {
		signinButton.click();
	}

	public void clickOnAboutUsButton() {
		aboutUsButton.click();
	}
	public void clickOnGetItByTomorrowCheckBox() {
		getItByTomorrow.click();
	}

}
