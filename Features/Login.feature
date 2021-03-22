Feature: Login

Scenario: Successful Login With Valid Credentials
Given User launch Chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/"
And User enters email as "admin@yourstore.com" and password as "admin"
And click on login
Then Page title should be "Dashboard / nopCommerce administration"
When User click on logout link
Then Page Title should be "Your store. Login"
And close browser

Scenario Outline: Login Data Driven
Given User launch Chrome browser
When User opens URL "https://admin-demo.nopcommerce.com/"
And User enters email as "<email>" and password as "<password>"
And click on login
Then Page title should be "Dashboard / nopCommerce administration"
When User click on logout link
Then Page Title should be "Your store. Login"
And close browser

Examples:
|email|password|
|admin@yourstore.com| admin|
|admin@yourstore.com| admin12|
