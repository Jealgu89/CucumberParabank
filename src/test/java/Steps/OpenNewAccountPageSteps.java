package Steps;

import context.TestContext;
import dataProviders.ConfigFileReader;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import pages.OpenNewAccountPage;

public class OpenNewAccountPageSteps {


    TestContext testContext;
    OpenNewAccountPage openNewAccountPage;

    public OpenNewAccountPageSteps(TestContext context) {

        testContext = context;
        openNewAccountPage = testContext.getPageObjectManager().getOpenNewAccountPage();


    }

    @When("A request a new {string} account and transfer funds to it from existing account {string}")
    public void aRequestANewAccountAndTransferFundsToItFromExistingAccount(String accountType, String accountIndex) throws InterruptedException {

        Thread.sleep(500);
        openNewAccountPage.selectFromDropDown(accountType);
        Integer accountIndexInteger = Integer.parseInt(accountIndex);
        openNewAccountPage.selectFromAccountNoDropDown(accountIndexInteger);
        openNewAccountPage.clickOpenNewAccount();


    }

}
