Feature: User login
User should be able to login to view the account details

Scenario: User should be able to login the account with valid credentials
When User enters the valid email ID
And User enters the valid password
And User clicks on Login button
Then User is able to login the account

Scenario: User should not be able to login the account with invalid credentials
When User enters the valid email ID
And User enters the invalid pasword
And User clicks on the Login button
Then User shoule get the validation error message with the details