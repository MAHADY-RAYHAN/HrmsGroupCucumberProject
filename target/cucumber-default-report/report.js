$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmployeesWorkExperience.feature");
formatter.feature({
  "name": "Qualifications",
  "description": "  Description: As an admin I should be able to add employees Woek Experience by specifying Company, Job Title, From yyyy-M-dd, To yyyy-M-ddComment",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "Admin login successfully to Hrms Application",
  "keyword": "Given "
});
formatter.step({
  "name": "Admin navaigate to PIM page",
  "keyword": "And "
});
formatter.step({
  "name": "Admin search Employee by id \"13389\" and click search",
  "keyword": "When "
});
formatter.step({
  "name": "Admin click on the employe name",
  "keyword": "And "
});
formatter.step({
  "name": "Admin click on Qualifications",
  "keyword": "And "
});
formatter.step({
  "name": "click on add and enters \"\u003cCompany\u003e\",\"\u003cJobTitle\u003e\",\"\u003cFrom\u003e\",\"\u003cTo\u003e\",\"\u003cComment\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Company",
        "JobTitle",
        "From",
        "To",
        "Comment"
      ]
    },
    {
      "cells": [
        "Syntax",
        "Test Lead",
        "2016-Jun-12",
        "2020-Jun-14",
        "All the test cases running successfully"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin login successfully to Hrms Application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddMultipleDependents.admin_login_successfully_to_Hrms_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin navaigate to PIM page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddMultipleDependents.admin_navaigate_to_PIM_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin search Employee by id \"13389\" and click search",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddMultipleDependents.admin_search_Employee_by_id_and_click_search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin click on the employe name",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddMultipleDependents.admin_click_on_the_employe_name_and_the_employee_is_displayed_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin click on Qualifications",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWorkExperience.admin_click_on_Qualifications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on add and enters \"Syntax\",\"Test Lead\",\"2016-Jun-12\",\"2020-Jun-14\",\"All the test cases running successfully\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWorkExperience.click_on_add_and_enters(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "");
formatter.after({
  "status": "passed"
});
});