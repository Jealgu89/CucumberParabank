package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class NewUserAccountOpenedPage {

    private WebDriver driver;


    @FindBy(how = How.XPATH, using = "//*[@id=\"rightPanel\"]/p")
    private WebElement welcomeText;



    public NewUserAccountOpenedPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);}






    public String welcomeText() {

        return welcomeText.getText();
    }


}
