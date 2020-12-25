$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AdminLogin.feature");
formatter.feature({
  "name": "Admin can login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Admin is able to login and veryfy login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AdminLoginTest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Admin can enter valid login credential",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.Adminlogin.admin_can_enter_valid_login_credential()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin click on login button",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.Adminlogin.admin_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin can login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.Adminlogin.admin_can_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Admin is able to login and veryfy login page");
formatter.after({
  "status": "passed"
});
});