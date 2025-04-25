Feature: User signs up

  Background:
    Given User navigates to website

  Scenario: User creates new account
    When User clicks on sign up link
    And User inserts valid credentials
    And User clicks on sign up button
    Then User sees a successful sign up message
