Feature: User purchases an item

  Background:
    Given User navigates to website homepage
    When User clicks on login button
    And User inserts valid username and password
    And User clicks submit button
    Then User sees a successful login message

  Scenario: User makes an acquisition
    And User selects a product
    And User adds product to cart
    And User clicks on cart button
    And User sees a successful cart addition message
    And User places an order
    And User inserts order credentials
    And User purchases product
    Then User sees a successful purchase message