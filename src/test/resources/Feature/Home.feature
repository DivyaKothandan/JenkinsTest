@Testscenario
Feature: Validating the new features of IRCTC Homepage
Scenario Outline: Validate Home page with valid data
Given Open Browser as <BROWSER>
Then Enter Url as <URL>
Then Enter Username as <USERNAME>

Examples: 
|BROWSER|URL|
|Firefox|http://www.irctc.com/|

@Login
Scenario: Validate Home page with invalid data
Given Open Browser
When Enter Url
Then validating the home page

@pwor
Scenario: Validate home page with validation data
Given Open Browser
When Enter Url
Then validtion part