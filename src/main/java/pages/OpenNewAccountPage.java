package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage {




    private WebDriver driver;

    @FindBy(how = How.ID, using = "type")
    private WebElement dropdownAccountType;

    @FindBy(how = How.ID, using = "fromAccountId")
    private WebElement dropdownAccountNo;

    @FindBy(how = How.CSS, using = "#rightPanel > div > div > form > div > input")
    private WebElement openNewAccountButton;




    public OpenNewAccountPage(WebDriver driver) {this.driver = driver;
        PageFactory.initElements(driver, this);}




    private Select getAccountTypeDropdown() {return new Select(dropdownAccountType);}

    private Select getSelectAccountNoFromDropdown() {return new Select(dropdownAccountNo);}

    public void selectFromDropDown(String text){
        getAccountTypeDropdown().selectByVisibleText(text);
    }

    public void selectFromAccountNoDropDown(Integer accountIndex) {getSelectAccountNoFromDropdown().selectByIndex(accountIndex);}



        // change to datatupe account openened page
    public NewUserAccountOpenedPage clickOpenNewAccount() {
        openNewAccountButton.click();
        return new NewUserAccountOpenedPage(driver);

    }









}
