package APay.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import APay.APay_Baseclass;

public class APay_Dashboard_RP_POM extends APay_Baseclass{
	
	public WebDriver driver;

	public APay_Dashboard_RP_POM() {
		this.driver = APay_Baseclass.getDriver();
	}


	public void dashboard_ReceivePayments() {

		initializeWait();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@src=' https://apaystaging.ascendant.world//DashBoard']")));

		WebElement Receive_payments = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='btnRP']")));
		String text = Receive_payments.getText();
		System.out.println(text);
		Receive_payments.click();

		driver.switchTo().defaultContent();
	}

	public void action_dropdown() {
		
		initializeWait();
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[@class='tabs-panels']//div[2]//div[1]//div[1]//iframe[1]")));
		
		
		WebElement action_button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='btn btn-primary dropdown-toggle'])[1]")));
		action_button.click();
		
		WebElement click_open = driver.findElement(By.xpath("//div[@class='btn-group open']//a[contains(text(),'Open')]"));
		click_open.click();
		
		driver.switchTo().defaultContent();
	}
}
