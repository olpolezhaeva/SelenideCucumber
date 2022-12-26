Feature: Credits

Background:
    Given Open 'https://kk.bank'
    When Go to Credits item

  Scenario: Navigate to Credits Page
    Then Header is 'Кредиты частным клиентам'

  Scenario Outline: Credit calculator
    And Input "<credit_summ>" to Credit summ and "<credit_srok>" to Credit srok fields
    And Click on calc button
    Then Cred calc result block should be displayed
    Examples:
      | credit_summ | credit_srok |
      | 1000000     | 6           |
