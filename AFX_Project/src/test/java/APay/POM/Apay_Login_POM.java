package APay.POM;


import java.util.List;

import org.openqa.selenium.By;
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

		// Find all elements that match the XPath for the "select_an_account" button
		List<WebElement> select_an_Account = driver.findElements(By.xpath("(//input[@type='submit'])[1]"));

		// Check if the "select_an_account" button exists and is visible
		if (!select_an_Account.isEmpty() && select_an_Account.get(0).isDisplayed()) {
			select_an_Account.get(0).click();

		}
		
		System.out.println("The login was successful");

	}

}
