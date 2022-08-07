package Steps;

import context.ScenarioContext;
import context.TestContext;
import enums.Context;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pages.AccountDetailsPage;
import pages.AccountsOverviewPage;
import pages.SideBar;

public class AccountSteps {

    TestContext testContext;
    AccountDetailsPage accountDetailsPage;
    AccountsOverviewPage accountOverviewPage;
    SideBar sideBar;
    ScenarioContext scenarioContext;

    Double balance;


    public AccountSteps(TestContext context) {

        testContext = context;
        accountDetailsPage = testContext.getPageObjectManager().getAccountDetailsPage();
        accountOverviewPage = testContext.getPageObjectManager().getAccountsOverviewPage();
        sideBar = testContext.getPageObjectManager().getSideBar();
        scenarioContext = testContext.getScenarioContext();

    }

    @Given("User has a positive amount on her account")
    public void retrieveAccountBalanceAndCheckPositive() throws InterruptedException {
        //Integer balance = accountOverviewPage.balanceFirstAccount();
        //Double balance = accountOverviewPage.balanceFirstAccount(accountOverviewPage.balanceFirstAccount);
        //this.balance = balance;

        accountOverviewPage.clickLinkToFirstAccount();
        Thread.sleep(1000);
        System.out.println(accountDetailsPage.getBalance());

        Double balance = accountDetailsPage.getBalance();
        testContext.scenarioContext.setContext(Context.BALANCE, balance);
        Assert.assertTrue(accountDetailsPage.getBalance() > 0);

        String accountNo = accountDetailsPage.getAccountNo();
        testContext.scenarioContext.setContext(Context.ACCOUNT_NUMBER, accountNo);

        //
        System.out.println(accountNo);

    }





    @Then("I should be taken to the overview page")
    public void i_should_be_taken_to_the_overview_page() {


        Assert.assertEquals(accountOverviewPage.getAccountsOverviewTitle().getText(), "Accounts Overview");

    }

    public Double getBalance(){

        return balance;
    }

    @And("The transaction is correctly processed in the account details")
    public void theAmountIsCorrectlyDeductedFromTheCorrectAccount() throws InterruptedException {
        sideBar.clickAccountsOverviewPage();
        accountOverviewPage.clickLinkToFirstAccount();
        Double expNewBalance = testContext.scenarioContext.getContext(Context.BALANCE) - Double.parseDouble(testContext.scenarioContext.getContext(Context.AMOUNT);


        Assert.assertEquals(accountDetailsPage.getBalance(), expNewBalance);



//////////////////////////////////// getContext from scenarioContext return object should be Double or STring..........



    }
}