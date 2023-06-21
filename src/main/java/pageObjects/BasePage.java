package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;
    protected Actions action;
    protected JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        action = new Actions(this.driver);
        js = (JavascriptExecutor) this.driver;
        PageFactory.initElements(this.driver, this);
    }

    public void scrollIntoView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickByActions(WebElement element) {
        action.moveToElement(element).click(element).perform();
    }
}
