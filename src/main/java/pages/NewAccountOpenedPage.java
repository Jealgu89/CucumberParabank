package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccountOpenedPage {

    private WebDriver driver;
    private By pageTitle = By.cssSelector("#rightPanel > div > div > p:nth-child(2)");

    private By linkToAccount = By.id("newAccountId");
    private By welcomeText = By.xpath("//*[@id=\"rightPanel\"]/p");

    public NewAccountOpenedPage(WebDriver driver) {this.driver=driver;}

    public void clickLinkToAccount (){

        driver.findElement(linkToAccount).click();

    }

    public String getAccountIdFromLink () {

        return driver.findElement(linkToAccount).getText();
    }

    public String getPageTitleText (){

        return driver.findElement(pageTitle).getText();


    }

    public String welcomeText() {

        return driver.findElement(welcomeText).getText();
    }


}
