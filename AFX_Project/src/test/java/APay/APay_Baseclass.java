package APay;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class APay_Baseclass {
	
    // Use ThreadLocal for WebDriver to ensure thread safety when running tests in parallel
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            // Using WebDriverManager to handle driver setup
            WebDriverManager.chromedriver().setup();
            driver.set(new ChromeDriver());
            driver.get().manage().window().maximize();
        }
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove(); // Remove the ThreadLocal variable
        }
    }

    public static WebDriverWait wait;

    public static void initializeWait() {
        wait = new WebDriverWait(getDriver(), 10); // Initialize the wait object with a timeout of 10 seconds.
    }
    
    public static void implicitwait() {
    	
    	getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
    }

	
	 public List<List<String>> readExcel(String filePath, String sheetName) throws Exception {
	        FileInputStream inputStream = new FileInputStream(new File(filePath));
	        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
	        XSSFSheet sheet = workbook.getSheet(sheetName);
	        List<List<String>> data = new ArrayList<>();

	        int rowStart = sheet.getFirstRowNum() + 1; // Assuming the first row is headers
	        int rowEnd = sheet.getLastRowNum();

	        for (int rowNum = rowStart; rowNum <= rowEnd; rowNum++) {
	            XSSFRow row = sheet.getRow(rowNum);
	            List<String> rowData = new ArrayList<>();
	            for (Cell cell : row) {
	                rowData.add(cell.toString());
	            }
	            data.add(rowData);
	        }
	        workbook.close();
	        inputStream.close();
	        return data;
	    }
}
