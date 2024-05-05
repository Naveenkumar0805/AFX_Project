package APay.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import APay.APay_Baseclass;

public class APay_Dashboard_POM extends APay_Baseclass {
	
	public WebDriver driver;
	 
    public APay_Dashboard_POM() {
        this.driver = APay_Baseclass.getDriver();
    }

	
	public void dashboard_saved() {
		
		initializeWait();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src=' https://apaystaging.ascendant.world//DashBoard']")));
		
		WebElement send_payments = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnAddPayment']")));
		String text = send_payments.getText();
		System.out.println(text);
		send_payments.click();
		
		driver.switchTo().defaultContent();
	}

	public void sendpayments_count() {
		
		initializeWait();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@class='tabs-panels']//div[2]//div[1]//div[1]//iframe[1]")));
		 
		int totalRowCount = 0;
		int nextPageCount = 0; // Counter for next page clicks
		Actions actions = new Actions(driver);

        // Iterate through each page
        while (nextPageCount<=11) {
     
            // Get the table element
            WebElement table = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//table[@id='grdTransaction']")));

            // Get all the rows in the table
            int rowCount = table.findElements(By.xpath("//table//tbody//tr")).size();
            
            // If there are no rows on the current page, break the loop
//            if (rowCount == 0) {
//                break;
//            }

            // Count the rows in the current page
            totalRowCount += rowCount;
        
            // Check if there is a next page
            WebElement nextPageButton = driver.findElement(By.xpath("//span[@id='NextClick']"));

            if (nextPageButton.isEnabled()) {
            	
            	wait.until(ExpectedConditions.elementToBeClickable(nextPageButton));
                // Click on the next page button
            	 actions.moveToElement(nextPageButton).click().perform();
            	 
            	 nextPageCount++;
                 
            } else {
                // Break the loop if there is no next page
                break;
            }
        }

//        // Close the browser
//        driver.quit();
        
	}

}
