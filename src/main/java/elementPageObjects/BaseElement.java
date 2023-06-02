package elementPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseElement {
    protected WebDriver driver;

    public BaseElement(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }
}
