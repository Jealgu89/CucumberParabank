package Steps;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import pages.AccountDetailsPage;
import pages.AccountsOverviewPage;

public class AccountDetailsSteps {

    TestContext testContext;
    AccountDetailsPage accountDetailsPage;
    AccountsOverviewPage accountOverviewPage;

    Double balance;

    public AccountDetailsSteps(TestContext context) {

        testContext = context;
        accountDetailsPage = testContext.getPageObjectManager().accountDetailsPage();
        accountOverviewPage = testContext.getPageObjectManager().getAccountsOverviewPage();
    }

    @Given("User has a positive amount on her account")
    public void retrieveAccountBalanceAndCheckPositive() {
        //Integer balance = accountOverviewPage.balanceFirstAccount();
        Double balance = accountOverviewPage.balanceFirstAccount(accountOverviewPage.balanceFirstAccount);
        this.balance = balance;
        System.out.println(balance);
        accountOverviewPage.clickLinkToFirstAccount();

        //Integer balance = accountDetailsPage.balance();
        Assert.assertTrue(balance > 0);
        String accountNo = accountDetailsPage.getAccountNo();
        System.out.println(accountNo);

    }


    @When("User pays bill")
    public void userPaysBill() {
        System.out.println(balance);
        accountDetailsPage.clickPayBillLink();


    }

    @Then("Correct amount is deducted from correct account")
    public void correctAmountIsDeductedFromCorrectAccount() {
        System.out.println("Test code to be implemented");
    }
}
