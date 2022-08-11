Feature: Register

  @Positive
  Scenario: User register using number phone
    Given User already on home page
    When User click "Daftar" menu
    And User input "081297251706" on field "register"