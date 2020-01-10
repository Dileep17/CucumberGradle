Feature: This is for non search

  Scenario: Search for a non spec product
    Given I opened automationpractice.com
    When I searched for Dress
    Then I should see below products in search results
    | Printed Summer Dress  |
    | Printed Dress         |
