Feature: Change customer password functionality for DemoWebshop
  User can change his password
  Data should ben changed
  User should be notified if the password is not correct.

  Scenario: Change customer password
    Given I navigate to "TricentisDemoWebshop" website
    And I click "Log in" button
    And I pass a "armend@hotmail.com" to input box "Email log in"
    And I pass a "12345abc" to input box "Password log in"
    And I click "Login" button
    And I click "Account" button
    When I click "Change Password" button
    And I pass a "12345abc" to input box "Old password"
    And I pass a "12345abc" to input box "New password"
    And I pass a "12345abc" to input box "Confirm password"
    And I click "change password" button
    Then I have successfully "change my password"
    And I close the website


  Scenario: Change customer password
    Given I navigate to "TricentisDemoWebshop" website
    And I click "Log in" button
    And I pass a "armend@hotmail.com" to input box "Email log in"
    And I pass a "12345abc" to input box "Password log in"
    And I click "Login" button
    And I click "Account" button
    When I click "Change Password" button
    And I pass a "12345ab" to input box "Old password"
    And I pass a "12345abc" to input box "New password"
    And I pass a "12345abc" to input box "Confirm password"
    And I click "change password" button
    Then I get an error "message for old password"
    And I close the website


  Scenario: Change customer password
    Given I navigate to "TricentisDemoWebshop" website
    And I click "Log in" button
    And I pass a "armend@hotmail.com" to input box "Email log in"
    And I pass a "12345abc" to input box "Password log in"
    And I click "Login" button
    And I click "Account" button
    When I click "Change Password" button
    And I pass a "12345abc" to input box "Old password"
    And I pass a "12345abc" to input box "New password"
    And I pass a "12345ab" to input box "Confirm password"
    And I click "change password" button
    Then I get an error "message for new password not confirm"
    And I close the website


  Scenario: Change customer password
    Given I navigate to "TricentisDemoWebshop" website
    And I click "Log in" button
    And I pass a "armend@hotmail.com" to input box "Email log in"
    And I pass a "12345abc" to input box "Password log in"
    And I click "Login" button
    And I click "Account" button
    When I click "Change Password" button
    And I pass a "12345abc" to input box "Old password"
    And I pass a "12345" to input box "New password"
    And I pass a "12345" to input box "Confirm password"
    And I click "change password" button
    Then I get an error "message for new password to short"
    And I close the website
