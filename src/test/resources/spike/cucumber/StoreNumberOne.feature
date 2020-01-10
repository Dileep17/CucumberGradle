# new feature
# Tags: optional

@store
Feature: I should be able to store one
  This is to show how same object is injected across the stepdef classes in a single thread.

  @simple
  Scenario: A scenario to check if I can store one
    Given I store 1
    When I wait for some 200 milliseconds
    Then value stored should still be 1