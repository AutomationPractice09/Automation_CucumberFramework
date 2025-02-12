Feature: Test Inventory Page

  Background: 
    Given User is Logged in Application
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario: Test for Total Product count
    Given User is on Inventory Page
    When User get Product count
    Then Total product should be match with 6

  Scenario: Test for Product List
    Given User is on Inventory Page
    When User get the Product list
    Then List should be display all products

  Scenario: Test for Add product to Cart
    Given User is on Inventory Page
    When User add product into cart
    Then Product should be added successfully
