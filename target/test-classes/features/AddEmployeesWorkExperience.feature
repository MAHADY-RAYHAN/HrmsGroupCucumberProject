#Author: mahady@syntax.com
Feature: Qualifications
  
  Description: As an admin I should be able to add employees Woek Experience by specifying Company, Job Title, From yyyy-M-dd, To yyyy-M-ddComment

  @smoke
  Scenario Outline: 
    Given Admin login successfully to Hrms Application
    And Admin navaigate to PIM page
    When Admin search Employee by id "13389" and click search
    And Admin click on the employe name
    And Admin click on Qualifications
    Then click on add and enters "<Company>","<JobTitle>","<From>","<To>","<Comment>"

    Examples: 
      | Company | JobTitle  | From        | To          | Comment                                 |
      | Syntax  | Test Lead | 2016-Jun-12 | 2020-Jun-14 | All the test cases running successfully |
