package ParaBank;

import context.TestContext;
import dataProviders.ConfigFileReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;


public class HomePageStepDef {

    WebDriver driver;
    ConfigFileReader configFileReader;
    PageObjectManager pageObjectManager;
    HomePage homePage;
    TestContext testContext;

    public HomePageStepDef(TestContext context) {

        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        driver = new ChromeDriver();
    }







    @When("^I enter invalid credentials \"(.*)\" and \"(.*)\"$")
    @When("^I enter valid credentials \"(.*)\" and \"(.*)\"$")
    public void i_enter_credentials(String userName, String password) {
        homePage.logIn(userName, password);
    }


    @Given("User is logged in on Parabank website with {string} and {string}")
    public void userIsLoggedInOnParabankWebsiteWithAnd(String username, String password) {

        i_am_on_the_login_page_of_the_para_bank_application();
        i_enter_credentials(username, password);
        //i_should_be_taken_to_the_overview_page();

    }

    @Given("User has navigated to the register page")
    public void iAmOnTheRegisterPageOfTheParaBankApplication() {

        i_am_on_the_login_page_of_the_para_bank_application();
        //driver.findElement(By.cssSelector("#loginPanel > p:nth-child(3) > a")).click();
        //homePage = pageObjectManager.getHomePage();
        homePage.clickRegistration();

        //driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();


    }


    @Given("I am on the login page of the Para Bank Application")

    public void i_am_on_the_login_page_of_the_para_bank_application() {


        driver.get("http://parabank.parasoft.com/parabank/index.html");



    }
}
