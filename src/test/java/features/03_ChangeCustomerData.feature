Feature: Change customer data functionality for DemoWebshop
  User can change his data
  Data should ben changed

  Scenario: Change customer Address
    Given I navigate to "TricentisDemoWebshop" website
    And I click "Log in" button
    And I pass a "armend@hotmail.com" to input box "Email log in"
    And I pass a "12345abc" to input box "Password log in"
    And I click "Login" button
    And I click "Account" button
    When I click "Addresses" button
    And I click "Edit" button
    And I pass a "Am kleinen Teich 5" to input box "Address 1"
    And I click "Save" button
    Then I have successfully "change my address"
    And I close the website


