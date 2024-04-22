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
	
	
//	public static void excelreader(Apay_Login_POM loginPage) throws InvalidFormatException {
//	 try {
//         // Load the Excel file
//         FileInputStream file = new FileInputStream("F:\\AFX Login creds\\AFX_Login_creds.xlsx");
//         Workbook workbook = WorkbookFactory.create(file);
//         
//         // Get the first sheet
//         Sheet sheet = workbook.getSheetAt(0);
//         
//         // Iterate through each row
//         for (Row row : sheet) {
//             // Assuming the columns are in order: customerID, username, password
//             String customerID = row.getCell(0).getStringCellValue();
//             String username = row.getCell(1).getStringCellValue();
//             String password = row.getCell(2).getStringCellValue();
//             
//             loginPage.entercredentials(customerID, username, password);
//             
//             // Do something with the data (print it for now)
//             System.out.println("Customer ID: " + customerID + ", Username: " + username + ", Password: " + password);
//         }
//         
//         // Close the file
//         file.close();
//     } catch (IOException e) {
//         e.printStackTrace();
//     }
// }
}
