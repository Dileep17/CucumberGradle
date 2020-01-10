Feature: Search
  To show two scenarios in same feature file

  Scenario: Search for a specific product
    Given I opened automationpractice.com
    When I searched for Printed Dress
    Then I should see below products in search results
      | Printed Summer Dress  |
      | Printed Dress         |
      | Printed Chiffon Dress |
      | Printed Summer Dress  |
      | Printed Dress         |

  Scenario: User should be redirected to login when clicked on orders everytime
    Given I opened automationpractice.com
    When I clicked on My orders
    Then I should be redirected to login page