package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsOverviewPage {


private WebDriver driver;

private By accountsOverviewPageTitle = By.cssSelector("#rightPanel > div > div > h1");

public AccountsOverviewPage(WebDriver driver) {this.driver = driver;}


    public WebElement getAccountsOverviewTitle (){

       return driver.findElement(accountsOverviewPageTitle);
    }





}



