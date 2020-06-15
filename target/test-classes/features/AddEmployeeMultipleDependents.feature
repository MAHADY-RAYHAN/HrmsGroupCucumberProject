#Author: mahady@syntax.com
Feature: Dependents
  
  Description: As an admin I should be able to add employees multiple dependents by specifying name,relationship,date of birth

  @regression
  Scenario Outline: 
    Given Admin login successfully to Hrms Application
    And Admin navaigate to PIM page
    When Admin search Employee by id "13389" and click search
    And Admin click on the employe name
    And Admin click on Dependents
    Then click on add and enters  "<Name>","<Relationships>","<PleaseSpecify>","<DateOfBirth>"

    Examples: 
      | Name   | Relationships | PleaseSpecify | DateOfBirth |
      | Mahady | Other         | brother       | 1986-Jun-14 |
      | Rayhan | Other         | brother       | 1986-Jun-11 |
