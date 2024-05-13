Feature:To check the functionalities of APay Dashboard

Background:
Given The user is on the Apay login page
When the user enters the customer ID, username and password
And the user click on the captcha box and click on login button
Then The user should be navigated to the Apay dashboard page

@Dashboard_saved_sendpayments_count
Scenario: count the number of saved deals in dashboard
When click on the send payments option under saved deals
And it should navigate to the send payments page and need to count the deals under the page

@Dashboard_saved_sendpayments
Scenario: To approve the send payments deal under saved deals menu
When the user click on the send payments option under saved deals
And it should navigates to send payments page and the user clicks on action dropdown button and choose open option
Then it navigates to the send payments deal approval page and click on get quote button and click on submit for approval

@Dashboard_saved_Receivepayments
Scenario: count the number of receive payment deals and approve it under saved deals in dashboard
When the user click on the receive payments option under saved deals
And it should navigates to receive payments page and the user clicks on action dropdown button and choose open option

@Dashboard_saved_QuoteAndBook
Scenario: count the number of quote and book deals and approve it under saved deals in dashboard
When the user click on the quote and book option under saved deals
And it should navigates to quote and book page and the user clicks on action dropdown button and choose open option