Feature: Registration
  In order to do internet banking
  As a valid Para Bank customer
  I want to register succesfully
  @SomeTests
  Scenario: Successful Registration
      Given User has navigated to the register page
      When  User enters valid personal information to register
#   | firstName | lastName | street | city | state | zipCode | phoneNumber | ssn | userName | password | repeatedPassword
    | Jesse | The Tester | Street | City | State | 12345 | 12345 | 12345 | testUser12 | password | password |

    Then  I should be taken to the accounts overview page for newly created account
#customer\.phoneNumber