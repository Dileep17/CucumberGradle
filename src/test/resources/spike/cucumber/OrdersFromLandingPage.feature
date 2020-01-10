Feature: Click on myorders

  Scenario: User should be redirected to login when clicked on orders
    Given I opened automationpractice.com
    When I clicked on My orders
    Then I should be redirected to login page