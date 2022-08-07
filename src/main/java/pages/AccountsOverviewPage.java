package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class AccountsOverviewPage {


private WebDriver driver;

@FindBy(how = How.CSS, using = "#rightPanel > div > div > h1")
        private WebElement accountsOverviewPageTitle;



@FindBy(how = How.XPATH, using = ("//*[@id=\"accountTable\"]/tbody/tr[1]/td[1]/a"))
public WebElement linkToFirstAccount;

@FindBy(how = How.CSS, using = ("#accountTable > tbody > tr.ng-scope > td:nth-child(2)"))
    public WebElement balanceFirstAccount;




public AccountsOverviewPage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);}

    public double balanceFirstAccount(WebElement balance) {

    String balanceFirstAccount = balance.getText().substring(1);
    System.out.println(balanceFirstAccount);


        return Double.parseDouble(balanceFirstAccount);
    }


    public WebElement getAccountsOverviewTitle (){

       return accountsOverviewPageTitle;

    }

    public void clickLinkToFirstAccount(){

    linkToFirstAccount.click();

    }







}



