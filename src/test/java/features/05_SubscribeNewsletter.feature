Feature: Subscribe Newsletter functionality for DemoWebShop
  User can subscribe the newsletter if the email is exist
  User should be notified if the newsletter is subscribe
  User should be notified if the email dos not exist

  Scenario: Subscribing the newsletter successfully
    Given I navigate to "TricentisDemoWebshop" website
    When I pass a "test@hotmail.com" to input box "Newsletter"
    And I click "Subscribe" button
    Then I have successfully "subscribe the newsletter"
    And I close the website

  Scenario: Subscribing the Newsletter failed
    Given I navigate to "TricentisDemoWebshop" website
    When I pass a "test" to input box "Newsletter"
    And I click "Subscribe" button
    Then I get an error "message enter valid email"
    And I close the website