package elementPageObjects.mainPageElements;

import elementPageObjects.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(className = "home-body")
public class HomeBody extends BaseComponent {

    @FindBy(xpath = "//*/*[contains(@class, 'card mt-4 top-card')][1]")
    private WebElement elementsCard;
    @FindBy(xpath = "//*/*[contains(@class, 'card mt-4 top-card')][2]")
    private WebElement formsCard;
    @FindBy(xpath = "//*/*[contains(@class, 'card mt-4 top-card')][3]")
    private WebElement alertsFrameWindowsCard;
    @FindBy(xpath = "//*/*[contains(@class, 'card mt-4 top-card')][4]")
    private WebElement widgetsCard;
    @FindBy(xpath = "//*/*[contains(@class, 'card mt-4 top-card')][5]")
    private WebElement interactionsCard;
    @FindBy(xpath = "//*/*[contains(@class, 'card mt-4 top-card')][6]")
    private WebElement bookStoreApplicationCard;

    public HomeBody(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickElementsCard() {
        elementsCard.click();
    }

    public void clickFormsCard() {
        formsCard.click();
    }

    public void clickAlertsFrameWindowsCard() {
        alertsFrameWindowsCard.click();
    }

    public void clickWidgetsCard() {
        widgetsCard.click();
    }

    public void clickInteractionsCard() {
        interactionsCard.click();
    }

    public void clickBookStoreApplicationCard() {
        bookStoreApplicationCard.click();
    }
}
