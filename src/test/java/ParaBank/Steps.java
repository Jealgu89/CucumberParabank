package ParaBank;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;
import pages.RegistrationPage;

import java.time.Duration;
import java.util.List;

public class Steps {


    private WebDriver driver;

    @Before()
    public void setup() {


        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

    }


    @Given("I am on the login page of the Para Bank Application")
    public HomePage i_am_on_the_login_page_of_the_para_bank_application() {

        // driver = new ChromeDriver();
        driver.get("http://parabank.parasoft.com/parabank/index.html");
        return new HomePage(driver);

    }

    @When("^I enter invalid credentials \"(.*)\" and \"(.*)\"$")
    @When("I enter valid credentials")
    public void i_enter_credentials(String userName, String password) {
        driver.findElement(By.name("username")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.name("username")).submit();
    }

    @Then("I should be taken to the overview page")
    public void i_should_be_taken_to_the_overview_page() {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));;
        ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='rightPanel']/div/div/h1"));

        driver.findElement(By.xpath("//*[@id='rightPanel']/div/div/h1")).isDisplayed();
        //driver.findElement(By.linkText("Log out")).click();

        // driver.quit();
    }

    @Then("I should be taken to the accounts overview page for newly created account")
    public void accountCreatedSuccessfullyIsBedisplayed() {

        String textDisplayed = driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p")).getText();

        Assert.assertEquals("Your account was created successfully. You are now logged in.", textDisplayed);


    }

    @Given("User has navigated to the register page")
    public void iAmOnTheRegisterPageOfTheParaBankApplication() {

        i_am_on_the_login_page_of_the_para_bank_application();
        //driver.findElement(By.cssSelector("#loginPanel > p:nth-child(3) > a")).click();
        HomePage HomePage = new HomePage(driver);
        HomePage.clickRegistration();

        //driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/p[2]/a")).click();


    }


    @When("User enters valid personal information to register")
    public void iEnterValidPersonalInformation(DataTable registrationDetails) {

        List<List<String>> data = registrationDetails.cells();


        RegistrationPage RegistrationPage = new RegistrationPage(driver);
        RegistrationPage.registerFirstName(data.get(0).get(0));
        RegistrationPage.registerLastName(data.get(0).get(1));
        RegistrationPage.registerStreet(data.get(0).get(2));
        RegistrationPage.registerCity(data.get(0).get(3));
        RegistrationPage.registerState(data.get(0).get(4));
        RegistrationPage.registerZipCode(data.get(0).get(5));
        RegistrationPage.registerPhoneNumber(data.get(0).get(6));
        RegistrationPage.registerSSN(data.get(0).get(7));
        RegistrationPage.registerUsername(data.get(0).get(8));
        RegistrationPage.registerPassword(data.get(0).get(9));
        RegistrationPage.registerRepeatedPassword(data.get(0).get(10));
        RegistrationPage.clickToRegister();


    }

    @Then("I should get an appropriate error message")
    public void iShouldGetAnAppropriateErrorMessage() {









    }
}


