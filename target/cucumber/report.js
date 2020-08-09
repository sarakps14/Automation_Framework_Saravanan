$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LoginTestWeb.feature");
formatter.feature({
  "line": 2,
  "name": "Buget portal functional testing on open environment",
  "description": "",
  "id": "buget-portal-functional-testing-on-open-environment",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BugetFunctionalTesting"
    }
  ]
});
formatter.scenario({
  "comments": [
    {
      "line": 12,
      "value": "#-----------------------------------------------------------------------------------------------------------------------------------------------#"
    },
    {
      "line": 13,
      "value": "#Buget - Saravanan"
    },
    {
      "line": 14,
      "value": "#-----------------------------------------------------------------------------------------------------------------------------------------------#"
    }
  ],
  "line": 16,
  "name": "Verify user able to book cab for Pickup and Return",
  "description": "",
  "id": "buget-portal-functional-testing-on-open-environment;verify-user-able-to-book-cab-for-pickup-and-return",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Buget_1"
    },
    {
      "line": 15,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User has Amazon \"web\" app",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "User should lunch the Buget portals",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Choose Pick-Up location as \"Austin Bergstrom Intl Airport, Austin, Texas\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Choose Pickup Date and Return Date",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Click on Select My Car and validate pickup and return locations as \"Austin Bergstrom Intl Airport, AUS\"",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "Filter with SUV vehicles and Identify Low Price SUV vehicles and click on the Pay Now",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Checking the Vehicle Information and click on the Pay Now",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Capture and validate pickup and return locations from the previous page",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "Validate Vehicle Type from chosen vehicle List",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Validate estimated total and amount Prepaid",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "web",
      "offset": 17
    }
  ],
  "location": "BaseSteps.userHasAmazonApp(String)"
});
formatter.result({
  "duration": 2388872900,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.lunchURL()"
});
formatter.result({
  "duration": 2708715400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Austin Bergstrom Intl Airport, Austin, Texas",
      "offset": 28
    }
  ],
  "location": "BudgetSteps.enterTheLocation(String)"
});
formatter.result({
  "duration": 2553852800,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.dateSettings()"
});
formatter.result({
  "duration": 958200500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Austin Bergstrom Intl Airport, AUS",
      "offset": 68
    }
  ],
  "location": "BudgetSteps.ValidatingPickupAndReturnLocations(String)"
});
formatter.result({
  "duration": 5584112800,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.FilterVehicles()"
});
formatter.result({
  "duration": 1998110800,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.CheckingVehicleInformation()"
});
formatter.result({
  "duration": 21258766600,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.ValidatePickupAndReturnLocations()"
});
formatter.result({
  "duration": 87594300,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.ValidateVehicleType()"
});
formatter.result({
  "duration": 3347068600,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.ValidateEstimatedAndPrepaidAmount()"
});
formatter.result({
  "duration": 554950400,
  "status": "passed"
});
});