$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Home.feature");
formatter.feature({
  "line": 2,
  "name": "Validating the new features of IRCTC Homepage",
  "description": "",
  "id": "validating-the-new-features-of-irctc-homepage",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Testscenario"
    }
  ]
});
formatter.scenario({
  "line": 13,
  "name": "Validate Home page with invalid data",
  "description": "",
  "id": "validating-the-new-features-of-irctc-homepage;validate-home-page-with-invalid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "Open Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "Enter Url",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "validating the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.openBrowser()"
});
formatter.result({
  "duration": 11645398600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.EnterUrl()"
});
formatter.result({
  "duration": 12856259600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.Validation()"
});
formatter.result({
  "duration": 759135800,
  "status": "passed"
});
});