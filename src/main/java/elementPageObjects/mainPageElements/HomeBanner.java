package elementPageObjects.mainPageElements;

import elementPageObjects.BaseElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(className = "home-banner")
public class HomeBanner extends BaseElement {

    @FindBy(xpath = "//*/a[contains(@href, 'https://www.toolsqa.com/selenium-training')]")
    private WebElement seleniumTrainingRef;

    public HomeBanner(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getSeleniumTrainingRef() {
        return seleniumTrainingRef;
    }
}
