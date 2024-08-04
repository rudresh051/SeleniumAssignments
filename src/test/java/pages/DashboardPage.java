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
	
	
}
