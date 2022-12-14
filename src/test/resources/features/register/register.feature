Feature: Register

  @Positive
  Scenario: User register using number phone
    Given User already on home page
    When User click "Daftar" menu
    And User input "81284814617" on field "register"
    And User click "Lanjutkan" button
    And User click "YA, LANJUTKAN" button
    Then Entry OTP page appear

  Scenario: User register using email
    Given User already on home page
    When User click "Daftar" menu
    And User input "testauromatetiketcomlinux@gmail.com" on field "register"
    And User click "Lanjutkan" button
    And User click "YA, LANJUTKAN" button
    And User choose title "Tuan"
    And User input "Keprek" on field "first name"
    And User input "Wahyudi" on field "last name"
    And User input "89812972517" on field "number phone"
    And User input "Password123" on field "password"
    And User click "Buat Akun" button
    And Entry OTP page appear