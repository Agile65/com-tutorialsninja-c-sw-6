$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyAccounts.feature");
formatter.feature({
  "line": 1,
  "name": "User Accounts test cases",
  "description": "",
  "id": "user-accounts-test-cases",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5162165900,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Verify that user should Login and Logout successfully",
  "description": "",
  "id": "user-accounts-test-cases;verify-that-user-should-login-and-logout-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I am on the homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "I click on My Account link",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I can call the method selectMyAccountOptions method with the parameter \"Login\"",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I enter Email address and and I enter Password and I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "I can see the text “My Account”",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "I click on the My Account Link.",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I call the method “selectMyAccountOptions” method and pass the parameter “Logout”",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I can see text “Account Logout”",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "I click on Continue button",
  "keyword": "And "
});
formatter.match({
  "location": "TopmenuSteps.iAmOnTheHomepage()"
});
formatter.result({
  "duration": 80893400,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountsSteps.iClickOnMyAccountLink()"
});
formatter.result({
  "duration": 100067900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Login",
      "offset": 72
    }
  ],
  "location": "MyAccountsSteps.iCanCallTheMethodSelectMyAccountOptionsMethodWithTheParameter(String)"
});
formatter.result({
  "duration": 486140600,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountsSteps.iEnterEmailAddressAndAndIEnterPasswordAndIClickOnLoginButton()"
});
formatter.result({
  "duration": 768374500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountsSteps.iCanSeeTheTextMyAccount()"
});
formatter.result({
  "duration": 59822400,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountsSteps.iClickOnTheMyAccountLink()"
});
formatter.result({
  "duration": 41424500,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountsSteps.iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout()"
});
formatter.result({
  "duration": 846343800,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountsSteps.iCanSeeTextAccountLogout()"
});
formatter.result({
  "duration": 44408300,
  "status": "passed"
});
formatter.match({
  "location": "MyAccountsSteps.iClickOnContinueButton()"
});
formatter.result({
  "duration": 373043100,
  "status": "passed"
});
formatter.after({
  "duration": 809790100,
  "status": "passed"
});
});