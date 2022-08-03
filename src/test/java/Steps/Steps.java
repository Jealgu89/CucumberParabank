package Steps;

import context.TestContext;
import dataProviders.ConfigFileReader;
import org.openqa.selenium.WebDriver;

import pages.*;
import managers.PageObjectManager;

public class Steps {


    WebDriver driver;
    TestContext testContext;
    PageObjectManager pageObjectManager;
    ConfigFileReader configFileReader;
    HomePage homePage;
    NewUserAccountOpenedPage newAccountOpenedPage;
    OpenNewAccountPage openNewAccountPage;
    RegistrationPage registrationPage;

    public Steps(TestContext context) {

        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();

    }




















/*
    @When("^I enter invalid credentials$")
    public void iEnterInvalidCredentials(DataTable data)  {

        List<Map<String, String>> userCredentials = data.asMaps();


        for (Map<String, String> userCredential : userCredentials) {
            driver.findElement(By.name("username")).sendKeys(userCredential.get("username"));
            driver.findElement(By.name("password")).sendKeys(userCredential.get("password"));
            driver.findElement(By.name("username")).submit();
        }
*/

    }





