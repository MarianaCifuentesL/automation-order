# language: en
Feature: Authentication in Serenity Demo

  Background:
    Given the user opens the browser

  @enter
  Scenario Outline: Login with case "<case>"
    When the user sends the credentials
      | <username> |
      | <password> |
    Then the user can see the message "<message>"
    Examples:
      | case       |  | username | password | message           |
      | successful |  | admin    | serenity | Dashboard visible |