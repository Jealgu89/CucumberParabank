package Steps;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;


public class HomePageStepDef {


    HomePage homePage;
    TestContext testContext;

    public HomePageStepDef(TestContext context) {

        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();

    }




    @When("^I enter invalid credentials \"(.*)\" and \"(.*)\"$")
    @When("^I enter valid credentials \"(.*)\" and \"(.*)\"$")
    public void i_enter_credentials(String userName, String password) throws InterruptedException {
        homePage.logIn(userName, password);
    }


    @Given("User is logged in on Parabank website with {string} and {string}")
    public void userIsLoggedInOnParabankWebsiteWithAnd(String username, String password) throws InterruptedException {

        i_am_on_the_login_page_of_the_para_bank_application();
        i_enter_credentials(username, password);
        //i_should_be_taken_to_the_overview_page();

    }

    @Given("User has navigated to the registration page")
    public void iAmOnTheRegisterPageOfTheParaBankApplication() {



        homePage.clickRegistration();



    }


    @Given("I am on the login page of the Para Bank Application")

    public void i_am_on_the_login_page_of_the_para_bank_application() {


        System.out.println("test started");

    }



    @Then("I should get an appropriate error message")
    public void iShouldGetAnAppropriateErrorMessage() {

        homePage.getLoginErrorMessage();
        Assert.assertEquals("The username and password could not be verified.", homePage.getLoginErrorMessage());


    }

    @Given("User navigated to open new Account Page after logging in with {string} and {string}")
    public void userNavigatedToOpenNewAccountPageAfterLoggingInWithAnd(String username, String password) throws InterruptedException {
        homePage.logIn(username, password);
        homePage.navigateToOpenNewAccountPage();


    }
}
