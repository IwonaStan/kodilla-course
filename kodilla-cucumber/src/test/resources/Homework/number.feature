Feature: number
  Is the number divisible by 3 or 5 or both?

  Scenario Outline: The number is or isn't divisible by 3 or 5 or both
    Given <number>
    When I ask is divisible
    Then I should told <answer>
    Examples:
      |number|answer|
      |6|"Fizz"|
      |10|"Buzz"|
      |15|"FizzBuzz"|
      |4|"None"|
      |8|"None"|
      |11|"None"|