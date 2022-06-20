Feature: Navigate feature
  User Story: As a user, I should be able to navigate on toolsqa webpage

  Background:
  Given user is on homepage

  Scenario: Navigate and verify Angular
    When user selects Elements tile
    And user selects the Check Box option from the side menu
    And user clicks on the + button on the top right corner
    And user selects Home>Workspace>Angular checkbox
    Then verify that the selection is Angular checkbox
    And user unchecks Angular checkbox
    Then verify the checkbox in not selected

