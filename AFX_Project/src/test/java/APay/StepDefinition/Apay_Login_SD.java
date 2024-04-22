package APay.StepDefinition;

import APay.APay_Baseclass;
import APay.POM.Apay_Login_POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Apay_Login_SD extends APay_Baseclass {
	
	Apay_Login_POM loginpage = new Apay_Login_POM();
	
	@Given("The user is on the Apay login page")
	public void the_user_is_on_the_apay_login_page() {

		getDriver();
		loginpage.openApay();
	}

//	@When("the user enters the {string}, {string} and {string}")
//	public void the_user_enters_the_and(String string, String string2, String string3) {
//	    loginpage.entercredentials(string, string2, string3);
//	}

	
	@When("the user enters the customer ID, username and password")
	public void the_user_enters_the_customer_id_username_and_password() {
		
		loginpage.entercredentials("0005448", "adminj", "afx12345");
	}

	@When("the user click on the captcha box and click on login button")
	public void the_user_click_on_the_captcha_box_and_click_on_login_button() {
	  
		loginpage.login();
		
	}

	@Then("The user should be navigated to the Apay dashboard page")
	public void the_user_should_be_navigated_to_the_apay_dashboard_page() {
		
		loginpage.APay_Dashboard();
	}
	


}
