package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage {

    private WebDriver driver;
    private By dropdownÄccountType = By.id("type");
    private By dropdownÄccountNo = By.id("fromAccountId");
    private By openNewAccountButton = By.cssSelector("#rightPanel > div > div > form > div > input");



    public OpenNewAccountPage(WebDriver driver) {this.driver = driver;}

    public void selectFromDropDown(String text){
        getAccountTypeDropdown().selectByVisibleText(text);
    }

    public void selectFromAccountNoDropDown(Integer accountIndex) {getSelectAccountNoFromDropdown().selectByIndex(accountIndex);}


    private Select getAccountTypeDropdown() {return new Select(driver.findElement(dropdownÄccountType));}

    private Select getSelectAccountNoFromDropdown() {return new Select(driver.findElement(dropdownÄccountNo));}



        // change to datatupe account openened page
    public NewUserAccountOpenedPage clickOpenNewAccount() {
        driver.findElement(openNewAccountButton).click();
        return new NewUserAccountOpenedPage(driver);

    }









}
