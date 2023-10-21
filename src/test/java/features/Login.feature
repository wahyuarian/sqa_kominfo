Feature: Login Page Aplikasi Kasir Aja

  Scenario: Login Sukses
    Given Halaman login SauceDemo
    When Input username
    And Input password
    And Klik tombol login
    Then User ke halaman dashboard

  Scenario:  Login gagal
    Given Halaman login SauceDemo
    When Input username
    And Input Invalid password
    And Klik tombol login
    Then User menerima pesan gagal login