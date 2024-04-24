package APay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class APay_Baseclass {
	
	
	public static WebDriver driver;
	public static WebDriverWait wait;

	public WebDriver getDriver() {
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void quitDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public static void initializeWait() {
		wait = new WebDriverWait(driver, 10); // Initialize the wait object with a timeout of 10 seconds.
	}
	
}
