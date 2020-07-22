
@login
Feature: Verify login functionality and select product in the Amazon app

  Background: Create an instance of android or ios driver before each scenario
    Given User has Amazon "android" app

  Scenario: User should be able to login on app and add product in the list
    Given taps on "language" image
    And taps on "signin" button
    Given user has "valid" username and password
    When user enters credentials and submit the button
    Then Search the "65 inch TV" product in the search textbox
    And user should be able to scroll and select the product in the search list
    And user click the buy button and validate the response

