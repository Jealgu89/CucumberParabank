package pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PayBillPage {

    private WebDriver driver;

    public PayBillPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(how = How.NAME, using = "payee.name")
    private WebElement payeeNameField;

    @FindBy(how = How.NAME, using = "payee.address.street")
    private WebElement payeeAddressField;

    @FindBy(how = How.NAME, using = "payee.address.city")
    private WebElement payeeCityField;

    @FindBy(how = How.NAME, using = "payee.address.state")
    private WebElement payeeStateField;

    @FindBy(how = How.NAME, using = "payee.address.zipCode")
    private WebElement payeeZipCodeField;

    @FindBy(how = How.NAME, using = "payee.phoneNumber")
    private WebElement payeePhoneNumberField;

    @FindBy(how = How.NAME, using = "payee.accountNumber")
    private WebElement payeeAccountField;

    @FindBy(how = How.NAME, using = "verifyAccount")
    private WebElement payeeAccountVerifyField;

    @FindBy(how = How.NAME, using = "amount")
    private WebElement amountField;

    @FindBy(how = How.NAME, using = "fromAccountId")
    private WebElement fromAccountDropDown;

    @FindBy(how = How.CSS, using = "#rightPanel > div > div:nth-child(1) > form > table > tbody > tr:nth-child(14) > td:nth-child(2) > input")
    private WebElement sendPaymentButton;

    Double amount;




    public void registerPayeeName(String payeeName ) {
        payeeNameField.sendKeys(payeeName);


    }

    public void registerAddress(String Address) {
        payeeAddressField.sendKeys(Address);

    }


    public void registerCity(String City) {
        payeeCityField.sendKeys(City);

    }




    public void registerState(String state){

        payeeStateField.sendKeys(state);

    }

    public void registerZipCode(String zipCode){

        payeeZipCodeField.sendKeys(zipCode);

    }

    public void registerPhoneNumber(String phone){

        payeePhoneNumberField.sendKeys(phone);
    }

    public void registerAccount(String account)
    {
        payeeAccountField.sendKeys(account);

    }

    public void registerVerifyAccount(String account) {
        payeeAccountVerifyField.sendKeys(account);

    }

    public void registerAmount(String Amount) {

        amountField.sendKeys(Amount);
    }


    private Select getAccountDropDown() {return new Select(fromAccountDropDown);}

    public void setAccount(Integer accountIndex){
        getAccountDropDown().selectByIndex(accountIndex);

    }

    public void enterBillInfo(DataTable billInfo) {


        List<List<String>> data = billInfo.cells();

        registerPayeeName(data.get(0).get(0));
        registerAddress(data.get(0).get(1));
        registerCity(data.get(0).get(2));
        registerState(data.get(0).get(3));
        registerZipCode(data.get(0).get(4));
        registerPhoneNumber(data.get(0).get(5));
        registerAccount(data.get(0).get(6));
        registerVerifyAccount(data.get(0).get(7));
        registerAmount(data.get(0).get(8));
        Integer accountFromIndex = Integer.parseInt(data.get(0).get(9));
        setAccount(accountFromIndex);
        sendPaymentButton.click();

        this.amount = Double.parseDouble(data.get(0).get(8));

    }

}
