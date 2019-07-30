package qapromo.Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LibraryPage extends BasePage{

    WebDriver driver;

    public LibraryPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(css = "#search-section > div.promo-collection-wrapper > div > div.pc-results > div > div:nth-child(n)")
    public List<WebElement> promoTemplatesList;

    @FindBy(css = "#search-section > div.search-header > div > div.search-input-box > div > div > div.library-search-input > div")
    public WebElement searchBaar;

    @FindBy(id = "vid")
    public WebElement videoPlayer;

    @FindBy(css = "#intercom-positioner-tree > div.intercom-x8vro1.e1rbdy0f2 > div > iframe")
    public WebElement welcomeIFrame;

    public WebElement getButtonForTemplateByIndex(int index) {
        String buttonCSSPath = "#search-section > div.promo-collection-wrapper > div > div.pc-results > div > div:nth-child(" + index + ") > div.pr-overlay > div.pr-overlay-buttons > button.pr-overlay-btn.pr-preview-btn";
        return driver.findElement(By.cssSelector(buttonCSSPath));
    }

    public BasePage switchToWelcomeIFrame() {
        driver.switchTo().frame(welcomeIFrame);
        return new WelcomePage(driver);
    }
}

