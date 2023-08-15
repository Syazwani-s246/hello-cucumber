#Feature: An example
#
#  Scenario: The example
#    Given an example scenario
#    When all step definitions are implemented
#    Then the scenario passes

Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask whether it's Friday yet
    Then I should be told "Nope"

  Scenario: Wednesday isn't Friday
    Given today is Wednesday
    When I inquire if it's Friday yet
    Then I should be informed "Nope"

  Scenario: Adding multiple items to the cart
    Given I am on the shopping page
    When I add the following items to the cart:
      | Item        | Quantity |
      | Chocolate   | 4        |
      | Apples      | 5        |
      | Bananas     | 3        |
      | Oranges     | 2        |
    Then the cart should contain 14 items



#  Scenario: Wednesday isn't Friday
#    Given today is Wednesday
#    When I ask whether it's Friday yet
#    Then I should be told "Nope"


