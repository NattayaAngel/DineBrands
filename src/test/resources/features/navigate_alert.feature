Feature: Navigate feature
  User Story: As a user, I should be able to navigate on toolsqa webpage

  Background:
  Given user is on homepage
  When user select Elements tile

  Scenario: Navigate and verify Angular
    And user select the Check Box option from the side menu
    And user clicks on the + button on the top right corner
    And user select Home>Workspace>Angular checkbox
    Then verify that the selection is Angular checkbox
    And user unchecks Angular checkbox
    Then verify the checkbox in not selected

