package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SideBar {

    private WebDriver driver;
    final By openNewAccountLink = By.cssSelector("#leftPanel > ul > li:nth-child(1) > a");

    public SideBar(WebDriver driver) {
        this.driver = driver;
    }



    public OpenNewAccountPage clickOpenNewAccount() {
        driver.findElement(openNewAccountLink).click();
        return new OpenNewAccountPage(driver);

    }





}
