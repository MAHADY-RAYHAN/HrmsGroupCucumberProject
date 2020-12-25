#Author: Mahady
Feature: 
@FacebookSignUp
  Scenario Outline: 
    

    Given that user clicks on create a new account
    When user selects "<Gender>"
    Then user is able to sign up

    Examples: 
      | Gender |
      | Female |
      | Male   |
