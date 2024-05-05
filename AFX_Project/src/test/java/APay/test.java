package APay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class test extends APay_Baseclass {
	
	
	public WebDriver driver;
	 
    public test() {
        this.driver = APay_Baseclass.getDriver();
    }
	
	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
		getDriver();
		driver.navigate().to("https://apaystaging.ascendant.world/Login/Index");
	}

	@When("enters the customer ID, username and password")
	public void enters_the_customer_id_username_and_password() {
		WebElement customerIDinput = driver.findElement(By.id("customerId"));
		WebElement usernameinput = driver.findElement(By.id("userName"));
		WebElement passwordinput = driver.findElement(By.id("password"));

		customerIDinput.sendKeys("0005448");
		usernameinput.sendKeys("adminj");
		passwordinput.sendKeys("afx12345");
	}


}
