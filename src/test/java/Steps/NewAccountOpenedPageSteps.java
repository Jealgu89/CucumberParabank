package Steps;

import context.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.NewAccountOpenedPage;

public class NewAccountOpenedPageSteps {


    TestContext testContext;
    NewAccountOpenedPage newAccountOpenedPage;


    public NewAccountOpenedPageSteps(TestContext context) {

        testContext = context;
        newAccountOpenedPage = testContext.getPageObjectManager().getNewAccountOpenedPage();


    }


    @Then("User is on page stating that account is created with link to account")
    public void userIsOnPageStatingThatAccountIsCreatedWithLinkToAccount() throws InterruptedException {

        Thread.sleep(500);
        String pageTitleText = newAccountOpenedPage.getPageTitleText();
        Assert.assertEquals("Congratulations, your account is now open.", pageTitleText);
        String accountId = newAccountOpenedPage.getAccountIdFromLink();
        newAccountOpenedPage.clickLinkToAccount();
        String url = testContext.getDriver().getCurrentUrl();
        Assert.assertEquals("https://parabank.parasoft.com/parabank/activity.htm?id=" + accountId, url);

    }






}
