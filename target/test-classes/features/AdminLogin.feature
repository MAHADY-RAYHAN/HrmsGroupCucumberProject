#Author: Mahady Rayhan
Feature: Admin can login

  @AdminLoginTest
  Scenario: Admin is able to login and veryfy login page
    Given Admin can enter valid login credential
    When Admin click on login button
    Then Admin can login successfully
