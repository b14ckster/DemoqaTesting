package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(xpath = "//*/span[contains(text(), '© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.')]")
    private WebElement bottom_line;
    @FindBy(xpath = "//*/a[contains(@href, 'https://demoqa.com')]")
    private WebElement title;

    protected WebDriver driver;
    protected Actions action;
    protected JavascriptExecutor js;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        action = new Actions(this.driver);
        js = (JavascriptExecutor) this.driver;
        PageFactory.initElements(this.driver, this);
    }

    public WebElement getBottomLine() {
        return bottom_line;
    }

    public void clickTitle() {
        title.click();
    }

    public void scrollIntoView(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickByActions(WebElement element) {
        action.moveToElement(element).click(element).perform();
    }
}
