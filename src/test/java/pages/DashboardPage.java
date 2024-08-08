package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage {
	WebDriver driver;

	// constructor
	DashboardPage(WebDriver d){
		driver  = d;
		PageFactory.initElements(driver,this);
		Actions act = new Actions(driver);
	}

	// Find all WebElements and Put it here as variable
	// create methods of operation to be performed on Webelements variables

	@FindBy(xpath = "//i[@class='a-icon a-icon-previous-rounded']")
	WebElement CarousalLeftButton;

	@FindBy(xpath = "//i[@class='a-icon a-icon-next-rounded']")
	WebElement CarousalRightButton;

	@FindBy(id="desktop-banner")
	WebElement CarousalBanner;

	@FindBy(id="nav-hamburger-menu")
	WebElement HamburgerMenuButton;

	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchBar;

	@FindBy(xpath="(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")
	WebElement firstOption;

	@FindBy(xpath="//span[@class='s-pagination-item s-pagination-selected']")
	WebElement pagination2ndButton;

	@FindBy(xpath="//input[@title='Add to Shopping Cart']")
	WebElement addCartButton;

	@FindBy(css = "div.hmenu-close-icon")
	WebElement hamClosebutton;

	@FindBy(xpath = "//a[@href='/ref=nav_logo']")
	WebElement amazonLogo;

	@FindBy(id = "glow-ingress-block")
	WebElement location;

	@FindBy(className="GLUX_Full_Width")
	WebElement pincode;

	@FindBy(xpath = "(//input[@class='a-button-input'])[3]")
	WebElement applyPinCodeButton;

	@FindBy(xpath = "(//a[@aria-label='Choose a language for shopping.'])[1]")
	WebElement languageButton;

	@FindBy(xpath = "(//i[@class='a-icon a-icon-radio'])[2]")
	WebElement hindiRadioButton;

	@FindBy(id = "nav-link-accountList")
	WebElement signinButton;

	// Get to Know Us
	@FindBy(xpath = "//a[@href='https://www.aboutamazon.in/?utm_source=gateway&utm_medium=footer']") WebElement aboutUsButton;
	@FindBy(xpath = "//a[@href='https://amazon.jobs']") WebElement careersPageButton;
	@FindBy(xpath = "//a[@href='https://press.aboutamazon.in/?utm_source=gateway&utm_medium=footer']") WebElement pressReleaseButton;
	@FindBy(xpath = "//a[@href='https://www.amazon.science']") WebElement amazonSciencePageButton;

	// Connect with Us
	@FindBy(xpath = "(//a[@class='nav_a'])[5]") WebElement facebookPageButton;
	@FindBy(xpath = "//a[@href='http://www.facebook.com/AmazonIN']") WebElement goToFacebookPageButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[6]") WebElement twitterPageButton;
	@FindBy(xpath = "//a[@href='http://twitter.com/AmazonIN']") WebElement goToTwitterPageButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[7]") WebElement instagramPageButton;
	@FindBy(xpath = "//a[@href='https://www.instagram.com/amazondotin']") WebElement goToInstagramPageButton;

	// Make Money with Us
	@FindBy(xpath = "(//a[@class='nav_a'])[8]") WebElement sellOnAmazonButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[9]") WebElement sellUnderAmazonAcceleratorButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[10]") WebElement protectAndBuildYourBrandButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[11]") WebElement amazonGlobalSellingButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[12]") WebElement supplyToAmazonButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[13]") WebElement becomeAnAffiliateButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[14]") WebElement fulfilmentByAmazonButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[15]") WebElement advertiseYourProductsButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[16]") WebElement amazonPayOnMerchantsButton;

	// Let us help you
	@FindBy(xpath = "(//a[@class='nav_a'])[17]") WebElement covid19AndAmazonbutton;
	@FindBy(xpath = "(//a[@class='nav_a'])[18]") WebElement yourAccountButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[19]") WebElement returnsCentreButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[20]") WebElement recallsAndProductSafetyAlertsButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[21]") WebElement purchaseProtectionButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[22]") WebElement amazonAppDownloadButton;
	@FindBy(xpath = "(//a[@class='nav_a'])[23]") WebElement helpButton;

	// Amazon Services categories
	@FindBy(xpath = "//a[@href='https://www.abebooks.com/']") WebElement abeBooksButton;
	@FindBy(xpath = "//a[@href='https://aws.amazon.com/what-is-cloud-computing/?sc_channel=EL&sc_campaign=IN_amazonfooter']") 
	WebElement amazonWebServicesButton;
	@FindBy(xpath = "//a[@href='https://www.audible.in/']") WebElement AudibleBooksButton;
	@FindBy(xpath = "//a[@href='https://www.imdb.com/']") WebElement imdbButton;
	@FindBy(xpath = "//a[@href='https://www.shopbop.com/']") WebElement shopbopButton;
	@FindBy(xpath = "//a[@href='/business?ref=footer_aingw']") WebElement amazonBusinessButton;
	@FindBy(xpath = "//a[@href='/now?ref=footer_amznow']") WebElement primeNowButton;
	@FindBy(xpath = "//a[@href='/music/prime?ref=footer_apm']") WebElement amazonPrimeMusicButton;

	// Amazon Footer CopyRight Section
	@FindBy(xpath = "//a[@href='/gp/help/customer/display.html?nodeId=200545940&ref_=footer_cou']") WebElement conditionsOfUseAndSaleButton;
	@FindBy(xpath = "//a[@href='/gp/help/customer/display.html?nodeId=200534380&ref_=footer_privacy']") WebElement privacyNoticeButton;
	@FindBy(xpath = "//a[@href='/gp/help/customer/display.html?nodeId=202075050&ref_=footer_iba']") WebElement interestBasedAdsButton;
	
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

}
