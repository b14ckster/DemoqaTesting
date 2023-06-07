package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    @FindBy(xpath = "//*/span[contains(text(), '© 2013-2020 TOOLSQA.COM | ALL RIGHTS RESERVED.')]")
    private WebElement bottom_line;
    @FindBy(xpath = "//*/a[contains(@href, 'https://demoqa.com')]")
    private WebElement title;

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public WebElement getBottomLine() {
        return bottom_line;
    }

    public void clickTitle() {
        title.click();
    }
}
