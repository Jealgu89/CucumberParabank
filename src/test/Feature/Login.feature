Feature: Login
  In order to do internet banking
  As a valid Para Bank customer
  I want to login succesfully




  Scenario Outline: Unsuccusseful Login

    Given I am on the login page of the Para Bank Application
    When I enter valid credentials "<username>" and "<password>"
    Then I should get an appropriate error message

    Examples:
    | username | password|
    | testUser | thispasswordiswrong |
    | wrong123 | password            |




  @SomeTests
  Scenario: Succesfull login
  Given I am on the login page of the Para Bank Application
    When I enter valid credentials "testUser" and "password"
    Then I should be taken to the overview page










