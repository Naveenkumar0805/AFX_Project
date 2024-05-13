Feature: APay Login

Background:
Given The user is on the Apay login page
When the user enters the customer ID, username and password
And the user click on the captcha box and click on login button
Then The user should be navigated to the Apay dashboard page

Scenario: To Quote and book in Apay
When The user click on the quote and book menu
And the user select the new option from quote and book
When the user selects the buy currency and enters the buy amount 
Then the the user click on the get quote button and click on accept

When The user click on payee name and select the payee from the dropdown
And the user adds the payment reference, internal reference and click on add payments button
Then the payment is once added and click on submit for approval button
