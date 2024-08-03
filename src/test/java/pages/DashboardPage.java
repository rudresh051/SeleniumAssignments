package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	WebDriver driver;
	
	// constructor
	DashboardPage(WebDriver d){
		driver  = d;
		PageFactory.initElements(driver,this);
	}
	
	// Find all WebElements and Put it here as variable
	// create methods of operation to be performed on Webelements variables
	
	@FindBy(xpath = "//i[@class='a-icon a-icon-previous-rounded']")
	WebElement CarousalLeftButton;
	@FindBy(xpath = "//i[@class='a-icon a-icon-next-rounded']")
	WebElement CarousalRightButton;
	
	// Methods
	public void clickOnCarousalLeftButton() {
		CarousalLeftButton.click();
	}
	public void clickOnCarousalRightButton() {
		CarousalRightButton.click();
	}
}
