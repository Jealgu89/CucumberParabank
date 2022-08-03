package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

    private  WebDriver driver;
    @FindBy(how = How.NAME, using = "customer.firstName")
    private WebElement firstNameField;

    @FindBy(how = How.NAME, using = "customer.lastName")
    private WebElement lastNameField;

    @FindBy(how = How.NAME, using = "customer.address.street")
    private WebElement streetField;

    @FindBy(how = How.NAME, using = "customer.address.city")
    private WebElement cityField;

    @FindBy(how = How.NAME, using = "customer.address.state")
    private WebElement stateField;

    @FindBy(how = How.NAME, using = "customer.address.zipCode")
    private WebElement zipCodeField;

    @FindBy(how = How.NAME, using = "customer.phoneNumber")
    private WebElement phoneNumberField;

    @FindBy(how = How.NAME, using = "customer.ssn")
    private WebElement ssnField;

   @FindBy(how = How.NAME, using = "customer.username")
   private WebElement userNameField;

   @FindBy(how = How.NAME, using = "customer.password")
   private WebElement passwordField;

   @FindBy(how = How.NAME, using = "repeatedPassword")
   private WebElement repeatedPasswordField;

   @FindBy(how = How.CSS, using = "#customerForm > table > tbody > tr:nth-child(13) > td:nth-child(2) > input")
   private WebElement registrationButtonField;






    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);}


    public void registerFirstName(String firstName) {
       firstNameField.sendKeys(firstName);

    }

    public void registerLastName(String lastName) {
        lastNameField.sendKeys(lastName);

    }


    public void registerStreet(String street) {
        streetField.sendKeys(street);

    }


    public void registerCity(String city) {
        cityField.sendKeys(city);

    }


    public void registerState(String state) {
        stateField.sendKeys(state);


    }


    public void registerZipCode(String zipCode) {
        zipCodeField.sendKeys(zipCode);

    }


    public void registerPhoneNumber(String phoneNumber) {
        phoneNumberField.sendKeys(phoneNumber);

    }


    public void registerSSN(String ssn) {
        ssnField.sendKeys(ssn);

    }


    public void registerUsername(String userName) {
        userNameField.sendKeys(userName);

    }


    public void registerPassword(String password) {
        passwordField.sendKeys(password);

    }


    public void registerRepeatedPassword(String repeatedPassWord) {
        repeatedPasswordField.sendKeys(repeatedPassWord);

    }

    public void clickToRegister() {

        registrationButtonField.click();

    }



}
