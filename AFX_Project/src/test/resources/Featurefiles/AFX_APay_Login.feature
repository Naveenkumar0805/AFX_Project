Feature: To check APay Multi user Login

Scenario Outline: Login into Apay Application
Given user is on the Apay login page
When user enters the "<customerID>", "<username>" and "<password>"
And user click on the captcha box and click on login button
Then user should be navigated to the Apay dashboard page


Examples:
| customerID | username | password |
| 0005448    | adminj   | afx12345 |
| 0005560    | adminj   | afx12345 |
| 0006094    | adminj   | afx12345 |
| 0006059    | adminj   | afx12345 |
| 0007147    | adminj   | afx12345 |



