package APay.StepDefinition;

import APay.APay_Baseclass;
import APay.POM.APay_MultiLogin_POM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class APay_MultiLogin_SD extends APay_Baseclass {
	
	APay_MultiLogin_POM loginpage = new APay_MultiLogin_POM();
	
	@Given("user is on the Apay login page")
	public void the_user_is_on_the_apay_login_page() {

		getDriver();
		loginpage.openApay();
	}

	@When("user enters the {string}, {string} and {string}")
	public void user_enters_the_and(String string, String string2, String string3) {
	    loginpage.entercredentials(string, string2, string3);
	}


	@When("user click on the captcha box and click on login button")
	public void user_click_on_the_captcha_box_and_click_on_login_button() {
	  
		loginpage.login();
		
	}

	@Then("user should be navigated to the Apay dashboard page")
	public void user_should_be_navigated_to_the_apay_dashboard_page() {
		
		loginpage.APay_Dashboard();
	}
	

}
