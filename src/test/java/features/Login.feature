Feature: LoginFromHomePage
  Scenario: Negative Login Validations
    Given Initialize the browser
    And Navigate to "https://www.crossover.com"
    When User Enters "email@test.com" and "Password" and logs in
    Then Logged in is "false"

#  Scenario: Positive Login Validations
#    Given Initialize the browser
#    And Navigate to "https://www.crossover.com"
#    When User Enters "email@test.com" and "Password" and logs in
#    Then Logged in is "true"