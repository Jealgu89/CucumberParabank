package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewAccountOpenedPage {


    private WebDriver driver;

    @FindBy(how = How.ID, using = "newAccountId")
    private WebElement linkToAccount;


    @FindBy(how = How.CSS, using = "#rightPanel > div > div > h1")
    private WebElement pageTitle;


    public NewAccountOpenedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public String getAccountIdFromLink () {

        return linkToAccount.getText();
    }

    public void clickLinkToAccount (){

        linkToAccount.click();;
    }

    public String getPageTitleText (){

        return pageTitle.getText();


    }
}
