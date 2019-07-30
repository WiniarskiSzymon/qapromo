package qapromo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends BasePage{

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#layout-content")
    public WebElement loginWindow;

    @FindBy(id = "sui-email")
    public WebElement emailField;

    @FindBy(id="sui-password")
    public WebElement passwordField;

    @FindBy(css = "#layout-content > div.body > form > div.form-row.login > input")
    public WebElement logInButton;
}
