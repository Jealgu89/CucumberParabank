package managers;

import org.openqa.selenium.WebDriver;

import pages.*;





public class PageObjectManager {

    private WebDriver driver;

    private HomePage homePage;

    private NewUserAccountOpenedPage newUserAccountOpenedPage;

    private OpenNewAccountPage openNewAccountPage;

    private RegistrationPage registrationPage;

    private AccountsOverviewPage accountsOverviewPage;

    private NewAccountOpenedPage newAccountOpenedPage;

    private AccountDetailsPage accountDetailsPage;

    private PayBillPage payBillPage;

    private BillPaymentCompletePage billPaymentCompletePage;

    private SideBar sideBar;


    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public AccountsOverviewPage getAccountsOverviewPage() {
        return (accountsOverviewPage == null) ? accountsOverviewPage = new AccountsOverviewPage(driver) : accountsOverviewPage;
    }


    public NewAccountOpenedPage getNewAccountOpenedPage(){

        return (newAccountOpenedPage == null) ? newAccountOpenedPage = new NewAccountOpenedPage(driver) : newAccountOpenedPage;
    }

    public NewUserAccountOpenedPage getNewUserAccountOpenedPage() {

        return (newUserAccountOpenedPage == null) ? newUserAccountOpenedPage = new NewUserAccountOpenedPage(driver) : newUserAccountOpenedPage;
    }

    public OpenNewAccountPage getOpenNewAccountPage() {

        return  (openNewAccountPage == null) ? openNewAccountPage = new OpenNewAccountPage(driver) : openNewAccountPage;
    }

    public RegistrationPage getRegistrationPage() {

        return (registrationPage == null) ? registrationPage = new RegistrationPage(driver) : registrationPage;

    }

    public AccountDetailsPage getAccountDetailsPage() {

        return (accountDetailsPage == null) ? accountDetailsPage = new AccountDetailsPage(driver) : accountDetailsPage;

    }

    public PayBillPage getPayBillPage(){

        return (payBillPage == null) ? payBillPage = new PayBillPage(driver) : payBillPage;
    }

    public BillPaymentCompletePage getBillPaymentCompletePage(){

        return (billPaymentCompletePage == null) ? billPaymentCompletePage = new BillPaymentCompletePage(driver) : billPaymentCompletePage;

    }

    public SideBar getSideBar(){

        return (sideBar == null) ? sideBar = new SideBar(driver) : sideBar;
    }


}
