package Steps;

import context.ScenarioContext;
import context.TestContext;
import enums.Context;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.AccountDetailsPage;
import pages.BillPaymentCompletePage;
import pages.PayBillPage;

import java.util.List;

public class TransactionSteps {

    TestContext testContext;
    AccountDetailsPage accountDetailsPage;
    PayBillPage payBillPage;
    BillPaymentCompletePage billPaymentCompletePage;
    ScenarioContext scenarioContext;


    public TransactionSteps(TestContext context){
        testContext = context;
        accountDetailsPage = testContext.getPageObjectManager().getAccountDetailsPage();
        payBillPage = testContext.getPageObjectManager().getPayBillPage();
        billPaymentCompletePage = testContext.getPageObjectManager().getBillPaymentCompletePage();
        ScenarioContext scenarioContext = testContext.getScenarioContext();


    }

    @When("User pays bill")
    public void userPaysBill(DataTable billInfo) {

        accountDetailsPage.clickPayBillLink();
        System.out.println(testContext.scenarioContext.getContext(Context.BALANCE));
        payBillPage.enterBillInfo(billInfo);
        List<List<String>> data = billInfo.cells();
        testContext.scenarioContext.setContext(Context.AMOUNT, data.get(0).get(8));



    }


    @Then("Correct amount is deducted from correct account")
    public void correctAmountIsDeductedFromCorrectAccount() {
        //do scenariocontext thing.


    }

    @Then("User should be navigated to the Bill Payment Complete page stating the correct amount and accountnumber")
    public void checkBillPaymentCompletePageContent() {

        Assert.assertEquals(scenarioContext.getContext(Context.AMOUNT), billPaymentCompletePage.getAmount().substring(1));
        Assert.assertEquals(scenarioContext.getContext(Context.ACCOUNT_NUMBER), billPaymentCompletePage.getAccountID());



    }
}