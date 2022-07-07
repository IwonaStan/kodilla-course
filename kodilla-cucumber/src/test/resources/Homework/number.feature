Feature: number
  Is the number divisible by 3 or 5 or both?

  Scenario Outline: The number is or isn't divisible by 3 or 5 or both
    Given <number>
    When I ask is divisible
    Then I should told <answer>
    Examples:
      |number|answer|
      |6|"yes"|
      |10|"yes"|
      |15|"yes"|
      |4|"no"|
      |8|"no"|
      |11|"no"|