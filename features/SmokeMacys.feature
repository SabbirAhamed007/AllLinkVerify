Feature: Test smoke macys

  @tag1
  Scenario: Test smoke scenario
    Given I open chrome browser
    And I type macys website
    When I verify shop by department button
    Then I close the browser
