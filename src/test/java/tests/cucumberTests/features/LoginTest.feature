
@login
Feature: Verify login functionality and select product in the Amazon app

  Background: Create an instance of android or ios driver before each scenario
    Given User has start the Driver "android" app

  @Mobile_App_Testing
  Scenario: User should be able to login on app and add product in the list
    Given taps on "language" image
    And taps on "signin" button
    Given user has "valid" username and password
    When user enters credentials and submit the button
    Then Search the "65 inch TV" product in the search textbox
    And user should be able to scroll and select the product in the search list
    And user click the buy button and validate the response

  @Mobile_App_Testing @SmokeTest
  Scenario: User should be able to search the product in the list
    Given taps on "continue" Continue button
    Then Search the "65 inch TV" product in the search textbox
    And user should be able to scroll and select the product in the search list
    And user click the buy button and validate the response
