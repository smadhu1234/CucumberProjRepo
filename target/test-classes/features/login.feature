# Comments
# @All Tags
@All 
Feature: User login
  Registered user should be able to login to access the account details
Background:
Given User navigates to the login page

@login @validcredentials @regression @div
  Scenario Outline: Login with valid credentials 
    When User enters valid email address <email>
    And User enters valid password <password>
    And Clicks on login button
    Then User should login successfully
Examples:
    |email          					|password|
    |amotooricap9@gmail.com   |12345|
    
    Scenario: Login with invalid credentials
   
    When User enters invalid email address "amotooricap343434343@gmail.com"
    And User enters invalid password "1234567890"
    And Clicks on login button
    Then User should get a proper warning message
    
    Scenario: Login with valid email id and invalid password credentials
   
    When User enters valid email address "amotooricap9@gmail.com"
    And User enters invalid password "123456789"
    And Clicks on login button
    Then User should get a proper warning message
    
    Scenario: Login with invalid email Id and valid password credentials
  
    When User enters invalid email address "amotooricap90909@gmail.com"
    And User enters valid password "12345"
    And Clicks on login button
    Then User should get a proper warning message

 