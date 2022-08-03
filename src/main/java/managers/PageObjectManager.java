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

    public AccountDetailsPage accountDetailsPage() {

        return (accountDetailsPage == null) ? accountDetailsPage = new AccountDetailsPage(driver) : accountDetailsPage;

    }



}
