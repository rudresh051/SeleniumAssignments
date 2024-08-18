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
	@FindBy(xpath = "(//span[text()='Apple iPhone 15 Pro Max (256 GB) - Natural Titanium'])[3]") WebElement firstProduct;
	@FindBy(xpath = "//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'Apple iPhone 15 Pro Max (256 GB) - Natural Titaniu')]")
	public WebElement firstProduct1;
	@FindBy(xpath = "(//input[@type='checkbox'])[1]") WebElement getItByTomorrow;


	// Methods
	public void clickOnGetItByTomorrowCheckBox() {
		getItByTomorrow.click();
	}
}
