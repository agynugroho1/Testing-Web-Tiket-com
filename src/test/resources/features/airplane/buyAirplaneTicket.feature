Feature: Beli Tiket Pesawat

  Background:
    Given User already on home page
    When User click "Masuk" menu
    And User input "nuribnu1590@gmail.com" on field "email"
    And User click "Lanjutkan" button
    And User input "Tiket123" on field "password login"
    And User click "Log in" button

  @Positive
  Scenario: User buy one-way airplane ticket
    Given User already login
    And User Click button "/pesawat"
    Then User will direct to Airplane page
#    When User choose Radio button with text "Sekali Jalan"
    And User click the airport "Dari"
#    And On list of airport user select "JKTC"
#    And User click the airport "Ke"
#    And On list of airport user select "JOGC"
#    And User click the date on "Berangkat"
#    And User select the date "19 Agustus 2022"
#    And User click total passenger on "Penumpang & Kelas Kabin"
#    And User click button "+" and plus one adult passenger on passenger
#    And User select "Ekonomi" on list of cabin class
#    And User click button "SELESAI"
#    And User click button "CARI PENERBANGAN"
#    Then User will direct to Detail Penerbangan Page
#    And Select one of the available flight list using button "PILIH"
#    Then User will direct to Detail Pemesanan Page







