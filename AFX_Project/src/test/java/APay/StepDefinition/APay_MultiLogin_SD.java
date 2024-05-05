package APay.StepDefinition;

import java.util.List;

import org.testng.Assert;

import APay.APay_Baseclass;
import APay.POM.APay_MultiLogin_POM;
import io.cucumber.java.Before;
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


	//	private List<List<String>> credentials;
	//
	//    @Before
	//    public void setup() throws Exception {
	//        loginpage = new APay_MultiLogin_POM();
	//        APay_Baseclass Excelreader = new APay_Baseclass();
	//        credentials = Excelreader.readExcel("F://AFX Login creds/APay_credentials.xlsx", "Sheet1");
	//    }
	//
	//    @Given("user is on to the Apay login page")
	//    public void the_user_is_on_to_the_apay_login_page() {
	//        getDriver();
	//        loginpage.openApay();
	//    }
	//
	//    @When("user logs in using Excel credentials")
	//    public void user_logs_in_using_excel_credentials() {
	//        for (List<String> credential : credentials) {
	//            String customerID = credential.get(0);
	//            String username = credential.get(1);
	//            String password = credential.get(2);
	//
	//            loginpage.entercredentials(customerID, username, password);
	//            loginpage.login();
	//           // loginpage.APay_Dashboard();
	//           
	//        }
	//    }
	//    
	//    @Then("user should be navigated to the Apay dashboard page")
	//	public void user_should_be_navigated_to_the_apay_dashboard_page() {
	//		
	//		loginpage.APay_Dashboard();
	//		
	//	}
	//	

}
