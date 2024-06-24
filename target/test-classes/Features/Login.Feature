Feature: To verify facebook login page

  Scenario: Successful login with valid credentials
    Given user should be facebook login page
    When user should enter the username and password
    And user should click the login button
    Then user should verify login is successfull
