package Steps;

import context.TestContext;
import dataProviders.ConfigFileReader;
import io.cucumber.java.en.Then;
import managers.PageObjectManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.NewAccountOpenedPage;

public class NewAccountOpenedPageSteps {

    WebDriver driver;
    TestContext testContext;
    PageObjectManager pageObjectManager;
    ConfigFileReader configFileReader;
    NewAccountOpenedPage newAccountOpenedPage;


    public NewAccountOpenedPageSteps(TestContext context) {

        testContext = context;
        newAccountOpenedPage = testContext.getPageObjectManager().getNewAccountOpenedPage();


    }


    @Then("User is on page stating that account is created with link to account")
    public void userIsOnPageStatingThatAccountIsCreatedWithLinkToAccount() {


        String pageTitleText = newAccountOpenedPage.getPageTitleText();
        Assert.assertEquals("Congratulations, your account is now open.", pageTitleText);
        String accountId = newAccountOpenedPage.getAccountIdFromLink();
        newAccountOpenedPage.clickLinkToAccount();
        String url = testContext.getDriver().getCurrentUrl();
        Assert.assertEquals("https://parabank.parasoft.com/parabank/activity.htm?id=" + accountId, url);

    }






}
