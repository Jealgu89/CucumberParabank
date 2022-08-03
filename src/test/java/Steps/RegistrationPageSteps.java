package Steps;

import context.TestContext;
import dataProviders.ConfigFileReader;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import pages.RegistrationPage;

import java.util.List;

public class RegistrationPageSteps {

    WebDriver driver;
    ConfigFileReader configFileReader;
    PageObjectManager pageObjectManager;
    RegistrationPage registrationPage;
    TestContext testContext;

    public RegistrationPageSteps(TestContext context) {

        testContext = context;
        registrationPage = testContext.getPageObjectManager().getRegistrationPage();
    }

    @When("User enters valid personal information to register")
    public void iEnterValidPersonalInformation(DataTable registrationDetails) {

        List<List<String>> data = registrationDetails.cells();


        registrationPage.registerFirstName(data.get(0).get(0));
        registrationPage.registerLastName(data.get(0).get(1));
        registrationPage.registerStreet(data.get(0).get(2));
        registrationPage.registerCity(data.get(0).get(3));
        registrationPage.registerState(data.get(0).get(4));
        registrationPage.registerZipCode(data.get(0).get(5));
        registrationPage.registerPhoneNumber(data.get(0).get(6));
        registrationPage.registerSSN(data.get(0).get(7));
        registrationPage.registerUsername(data.get(0).get(8));
        registrationPage.registerPassword(data.get(0).get(9));
        registrationPage.registerRepeatedPassword(data.get(0).get(10));
        registrationPage.clickToRegister();


    }




}
