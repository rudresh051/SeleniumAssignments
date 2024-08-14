package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected WebDriver driver;
	protected WebDriverWait wait;

	@BeforeSuite
	public void setUpSuite() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");  // Load the URL here
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@AfterSuite
	public void tearDownSuite() {
		if (driver != null) {
			driver.quit();
		}
	}
}
