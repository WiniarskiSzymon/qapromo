package qapromo.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WizardPage extends BasePage {



    public WizardPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#layout-content > div > div.wizard > div.wizard-scrollable.buttons-display > div > div.buttons > div")
    public WebElement noneAboveButton;

    @FindBy(css ="#layout-content > div > div.wizard > div.wizard-scrollable.buttons-display > div > div.business >div")
    public List<WebElement> templateTypesContener;

    @FindBy(css ="#layout-content > div > div.wizard > div.wizard-scrollable.buttons-display > div > div.business.other-frame > input")
    public WebElement yourBusinessInputField;

    @FindBy(css="#layout-content > div > div.wizard > div.wizard-scrollable.buttons-display > div > div.buttons.with-margin > div.next")
    public WebElement nextButton;
}
