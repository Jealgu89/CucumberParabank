package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SideBar {

    private WebDriver driver;
    PayBillPage payBillPage;


    @FindBy(how = How.CSS, using = "#leftPanel > ul > li:nth-child(1) > a")
            private WebElement openNewAccountLink;


    @FindBy(how = How.CSS, using = "#leftPanel > ul > li:nth-child(4) > a")
    private WebElement payBillLink;

    public SideBar(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public OpenNewAccountPage clickOpenNewAccount() {
        openNewAccountLink.click();
        return new OpenNewAccountPage(driver);

    }

    public void payBillPage() {

        payBillLink.click();


    }
}