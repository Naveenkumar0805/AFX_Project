Feature: To check APay Multi user Login

@Dashboard_saved_sendpayments_count @Dashboard_saved_sendpayments
Scenario Outline: Login into Apay Application
Given user is on the Apay login page
When user enters the "<customerID>", "<username>" and "<password>"
And user click on the captcha box and click on login button
Then user should be navigated to the Apay dashboard page

When click on the send payments option under saved deals
And it should navigate to the send payments page and need to count the deals under the page

When the user click on the send payments option under saved deals
And it should navigates to send payments page and the user clicks on action dropdown button and choose open option
Then it navigates to the send payments deal approval page and click on get quote button and click on submit for approval

Examples:
| customerID | username | password |
| 0005560    | adminj   | afx12345 |
| 0006094    | adminj   | afx12345 |
| 0005448    | AdminJ   | afx12345 |
| 0007178    | adminsm   | Afx12345! |
| 0006820    | adminsm   | afx12345 |
| 0007147    | adminnus   | afx12345 |
| 0006059    | adminj   | afx12345 |
| 2000042    | Adminnuk   | Afx@12345 |
| 0005135    | adminjui   | Afx@12345 |
| 2000005    | adminfmuk   | afx12345 |




