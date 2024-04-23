Feature:To check the functionalities of APay Dashboard

Background:
Given The user is on the Apay login page
When the user enters the customer ID, username and password
And the user click on the captcha box and click on login button
Then The user should be navigated to the Apay dashboard page

@Dashboard
Scenario: count the number of saved deals in dashboard
When click on the send payments option under saved deals
And it should navigate to the send payments page and need to count the deals under the page

@Dashboard_saved_sendpayments
Scenario: To approve the send payments deal under saved deals menu
When the user click on the send payments option under saved deals
And it should navigates to send payments page and the user clicks on action dropdown button and choose open option
Then it navigates to the send payments deal approval page and click on get quote button and click on submit for approval


