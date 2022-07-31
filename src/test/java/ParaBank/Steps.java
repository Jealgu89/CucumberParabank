package ParaBank;

import dataProviders.ConfigFileReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.*;
import managers.PageObjectManager;
import managers.FileReaderManager;
import dataProviders.ConfigFileReader;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Steps {


    WebDriver driver;
    PageObjectManager pageObjectManager;
    ConfigFileReader configFileReader;
    HomePage homePage;
    NewAccountOpenedPage newAccountOpenedPage;
    OpenNewAccountPage openNewAccountPage;
    RegistrationPage registrationPage;







    @Then("I should be taken to the overview page")
    public void i_should_be_taken_to_the_overview_page() {


       Assert.assertEquals(pageObjectManager.getAccountsOverviewPage().getAccountsOverviewTitle().getText(), "Accounts Overview");

    }

    @Then("I should be taken to the accounts overview page for newly created account")
    public void accountCreatedSuccessfullyIsBedisplayed() {



        Assert.assertEquals("Your account was created successfully. You are now logged in.", pageObjectManager.getNewAccountOpenedPage().welcomeText());


    }




    @When("User enters valid personal information to register")
    public void iEnterValidPersonalInformation(DataTable registrationDetails) {

        List<List<String>> data = registrationDetails.cells();


        registrationPage = pageObjectManager.getRegistrationPage();
        registrationPage.registerFirstName(data.get(0).get(0));
        registrationPage.registerLastName(data.get(0).get(1));
        registrationPage.registerStreet(data.get(0).get(2));
        registrationPage.registerCity(data.get(0).get(3));
        registrationPage.registerState(data.get(0).get(4));
        registrationPage.registerZipCode(data.get(0).get(5));
        registrationPage.registerPhoneNumber(data.get(0).get(6));
        registrationPage.registerSSN(data.get(0).get(7));
        registrationPage.registerUsername(data.get(0).get(8));
        registrationPage.registerPassword(data.get(0).get(9));
        registrationPage.registerRepeatedPassword(data.get(0).get(10));
        registrationPage.clickToRegister();


    }

    @Then("I should get an appropriate error message")
    public void iShouldGetAnAppropriateErrorMessage() {
        homePage = pageObjectManager.getHomePage();
        homePage.getLoginErrorMessage();
        Assert.assertEquals("The username and password could not be verified.", homePage.getLoginErrorMessage());


    }




    @Given("User navigated to open new Account Page after logging in with {string} and {string}")
    public void navigatedToTheOpenNewAccountPage(String username, String password) {

        //userIsLoggedInOnParabankWebsiteWithAnd(username, password);
        //driver.findElement(By.cssSelector("#loginPanel > p:nth-child(3) > a")).click();
        homePage = pageObjectManager.getHomePage();
        homePage.openNewAccount();


    }


    @When("A request a new {string} account and transfer funds to it from existing account {string}")
    public void aRequestANewAccountAndTransferFundsToItFromExistingAccount(String accountType, String accountIndex) {

        openNewAccountPage = pageObjectManager.getOpenNewAccountPage();
        openNewAccountPage.selectFromDropDown(accountType);
        Integer accountIndexInteger = Integer.parseInt(accountIndex);
        openNewAccountPage.selectFromAccountNoDropDown(accountIndexInteger);
        openNewAccountPage.clickOpenNewAccount();


    }


    @Then("User is on page stating that account is created with link to account")
    public void userIsOnPageStatingThatAccountIsCreatedWithLinkToAccount() {

        newAccountOpenedPage = pageObjectManager.getNewAccountOpenedPage();
        String pageTitleText = newAccountOpenedPage.getPageTitleText();
        Assert.assertEquals("Congratulations, your account is now open.", pageTitleText);
        String accountId = newAccountOpenedPage.getAccountIdFromLink();
        newAccountOpenedPage.clickLinkToAccount();
        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://parabank.parasoft.com/parabank/activity.htm?id=" + accountId, url);

    }
/*
    @When("^I enter invalid credentials$")
    public void iEnterInvalidCredentials(DataTable data)  {

        List<Map<String, String>> userCredentials = data.asMaps();


        for (Map<String, String> userCredential : userCredentials) {
            driver.findElement(By.name("username")).sendKeys(userCredential.get("username"));
            driver.findElement(By.name("password")).sendKeys(userCredential.get("password"));
            driver.findElement(By.name("username")).submit();
        }
*/

    }





