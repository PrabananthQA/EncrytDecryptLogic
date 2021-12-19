Feature: Verify the Login using valid credentials

  @chrome
  Scenario: Enter valid credentials in Login Page and verify login
    Given : I am at the WelcomePage
    When : I click on "LoginButton"
    Then : I should be at the LoginPage 
    And : I enter <UserID> 
    And : I enter <Password>
    Then : I Login
      | UserID      | Password   |
      | PrabaTest   | Qwerty#33  |
