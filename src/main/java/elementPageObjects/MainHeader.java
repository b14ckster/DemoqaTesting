package elementPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainHeader extends BaseElement {

    @FindBy(className = "main-header")
    private WebElement subTitle;

    public MainHeader(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getSubTitle() {
        return subTitle;
    }
}
