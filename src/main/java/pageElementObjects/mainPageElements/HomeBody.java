package pageElementObjects.mainPageElements;

import java.util.List;
import pageElementObjects.BaseElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(className = "home-body")
public class HomeBody extends BaseElement {

    public static final String ELEMENTS = "Elements";
    public static final String FORMS = "Forms";
    public static final String ALERTS_FRAME_WINDOWS = "Alerts, Frame & Windows";
    public static final String WIDGETS = "Widgets";
    public static final String INTERACTIONS = "Interactions";

    @FindBy(xpath = "//*/*[contains(@class, 'card mt-4 top-card')]")
    private List<WebElement> cards;
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

    public HomeBody(WebDriver driver) {
        super(driver);
    }

    public void clickOnCard(String card) {
        switch (card) {
            case ELEMENTS -> elementsCard.click();
            case FORMS -> formsCard.click();
            case ALERTS_FRAME_WINDOWS -> alertsFrameWindowsCard.click();
            case WIDGETS -> widgetsCard.click();
            case INTERACTIONS -> interactionsCard.click();
        }
    }

    public int getAmountOfCards() {
        return cards.size();
    }

    public List<WebElement> getCards() {
        return cards;
    }
}
