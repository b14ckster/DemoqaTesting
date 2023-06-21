package pageElementObjects.mainPageElements;

import pageElementObjects.BaseElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(className = "home-banner")
public class HomeBanner extends BaseElement {

    @FindBy(xpath = "//*/a[contains(@href, 'https://www.toolsqa.com/selenium-training')]")
    private WebElement seleniumTrainingRef;

    public HomeBanner(WebDriver driver) {
        super(driver);
    }

    public WebElement getSeleniumTrainingRef() {
        return seleniumTrainingRef;
    }

    public boolean isDisplayedTrainingRef() {
        return seleniumTrainingRef.isDisplayed();
    }
}
