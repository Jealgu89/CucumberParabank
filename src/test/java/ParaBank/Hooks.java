package ParaBank;

import context.TestContext;
import dataProviders.ConfigFileReader;
import io.cucumber.java.en.Given;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class Hooks {



    WebDriver driver;
    PageObjectManager pageObjectManager;
    ConfigFileReader configFileReader;
    TestContext testContext;

public Hooks(TestContext context) {

    testContext = context;
}










}
