Feature: Create a new account
  In order to manage my funds
  As existing Parabank user
  I want to open a new account



  Scenario Outline: create a new account
    Given User navigated to open new Account Page after logging in with "<username>" and "<password>"

    When A request a new "<account type>" account and transfer funds to it from existing account "<account index>"
    Then User is on page stating that account is created with link to account
    Examples:
      | account type | account index | username | password |
      | CHECKING    | 0 | testUser12  | password |
      | SAVINGS     | 0 | testUser12 | password |



# same scenario with datatable with map


