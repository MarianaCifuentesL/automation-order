# language: en

Feature: Sales order management in the Serenity Demo platform
  As a registered employee in the system
  I want to register new orders
  So that I can document the sales made to customers

  Background:
    Given the user opens the browser
    When the user sends the credentials
      | user  | password |
      | admin |serenity  |

  @orders
  Scenario: Successful creation of a basic order with one product
    When the user navigates to the "Orders" section in the "Northwind" module
    And creates a new order with the following main information:
      | Customer   | Alfreds Futterkiste |
      | Order Date | current             |
      | Employee   | Laura Callahan      |
    And adds the following product to the order details:
      | Product  | Chai |
      | Quantity | 10   |
      | Price    | 18   |
    And saves the order record
    Then the system shall display that the order was successfully created