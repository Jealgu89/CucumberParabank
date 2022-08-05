package Steps;

import context.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.AccountDetailsPage;
import pages.PayBillPage;

import java.util.List;

public class TransactionSteps {

    TestContext testContext;
    AccountDetailsPage accountDetailsPage;
    PayBillPage payBillPage;


    public TransactionSteps(TestContext context){
        testContext = context;
        accountDetailsPage = testContext.getPageObjectManager().getAccountDetailsPage();
        payBillPage = testContext.getPageObjectManager().getPayBillPage();


    }

    @When("User pays bill")
    public void userPaysBill(DataTable payeeInfo) {

        accountDetailsPage.clickPayBillLink();

        payBillPage.enterBillInfo(payeeInfo);

    }


    @Then("Correct amount is deducted from correct account")
    public void correctAmountIsDeductedFromCorrectAccount() {
        //do scenariocontext thing.
        System.out.println(AccountSteps.getBalance);

    }
}