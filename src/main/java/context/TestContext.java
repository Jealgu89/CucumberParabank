package context;

import dataProviders.ConfigFileReader;
import io.cucumber.java.Before;
import managers.FileReaderManager;
import managers.PageObjectManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestContext {

    WebDriver driver;
    private PageObjectManager pageObjectManager;
    private ConfigFileReader configFileReader;
    public ScenarioContext scenarioContext;


    public TestContext() {


        System.setProperty("webdriver.chrome.driver", "C:/drivers2/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
        pageObjectManager = new PageObjectManager(driver);
        scenarioContext = new ScenarioContext();
        driver.get("http://parabank.parasoft.com/parabank/index.htm");


    }


    public PageObjectManager getPageObjectManager() {

        return pageObjectManager;
    }

    public WebDriver getDriver() {
        return driver;
    }


    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }
}






