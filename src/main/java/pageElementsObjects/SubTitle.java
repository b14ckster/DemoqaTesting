package pageElementsObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubTitle extends BaseElement {

    @FindBy(className = "main-header")
    private WebElement subTitle;

    public SubTitle(WebDriver webDriver) {
        super(webDriver);
    }

    public String getSubTitleText() {
        return subTitle.getText();
    }
}
