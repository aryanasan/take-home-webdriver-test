import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginPage {


    WebDriver driver;


    public POMLoginPage(WebDriver drive) {
        driver = drive;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "login")
    public WebElement loginInput;

}