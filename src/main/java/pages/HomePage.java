package pages;

import managers.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

    private WebDriver driver;
    private SideBar sideBar;

    @FindBy(how = How.CSS, using = "#loginPanel > p:nth-child(3) > a")
    private WebElement registrationLink;

    @FindBy(how = How.CSS, using = "#rightPanel > p")
    private WebElement errorTextField;

    @FindBy(how = How.NAME, using = "username")
    private WebElement userNameField;

    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordField;








        public HomePage(WebDriver driver) {
            this.driver = driver;
        this.sideBar = new SideBar(driver);
            PageFactory.initElements(driver, this);
        }


    public void logIn(String userName, String password) throws InterruptedException {


            userNameField.sendKeys(userName);
            passwordField.sendKeys(password);
            userNameField.submit();

    }

    public void navigateToOpenNewAccountPage() {

            sideBar.clickOpenNewAccount();
    }


    public void clickRegistration() {

        registrationLink.click();
    }

    public OpenNewAccountPage openNewAccount(){
           return sideBar.clickOpenNewAccount();
    }



    public String getLoginErrorMessage() {

        return errorTextField.getText();


    }


}
