package ParaBank;

import context.TestContext;
import dataProviders.ConfigFileReader;
import io.cucumber.java.en.Then;
import managers.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AccountsOverviewPage;

public class AccountsOverviewPageSteps {


    WebDriver driver;
    TestContext testContext;
    ConfigFileReader configFileReader;
    PageObjectManager pageObjectManager;
    AccountsOverviewPage accountsOverviewPage;


    public AccountsOverviewPageSteps(TestContext context) {

        testContext = context;
        accountsOverviewPage = testContext.getPageObjectManager().getAccountsOverviewPage();

    }

    @Then("I should be taken to the overview page")
    public void i_should_be_taken_to_the_overview_page() {


        Assert.assertEquals(accountsOverviewPage.getAccountsOverviewTitle().getText(), "Accounts Overview");

    }

}