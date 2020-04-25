@Register
Feature: Register functionality
    As a user I want to register on nop commerce

  @Sanity
  Scenario: User should navigate to registration page successfully
    Given I am on home page
    When  I click on register link
    Then I should navigate to register page successfully