Feature: Login Page Aplikasi Kasir Aja

  Scenario: Login Sukses
    Given Page login Website
    When Input username
    And Input password
    And Klik tombol login
    Then User ke halaman dashboard