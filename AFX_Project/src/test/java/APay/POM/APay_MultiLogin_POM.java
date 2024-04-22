package APay.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import APay.APay_Baseclass;

public class APay_MultiLogin_POM extends APay_Baseclass {
	
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
		
		int framecount = driver.findElements(By.tagName("iFrame")).size();
		System.out.println("The Frame count is: " + framecount);

		driver.switchTo().frame(0);

		WebElement captcha = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
		captcha.click();

		driver.switchTo().defaultContent();

		initializeWait();
		WebElement loginbutton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
		loginbutton.click();


	}

	public void APay_Dashboard() {

		initializeWait();
		WebElement Dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='javascript:void();'][normalize-space()='DashBoard']")));
		Dashboard.click();

	}

}
