Feature: Send Customer Request functionality for DemoWebShop
  User can send an Request to the customer service, if the name, e-mail and enquiry are entered.
  User should be notified if the name, e-mail or enquiry are not entered.
  User should be notified when the enquiry is submitted

  Scenario: Successfully sent enquiry
    Given I navigate to "TricentisDemoWebshop" website
    And I click "Contact Us" button
    When I pass a "Armend Leshi" to input box "Name enquiry"
    And I pass a "armend@hotmail.com" to input box "Email enquiry"
    And I pass a "Top Seite" to input box "Enquiry"
    And I click "Submit" button
    Then I have successfully "sent an enquiry"
    And I close the website


  Scenario: Failed sent enquiry-missing name
    Given I navigate to "TricentisDemoWebshop" website
    And I click "Contact Us" button
    When I pass a "armend@hotmail.com" to input box "Email enquiry"
    And I pass a "Top Seite" to input box "Enquiry"
    And I click "Submit" button
    Then I get an error "message for name"
    And I close the website


  Scenario: Failed sent enquiry-missing email
    Given I navigate to "TricentisDemoWebshop" website
    And I click "Contact Us" button
    When I pass a "Armend Leshi" to input box "Name enquiry"
    And I pass a "Top Seite" to input box "Enquiry"
    And I click "Submit" button
    Then I get an error "message for e-mail"
    And I close the website



  Scenario: Failed sent enquiry-missing enquiry
    Given I navigate to "TricentisDemoWebshop" website
    And I click "Contact Us" button
    When I pass a "Armend Leshi" to input box "Name enquiry"
    And I pass a "armend@hotmail.com" to input box "Email enquiry"
    And I click "Submit" button
    Then I get an error "message for enquiry"
    And I close the website

