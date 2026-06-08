Feature: Login Sauce Website

  @smoke
  Scenario: Login Sauce Website
    Given User opens SauceDemo website
    When User enters valid credentials
    Then User should login successfully