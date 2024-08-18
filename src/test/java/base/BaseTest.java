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
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in");  // Load the URL here
			wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		} catch (Exception e) {
			// TODO: handle exception
			 System.out.println("Error during setup: " + e.getMessage());
	         e.printStackTrace();
	         throw e;  // Re-throw to ensure the suite fails if setup fails
		}
		
	}

	@AfterSuite
	public void tearDownSuite() {
		if (driver != null) {
			driver.quit();
		}
	}
}
