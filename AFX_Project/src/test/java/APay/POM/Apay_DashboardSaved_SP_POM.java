package APay.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import APay.APay_Baseclass;

public class Apay_DashboardSaved_SP_POM extends APay_Baseclass {
	
	public void dashboard_saved() {
		
		initializeWait();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src=' https://apaystaging.ascendant.world//DashBoard']")));
		
		WebElement send_payments = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnAddPayment']")));
		send_payments.click();
		
		driver.switchTo().defaultContent();
	}
	
	public void action_dropdown() {
		
		initializeWait();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@class='tabs-panels']//div[2]//div[1]//div[1]//iframe[1]")));
		
		
		WebElement action_button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='btn-group'])[1]")));
		action_button.click();
		
		WebElement click_open = driver.findElement(By.xpath("//div[@class='btn-group open']//a[contains(text(),'Open')]"));
		click_open.click();
		
		driver.switchTo().defaultContent();
	}
	
	public void getquote_and_submit() {
		
		initializeWait();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@class='tabs-panels']//div[2]//div[1]//div[1]//iframe[1]")));
		
		WebElement getquote = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnGetQuote']")));
		
		Actions action = new Actions(driver);
		action.moveToElement(getquote).click().perform();
						
		WebElement submit_for_approval = driver.findElement(By.xpath("//input[@id='btn_Accept_Approve']"));
		submit_for_approval.click();
	}

}
