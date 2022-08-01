package pages;

import managers.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver driver;
    private SideBar sideBar;
    final By registrationLink = By.cssSelector("#loginPanel > p:nth-child(3) > a");
    final By errorTextField = By.cssSelector("#rightPanel > p");
    final By userNameField = By.name("username");
    final By passwordField = By.name("password");




        public HomePage(WebDriver driver) {
            this.driver = driver;
        this.sideBar = new SideBar(driver);
        }


    public void logIn(String userName, String password) throws InterruptedException {


            driver.findElement(userNameField).sendKeys(userName);
            driver.findElement(passwordField).sendKeys(password);
            driver.findElement(userNameField).submit();

    }

    public void navigateToOpenNewAccountPage() {

            sideBar.clickOpenNewAccount();
    }


    public RegistrationPage clickRegistration(){

        driver.findElement(registrationLink).click();
        return new RegistrationPage(driver);
    }

    public OpenNewAccountPage openNewAccount(){
           return sideBar.clickOpenNewAccount();
    }



    public String getLoginErrorMessage() {

        return driver.findElement(errorTextField).getText();


    }


}
