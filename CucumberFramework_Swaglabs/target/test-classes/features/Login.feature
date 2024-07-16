Feature: Test login functionality of Swaglabs application

  Background: 
    Given Swaglab Home is Open

  Scenario: Test of Title of Application
    When User get the title of home page
    Then Title should match with "Swag Labs"

  Scenario: Test for Valid Authentication
    When User enter valid Username and Password
    And Click on Login button
    Then User should able to login and nevigated to Inventory page
