package APay.StepDefinition;


import APay.APay_Baseclass;
import APay.POM.Apay_QuoteAndBook_POM;
import io.cucumber.java.After;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Apay_QuoteAndBook extends APay_Baseclass {
	
	Apay_QuoteAndBook_POM QuoteAndBook = new Apay_QuoteAndBook_POM();

	@When("The user click on the quote and book menu")
	public void the_user_click_on_the_quote_and_book_menu() {

		QuoteAndBook.QuoteandBook();
	}

	@When("the user select the new option from quote and book")
	public void the_user_select_the_new_option_from_quote_and_book() {

		QuoteAndBook.QuoteandBook_New();

	}

	@When("the user selects the buy currency and enters the buy amount")
	public void the_user_selects_the_buy_currency_and_enters_the_buy_amount() {

		QuoteAndBook.Select_currencyAndAmount("2356.77");
	} 

	@Then("the the user click on the get quote button and click on accept")
	public void the_the_user_click_on_the_get_quote_button_and_click_on_accept() {

		QuoteAndBook.Get_quote();

	}

	@When("The user click on payee name and select the payee from the dropdown")
	public void the_user_click_on_payee_name_and_select_the_payee_from_the_dropdown() throws InterruptedException {


		QuoteAndBook.select_payee();
	}
	
	@When("the user adds the payment reference, internal reference and click on add payments button")
	public void the_user_adds_the_payment_reference_internal_reference_and_click_on_add_payments_button() {

		QuoteAndBook.payment_Reference("#PRef_1", "#IRef_1");

	}
	@Then("the payment is once added and click on submit for approval button")
	public void the_payment_is_once_added_and_click_on_submit_for_approval_button() {

		QuoteAndBook.payment_Approval();
		

	}


}
