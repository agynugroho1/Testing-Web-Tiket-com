Feature: Login

  @Positive
  Scenario: User Login using Email
    Given User already on home page
    When User click "Masuk" menu
    And User input "nuribnu1590@gmail.com" on field "email"
    And User click "Lanjutkan" button
    And User input "Tiket123" on field "password login"
    And User click "Log in" button
