Feature: User Login

  Background:
    Given User navigates to website homepage

  Scenario: User logs in with valid credentials
    When User clicks on login button
    And User inserts valid username and password
    And User clicks submit button
    Then User sees a successful login message