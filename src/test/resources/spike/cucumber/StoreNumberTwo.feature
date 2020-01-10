# new feature
# Tags: optional

@store
Feature: I should be able to store two
  This is to show how same object is injected across the stepdef classes in a single thread.

  Scenario: A scenario to check if I can store one
    Given I store 2
    When I wait for some 200 milliseconds
    Then value stored should still be 2