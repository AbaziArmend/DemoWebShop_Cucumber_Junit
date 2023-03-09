Feature: Add item to shopping cart functionality for DemoWebShop
  User can add a item to the shopping cart if the item exist in the DemoWebShop
  User should be notified if the item is do not exist
  Item should be in the shopping cart when the item add to the shopping cart

  Scenario: Successfully add an item to the shopping cart
    Given I navigate to "TricentisDemoWebshop" website
    When I pass a "Blue Jeans" to input box "Search"
    And I click "Search" button
    And I click "Blue Jeans" button
    And I click "Add to cart" button
    And I click "Shopping cart" button
    Then I have successfully "add an item to the shopping cart"
    And I close the website


  Scenario: Failed add an iterm to the shopping cart
    Given I navigate to "TricentisDemoWebshop" website
    When I pass a "Negativtest" to input box "Search"
    And I click "Search" button
    Then I get an error "message no item found"
    And I close the website
