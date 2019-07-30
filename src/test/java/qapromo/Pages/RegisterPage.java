package qapromo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegisterPage extends BasePage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        super(driver);
        this.driver  = driver;
    PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#layout-content")
    public WebElement registerWindow;

    @FindBy(id = "sui-email")
    public WebElement emailField;


    @FindBy(id="sui-full-name")
    public WebElement userNameField;

    @FindBy(id="sui-password")
    public WebElement passwordField;

    @FindBy(css = "#layout-content > div.body > form > div.form-row.send > input")
    public WebElement signUpButton;

}
