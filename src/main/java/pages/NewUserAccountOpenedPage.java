package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewUserAccountOpenedPage {

    private WebDriver driver;



    private By welcomeText = By.xpath("//*[@id=\"rightPanel\"]/p");

    public NewUserAccountOpenedPage(WebDriver driver) {this.driver=driver;}






    public String welcomeText() {

        return driver.findElement(welcomeText).getText();
    }


}
