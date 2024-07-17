Feature: Test Cart Page

  Background: 
    Given User is Logged in Application
      | username      | password     |
      | standard_user | secret_sauce |
    Given User Add product to Cart

  Scenario: Test for Product Description
    Given User is on Cart Page
    When User get Product Description
    Then User Print the Product Description

  Scenario: Test for checkoutPro
    Given User is on Cart Page
    When User click on Checkout button
    Then User land on Checkout Page
