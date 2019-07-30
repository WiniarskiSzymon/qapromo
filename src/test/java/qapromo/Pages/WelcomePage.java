package qapromo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage extends BasePage{

    public WelcomePage(WebDriver driver) {
        super(driver);
        this.driver  = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="#intercom-container > div > div > div > div > div.intercom-tour-step-header > span")
    public WebElement closeButton;

}
