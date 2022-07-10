package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    final By registrationLink = By.cssSelector("#loginPanel > p:nth-child(3) > a");
    final By errorTitle = By.cssSelector("#rightPanel > h1");
    final By errorReason = By.cssSelector("#rightPanel > p");



    public HomePage(WebDriver driver) {this.driver = driver;}

  




    public RegistrationPage clickRegistration(){

        driver.findElement(registrationLink).click();
        return new RegistrationPage(driver);
    }

    public String[] getLoginErrorMessage() {
       String errorTitleText = driver.findElement(errorTitle).getText();
       String errorReasonText = driver.findElement(errorReason).getText();
       return new String[] {errorTitleText, errorReasonText};


    }


}
