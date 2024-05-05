package APay.POM;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import APay.APay_Baseclass;

public class Apay_Login_POM extends APay_Baseclass {
	
	
	public WebDriver driver;
	 
    public Apay_Login_POM() {
        this.driver = APay_Baseclass.getDriver();
    }

	public void openApay() {

		driver.navigate().to("https://apaystaging.ascendant.world/Login/Index");

	}

	public void entercredentials(String customerID, String username, String password) {

		WebElement customerIDinput = driver.findElement(By.id("customerId"));
		WebElement usernameinput = driver.findElement(By.id("userName"));
		WebElement passwordinput = driver.findElement(By.id("password"));

		customerIDinput.sendKeys(customerID);
		usernameinput.sendKeys(username);
		passwordinput.sendKeys(password);
	}

	public void login() {
		
//		int framecount = driver.findElements(By.tagName("iFrame")).size();
//		System.out.println("The Frame count is: " + framecount);
//
//		driver.switchTo().frame(0);
//
//		WebElement captcha = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
//		captcha.click();
//
//		driver.switchTo().defaultContent();
//
//		initializeWait();
//		WebElement loginbutton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
//		loginbutton.click();
		
		try {
	       // driver.switchTo().frame(0);
	        List<WebElement> captchaElements = driver.findElements(By.xpath("//div[@class='recaptcha-checkbox-border']"));
	        
	        if (!captchaElements.isEmpty() && captchaElements.get(0).isDisplayed()) {
	            captchaElements.get(0).click();
	        
	            driver.switchTo().defaultContent();
	        } else {
	 
	            driver.switchTo().defaultContent();
	        }

	        initializeWait();
	        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
	        loginButton.click();
	        
	    } catch (Exception e) {
	        System.out.println("Error during login: " + e.getMessage());
	    }

	}


	public void APay_Dashboard() {

		initializeWait();

	    try {
	        // Attempt to find and click on the "select_an_account" button
	        WebElement select_an_Account = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@type='submit'])[1]")));
	        select_an_Account.click();
	    } catch (TimeoutException e) {
	        // If the "select_an_account" button is not found, catch the exception and look for the "Dashboard" link
	        WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='javascript:void();'][normalize-space()='DashBoard']")));
	        dashboard.click();
	    }
	}

}
