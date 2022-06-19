Feature: Alert feature
  User Story: As a user, when I click pn alert, I should be able to see alert and verify

  Background:
    Given user is on homepage
    When user select Elements tile
  @wip
  Scenario: Verify alert pop up
    And user selects Alert, Frame, & Windows
    And user selects Alerts option from the side menu
    And user clicks on the On button click alert will appear after five seconds click me button
    Then Verify the alert pop up has appeared
    And close the alert pop up