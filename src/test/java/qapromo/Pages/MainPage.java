package qapromo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainPage extends  BasePage {
    WebDriver driver;

    public MainPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css="div.links.links--right > span.links--login.show.show > div")
    public WebElement registerButton;

    @FindBy(css="div.links.links--right > span.links--login.show.show > a")
    public WebElement loginButton;

    @FindBy(css = "body > div.login-dialog-wrapper.register > div > iframe")
    public WebElement registerIFrame;

    @FindBy(css = "div.login-dialog-wrapper.login > div > iframe")
    public WebElement logInFrame;

    public BasePage switchToIFrame( Iframe frame){
        switch (frame){
            case LOGIN: {
                driver.switchTo().frame(logInFrame);
                return new LoginPage(driver);
            }
            case REGISTER: {
                driver.switchTo().frame(registerIFrame);
                return new RegisterPage(driver);
            }
            default: return this;
        }
    }
    public enum Iframe {
        REGISTER,
        LOGIN,
    }
}
