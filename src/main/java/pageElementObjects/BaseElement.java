package pageElementObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseElement {
    protected WebDriver driver;
    protected JavascriptExecutor js;

    public BaseElement(WebDriver driver) {
        this.driver = driver;
        js = (JavascriptExecutor) this.driver;
        PageFactory.initElements(this.driver, this);
    }
}
