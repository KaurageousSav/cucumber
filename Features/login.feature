Feature: SignIn Feature
 
  Scenario Outline: User SignIn in TestMeApp

    Given User opens the application 
    When  User clicks on Signin link
    And   user enters "<username>" and "<password>"
    Then  Home page is openned
    
    Examples: 
      | username  | password   | 
      | AlexUser  | Alex@123   |
      | tuffy     | password123|