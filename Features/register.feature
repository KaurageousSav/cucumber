Feature: Register Feature
 
  Scenario: User registers himself in tetmeapp
    Given Home page is openned 
    And  Signup link is clicked
    When User enters username as "tuffy"
    And User gives his first name "savleen"
    And User gives his last name "kaur"
    And User enters password "password123"
    And User re-enters the password as "password123"
    And User selects gender as "female"
    And User gives email id "1507054@kiit.ac.in"
    And User gives mobile number "1235678900"
    And User enter date of birth "09/09/2011"
    And User enters address "asdfghjkloiuytrewq"
    And User selects security question "What is your Pet name"
    And User gives the answer to the security question "Snuffy"
    Then User will find the LogIn page