
Feature: Регистрация на потребител

  Scenario Outline: Регистарция на потребител с различни входни аргументи
    Given Потребителя отваря формата за регистарция
    When Въвежда потребителско име: "<name>"
    And Въвежда парола: "<password>"
    And Натиска бутона за регистрация
    Then Вижда съобщение: "<message>"

    Examples: 
      | name  | password | message  |
      | Lencho| pass1234 | success  |
      | Lencho|          | Fail     |
      |       | pass1234 | Fail     |
      |       |          | Fail     |
      |Lencho1| pass1234 | Fail     |
