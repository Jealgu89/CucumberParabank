package Steps;

import context.TestContext;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.NewUserAccountOpenedPage;


public class NewlyOpenedUserAccountPageSteps {



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
