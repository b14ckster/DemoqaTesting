package elementPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseComponent {
    protected WebDriver driver;

    public BaseComponent(WebDriver webDriver) {
        driver = webDriver;
        PageFactory.initElements(driver, this);
    }
}
