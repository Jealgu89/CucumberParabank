package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    private  WebDriver driver;
    private By firstNameField = By.name("customer.firstName");
    private By lastNameField = By.name("customer.lastName");
    private By streetField = By.name("customer.address.street");
    private By cityField = By.name("customer.address.city");
    private By stateField = By.name("customer.address.state");
    private By zipCodeField = By.name("customer.address.zipCode");
    private By phoneNumberField = By.name("customer.phoneNumber");
    private By ssnField = By.name("customer.ssn");
    private By usernameField = By.name("customer.username");
    private By passwordField = By.name("customer.password");
    private By repeatPasswordField = By.name("repeatedPassword");
    private By registrationButton = By.cssSelector("#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input");



    public RegistrationPage(WebDriver driver) {this.driver = driver;}


    public void registerFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);

    }

    public void registerLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);

    }


    public void registerStreet(String street) {
        driver.findElement(streetField).sendKeys(street);

    }


    public void registerCity(String city) {
        driver.findElement(cityField).sendKeys(city);

    }


    public void registerState(String state) {
        driver.findElement(stateField).sendKeys(state);

    }


    public void registerZipCode(String zipCode) {
        driver.findElement(zipCodeField).sendKeys(zipCode);

    }


    public void registerPhoneNumber(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);

    }


    public void registerSSN(String ssn) {
        driver.findElement(ssnField).sendKeys(ssn);

    }


    public void registerUsername(String userName) {
        driver.findElement(usernameField).sendKeys(userName);

    }


    public void registerPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);

    }


    public void registerRepeatedPassword(String repeatedPassWord) {
        driver.findElement(repeatPasswordField).sendKeys(repeatedPassWord);

    }

    public void clickToRegister() {

        driver.findElement(registrationButton).click();

    }



}
