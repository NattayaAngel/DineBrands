Feature: Alert feature
  User Story: As a user, when I click pn alert, I should be able to see alert pop up and verify

  Background:
    Given user is on homepage

  Scenario: Verify alert pop up
    When user selects Alert Frame & Windows tile
    And user selects Alerts option from the side menu
    And user clicks on the On button click alert will appear after five seconds click me button
    Then Verify the alert pop up has appeared and close the alert pop up
