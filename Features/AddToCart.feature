
Feature: Purchase from testme app
  
  Scenario: SignIn into Testme app and click product to purchase
    Given User opens the Home page 
    And User clicks on the SignIn page
    When User gives username as "lalitha" 
    And User enters password as "password123"
    And User clicks on the login button
    And User searches "head" in the search bar to scroll down and select homepage
    And User clicks on Add to Cart button
    And User clicks on cart link
    Then Cart page is displayed
    When User clicks on Checkout button
    And User enters Shipping address as "Ranchi"
    And User clicks on Proceed to pay button
    Then Payment page is displayed
    When User selects Bank in net banking
    And User clicks on continue button 
    And User provides username as "123456"
    And User enters password as "Pass@456"
    And User clicks on LOGIN Button
    And User enters transaction password as "Trans@456"
    And User clicks on PAYNOW Button
    Then Order details are displayed