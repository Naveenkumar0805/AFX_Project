package APay.StepDefinition;

import APay.APay_Baseclass;
import APay.POM.APay_DashboardSaved_QB_POM;
import APay.POM.APay_Dashboard_POM;
import APay.POM.APay_Dashboard_RP_POM;
import APay.POM.Apay_DashboardSaved_SP_POM;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class APay_Dashboard extends APay_Baseclass {
	
	APay_Dashboard_POM dashboard = new APay_Dashboard_POM();
	Apay_DashboardSaved_SP_POM saved_Sendpayments = new Apay_DashboardSaved_SP_POM();
	APay_Dashboard_RP_POM saved_Receivepayments = new APay_Dashboard_RP_POM();
	APay_DashboardSaved_QB_POM saved_QuoteAndBook = new APay_DashboardSaved_QB_POM();
	
	@When("click on the send payments option under saved deals")
	public void click_on_the_send_payments_option_under_saved_deals() {
	    
		dashboard.dashboard_saved();
	}

	@When("it should navigate to the send payments page and need to count the deals under the page")
	public void it_should_navigate_to_the_send_payments_page_and_need_to_count_the_deals_under_the_page() {
	   
		dashboard.sendpayments_count();		
	}
	
	@When("the user click on the send payments option under saved deals")
	public void the_user_click_on_the_send_payments_option_under_saved_deals() {

		saved_Sendpayments.dashboard_saved();
	}

	@When("it should navigates to send payments page and the user clicks on action dropdown button and choose open option")
	public void it_should_navigates_to_send_payments_page_and_the_user_clicks_on_action_dropdown_button_and_choose_open_option() {
		
		saved_Sendpayments.action_dropdown();
	}

	@Then("it navigates to the send payments deal approval page and click on get quote button and click on submit for approval")
	public void it_navigates_to_the_send_payments_deal_approval_page_and_click_on_get_quote_button_and_click_on_submit_for_approval() {
	    
		saved_Sendpayments.getquote_and_submit();
	}
	
	@When("the user click on the receive payments option under saved deals")
	public void the_user_click_on_the_receive_payments_option_under_saved_deals() {
	  
		saved_Receivepayments.dashboard_ReceivePayments();
	}
	
	@When("it should navigates to receive payments page and the user clicks on action dropdown button and choose open option")
	public void it_should_navigates_to_receive_payments_page_and_the_user_clicks_on_action_dropdown_button_and_choose_open_option() {

		saved_Receivepayments.action_dropdown();
		
	}
	
	
	@When("the user click on the quote and book option under saved deals")
	public void the_user_click_on_the_quote_and_book_option_under_saved_deals() {

		saved_QuoteAndBook.dashboard_QuoteAndBook();
	}
	
	@When("it should navigates to quote and book page and the user clicks on action dropdown button and choose open option")
	public void it_should_navigates_to_quote_and_book_page_and_the_user_clicks_on_action_dropdown_button_and_choose_open_option() {

		saved_QuoteAndBook.action_dropdown();
	}



}
