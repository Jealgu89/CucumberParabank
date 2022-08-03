package Steps;

import context.TestContext;
import dataProviders.ConfigFileReader;
import io.cucumber.java.en.Then;
import managers.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.NewUserAccountOpenedPage;


public class NewlyOpenedUserAccountPageSteps {

    WebDriver driver;
    ConfigFileReader configFileReader;
    PageObjectManager pageObjectManager;

    NewUserAccountOpenedPage newAccountOpenedPage;
    TestContext testContext;

public NewlyOpenedUserAccountPageSteps(TestContext context) {

    testContext = context;
    newAccountOpenedPage = testContext.getPageObjectManager().getNewUserAccountOpenedPage();

}

    @Then("I should be taken to the accounts overview page for newly created account")
    public void accountCreatedSuccessfullyIsBedisplayed() {



        Assert.assertEquals("Your account was created successfully. You are now logged in.", newAccountOpenedPage.welcomeText());

    }






}
