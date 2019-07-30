
    
Feature: Test of Loginig In and choosing template
    
  @promo
  Scenario: Login in Promo webappliaction
    Given User is on Promo website to login
    When User click on Login button
    Then Login window is displayed
    When User enter email, password and click LogIn button
    Then After login Promo create page is displayed
    When User choose that none above applies to him
    Then Field for user business is displayed
    When User write what his business is and click next button
    Then Welcome frame is displayed
    When user close welcome frame
    Then Template Library page is displayed
    When User hoover cursor over template
    Then Preview button is displaye
    When User choose template from library
    Then Preview is displayed


