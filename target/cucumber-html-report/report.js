$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BugetTestWeb.feature");
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
      "line": 4,
      "value": "#-----------------------------------------------------------------------------------------------------------------------------------------------#"
    },
    {
      "line": 5,
      "value": "#Buget - Saravanan"
    },
    {
      "line": 6,
      "value": "#-----------------------------------------------------------------------------------------------------------------------------------------------#"
    }
  ],
  "line": 8,
  "name": "Verify user able to book cab in Buget portal",
  "description": "",
  "id": "buget-portal-functional-testing-on-open-environment;verify-user-able-to-book-cab-in-buget-portal",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Buget_1"
    },
    {
      "line": 7,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User has start the Driver \"web\" app",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User should lunch the Buget portal",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Choose Pick-Up location as \"Austin Bergstrom Intl Airport, Austin, Texas\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Choose Pickup Date and Return Date",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Click on Select My Car and validate pickup and return locations as \"Austin Bergstrom Intl Airport, AUS\"",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "Filter with SUV vehicles and Identify Low Price SUV vehicles and click on the Pay Now",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Checking the Vehicle Information and click on the Pay Now",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Capture and validate pickup and return locations from the previous page",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "Validate Vehicle Type from chosen vehicle List",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Validate estimated total and amount Prepaid",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "web",
      "offset": 27
    }
  ],
  "location": "BaseSteps.userHasAmazonApp(String)"
});
formatter.result({
  "duration": 2609988400,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.lunchURL()"
});
formatter.result({
  "duration": 4047790700,
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
  "duration": 2901832100,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.dateSettings()"
});
formatter.result({
  "duration": 1856351000,
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
  "duration": 8122956500,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.FilterVehicles()"
});
formatter.result({
  "duration": 3700418300,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.CheckingVehicleInformation()"
});
formatter.result({
  "duration": 22355540700,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.ValidatePickupAndReturnLocations()"
});
formatter.result({
  "duration": 127311200,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.ValidateVehicleType()"
});
formatter.result({
  "duration": 17864041700,
  "status": "passed"
});
formatter.match({
  "location": "BudgetSteps.ValidateEstimatedAndPrepaidAmount()"
});
formatter.result({
  "duration": 8318183800,
  "status": "passed"
});
});