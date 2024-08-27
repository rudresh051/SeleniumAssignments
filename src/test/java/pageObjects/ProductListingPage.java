package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductListingPage {
	private WebDriver driver;
	private Actions actions;
	// constructor
	public ProductListingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);  // Initialize Actions here
	}

	// Product Filter page
	@FindBy(xpath = "(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	public WebElement firstProduct1;
	@FindBy(xpath = "(//span[@class='a-size-base a-color-base'])[6]") WebElement appleCheckbox;
	@FindBy(xpath = "//select[@id='s-result-sort-select']") public WebElement sortingDropdown;
	@FindBy(xpath = "//input[@id=p_36/range-slider_slider-item_upper-bound-slider']") public WebElement sliderButton;
	@FindBy(xpath = "(//span[text()='& Up'])[2]") public WebElement custormerReview;
	

	// Methods
	public void clickOnAppleCheckbox() {
		appleCheckbox.click();
	}
}
