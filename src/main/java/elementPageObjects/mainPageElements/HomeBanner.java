package elementPageObjects.mainPageElements;

import elementPageObjects.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(className = "home-banner")
public class HomeBanner extends BaseComponent {

    @FindBy(xpath = "//*/a[contains(@href, 'https://www.toolsqa.com/selenium-training')]")
    private WebElement seleniumTrainingRef;

    public HomeBanner(WebDriver webDriver) {
        super(webDriver);
    }
}
