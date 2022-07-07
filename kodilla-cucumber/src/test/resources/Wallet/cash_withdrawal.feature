Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Large withdrawal request
    Given I have deposited $200 in my wallet
    When I request $201
    Then $200 should be dispensed

  Scenario: No deposit
    Given I have deposited $0 in my wallet
    When I request $30
    Then $0 should be dispensed