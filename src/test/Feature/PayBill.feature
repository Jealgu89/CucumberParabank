Feature: Bill Payment Service
  In order to pay my bills
  As a  parabank customer
  I want to be able to pay through the Parabank website

  #pico first neede to share
  Scenario: Paying bills through parabank website
    Given User is logged in on Parabank website with "testUser" and "password"
    And   User has a positive amount on her account
    When  User pays bill
    Then Correct amount is deducted from correct account

    # and: save amount, save account no.Feature
    # when: use account no from previous step
    # then: use amount saved in step one, to calculate new total