@BugetFunctionalTesting
Feature: Buget portal functional testing on open environment

  #-----------------------------------------------------------------------------------------------------------------------------------------------#
  #Buget - Saravanan
  #-----------------------------------------------------------------------------------------------------------------------------------------------#
  @Buget_1 @SmokeTest
  Scenario: Verify user able to book cab in Buget portal
    Given User has start the Driver "web" app
    And User should lunch the Buget portal
    And Choose Pick-Up location as "Austin Bergstrom Intl Airport, Austin, Texas"
    And Choose Pickup Date and Return Date
    Then Click on Select My Car and validate pickup and return locations as "Austin Bergstrom Intl Airport, AUS"
    And Filter with SUV vehicles and Identify Low Price SUV vehicles and click on the Pay Now
    When Checking the Vehicle Information and click on the Pay Now
    Then Capture and validate pickup and return locations from the previous page
    And Validate Vehicle Type from chosen vehicle List
    And Validate estimated total and amount Prepaid




