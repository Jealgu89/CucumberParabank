Feature: Bill Payment Service
  In order to pay my bills
  As a  parabank customer
  I want to be able to pay through the Parabank website

  #pico first neede to share
  Scenario: Paying bills through parabank website
    Given User is logged in on Parabank website with "testUser" and "password"
    And   User has a positive amount on her account
    When  User pays bill
    # payeename | Address | City | State | ZipCode | PhoneNo | Account | AccountVerify | Amount | From Account Index
    | John | Street | SomeCity | InSomeState | 1234 | 12345 | 123456 | 123456 | 0.13 | 0 |
    Then User should be navigated to the Bill Payment Complete page stating the correct amount and accountnumber
    And The transaction is correctly processed in the account details




    #Correct amount is deducted from correct account

   #User receives a payment complete message
    # AND The transaction is in transaction overview
    # AND The amount is correctly deducted from account balance

    # and: save amount, save account no.Feature
    # when: use account no from previous step
    # then: use amount saved in step one, to calculate new total