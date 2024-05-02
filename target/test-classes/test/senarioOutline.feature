Feature: Search functionality
  User should be able to search the product and will get the search results

Background:
 Given User navigates to the listing page
 
  Scenario Outline: Search for a valid product
    When User enters valid prouduct into the search box <pname>
    And User clicks on the search button
    Then Valid products should be displayed in the search results
    Examples:
    |pname|
    |Hardware|
    |Laptops|
    
    Scenario: Search for non-existing product
    When User enters non-existing prouduct into the search box 
    And User clicks on the search button
    Then Proper text informing the user about no product matching should be displayed
    
  Scenario: Search for an invalid product 
    When User enters invalid prouduct into the search box
    And User clicks on the search button
    Then Proper text informing the user about no product matching should be displayed
       
