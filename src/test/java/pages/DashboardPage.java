package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath = "//a[@href='https://www.aboutamazon.in/?utm_source=gateway&utm_medium=footer']")
	WebElement aboutUsButton;
	
	@FindBy(xpath = "//a[@href='https://amazon.jobs']")
	WebElement careersPageButton;
	
	@FindBy(xpath = "//a[@href='https://press.aboutamazon.in/?utm_source=gateway&utm_medium=footer']")
	WebElement pressReleaseButton;
	
	@FindBy(xpath = "//a[@href='https://www.amazon.science']")
	WebElement amazonSciencePageButton;
	
	@FindBy(xpath = "(//a[@class='nav_a'])[5]")
	WebElement facebookPageButton;
	
	@FindBy(xpath = "//a[@href='http://www.facebook.com/AmazonIN']")
	WebElement goToFacebookPageButton;
	
	@FindBy(xpath = "(//a[@class='nav_a'])[6]")
	WebElement twitterPageButton;
	
	@FindBy(xpath = "//a[@href='http://twitter.com/AmazonIN']")
	WebElement goToTwitterPageButton;
	
	@FindBy(xpath = "(//a[@class='nav_a'])[7]")
	WebElement instagramPageButton;
	
	@FindBy(xpath = "//a[@href='https://www.instagram.com/amazondotin']")
	WebElement goToInstagramPageButton;
	
	
	
	
	
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
