package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountOpenedPage {


    private WebDriver driver;
    private By linkToAccount = By.id("newAccountId");
    private By pageTitle = By.cssSelector("#rightPanel > div > div > p:nth-child(2)");

    public NewAccountOpenedPage(WebDriver driver) {this.driver = driver;}


    public String getAccountIdFromLink () {

        return driver.findElement(linkToAccount).getText();
    }

    public void clickLinkToAccount (){

        driver.findElement(linkToAccount).click();;
    }

    public String getPageTitleText (){

        return driver.findElement(pageTitle).getText();


    }
}
