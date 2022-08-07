package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BillPaymentCompletePage {


    private WebDriver driver;
    SideBar sideBar;

    public BillPaymentCompletePage(WebDriver driver) {
        this.driver = driver;
        this.sideBar = new SideBar(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.CSS, using = "#rightPanel > div > div:nth-child(2) > h1")
    private WebElement pageTitle;

    @FindBy(how = How.ID, using = "amount")
    private WebElement amount;

    @FindBy(how = How.ID, using = "fromAccountId")
    private WebElement fromAccountId;


    public String getAccountID() {
        return fromAccountId.getText();

    }

    public String getAmount() {

        return amount.getText();
    }

    public void navigateToAccountsOverviewPage() {
        sideBar.clickAccountsOverviewPage();
    }


}
