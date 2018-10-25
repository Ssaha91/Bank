$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login",
  "description": "This feature deals with the login functionality",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Navigate to facebook homepage",
  "description": "",
  "id": "facebook-login;navigate-to-facebook-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on facebook homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.iAmOnFacebookHomepage()"
});
formatter.result({
  "duration": 248975764,
  "status": "passed"
});
});