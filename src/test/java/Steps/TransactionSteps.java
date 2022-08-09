package Steps;

import context.ScenarioContext;
import context.TestContext;
import enums.Context;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AccountDetailsPage;
import pages.BillPaymentCompletePage;
import pages.PayBillPage;

import java.util.List;

public class TransactionSteps {

    TestContext testContext;
    AccountDetailsPage accountDetailsPage;
    PayBillPage payBillPage;
    BillPaymentCompletePage billPaymentCompletePage;



    public TransactionSteps(TestContext context){
        testContext = context;
        accountDetailsPage = testContext.getPageObjectManager().getAccountDetailsPage();
        payBillPage = testContext.getPageObjectManager().getPayBillPage();
        billPaymentCompletePage = testContext.getPageObjectManager().getBillPaymentCompletePage();



    }

    @When("User pays bill")
    public void userPaysBill(DataTable billInfo) {

        accountDetailsPage.clickPayBillLink();
        System.out.println(testContext.scenarioContext.getContext(Context.BALANCE));
        String accountNo = testContext.scenarioContext.getContext(Context.ACCOUNT_NUMBER).toString();
        payBillPage.enterBillInfo(billInfo, accountNo);
        List<List<String>> data = billInfo.cells();
        System.out.println(data.get(0).get(8));
        testContext.scenarioContext.setContext(Context.AMOUNT, data.get(0).get(8));



    }






    @Then("User should be navigated to the Bill Payment Complete page stating the correct amount and accountnumber")
    public void checkBillPaymentCompletePageContent() throws InterruptedException {
        Thread.sleep(500);
        //System.out.println(scenarioContext.getContext(Context.AMOUNT));
        Assert.assertEquals(testContext.scenarioContext.getContext(Context.AMOUNT), billPaymentCompletePage.getAmount().substring(1));
        Assert.assertEquals(testContext.scenarioContext.getContext(Context.ACCOUNT_NUMBER), billPaymentCompletePage.getAccountID());



    }
}