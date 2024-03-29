package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AccountDetailsPage {

    WebDriver driver;
    private SideBar sideBar;
    @FindBy(how = How.ID, using = "accountId")
    private WebElement accountNo;

    @FindBy(how = How.CSS, using = "td#balance")
    private WebElement balance;





    public AccountDetailsPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver, this);
        this.sideBar = new SideBar(driver);
    }

    public String getAccountNo() {



    return accountNo.getText();

    }

    public double getBalance () throws InterruptedException {

      return Double.parseDouble(balance.getText().substring(1));
    }

    public void clickPayBillLink(){

        sideBar.payBillPage();
    }

}
