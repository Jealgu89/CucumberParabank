Feature: Login
  In order to do internet banking
  As a valid Para Bank customer
  I want to login succesfully

  Scenario: Successful Login
    Given I am on the login page of the Para Bank Application
    When I enter valid credentials
    Then I should be taken to the overview page



  Scenario Outline: Unsuccusseful Login
    Given I am on the login page of the Para Bank Application
    When I enter invalid credentials "<username>" and "<password>"
    Then I should get an appropriate error message
  Examples:
    | username | password |
    | wrong123    | password123 |
    | testUser123 | wrong123    |






