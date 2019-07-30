Feature: Test of Registering process


    @promo
  Scenario: Registering in Promo webappliaction
    Given User is on Promo website to register
    When User click on register button
    Then Register window is displayed
    When User enter email, nick, password and click SignUp button
    Then After register Promo create page is displayed


