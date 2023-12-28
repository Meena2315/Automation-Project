Feature: Login web application
  Scenario: The user should login in with valid credential email and password
    Given the user is on login page
    When the users enter valid credential
    And hits submit
    Then user should be logged in successfully