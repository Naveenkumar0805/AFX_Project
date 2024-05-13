Feature: check APay Multi user Login

#Scenario: Login into Apay Application using Excel data
    #Given user is on to the Apay login page
    #When user logs in using Excel credentials
    #Then user should be navigated to the Apay dashboard page
    
@Dashboard_saved_sendpayments_count
Scenario: count the number of saved deals in dashboard
When click on the send payments option under saved deals
And it should navigate to the send payments page and need to count the deals under the page

@Dashboard_saved_sendpayments
Scenario: To approve the send payments deal under saved deals menu
When the user click on the send payments option under saved deals
And it should navigates to send payments page and the user clicks on action dropdown button and choose open option
Then it navigates to the send payments deal approval page and click on get quote button and click on submit for approval
