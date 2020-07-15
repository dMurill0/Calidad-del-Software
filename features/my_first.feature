Feature: Open feature
  open app
  Scenario: As a valid user I can open the app
    Given I wait for the "MainActivity" screen to appear
    When I press open
    Then I can play
