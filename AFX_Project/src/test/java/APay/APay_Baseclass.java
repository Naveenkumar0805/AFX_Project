package APay;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import APay.POM.Apay_Login_POM;


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
