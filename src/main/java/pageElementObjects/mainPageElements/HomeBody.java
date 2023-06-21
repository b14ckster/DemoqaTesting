package pageElementObjects.mainPageElements;

import java.util.List;
import pageElementObjects.BaseElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(className = "home-body")
public class HomeBody extends BaseElement {

    @FindBy(xpath = "//*/*[contains(@class, 'card mt-4 top-card')]")
    private List<WebElement> cards;

    public HomeBody(WebDriver driver) {
        super(driver);
    }

    public WebElement getCard(String cardName) {
        for (WebElement card : cards) {
            if (card.getText().contains(cardName)) {
                return card;
            }
        }
        return null;
    }

    public void clickOnCard(String card) {
        getCard(card).click();
    }

    public int getAmountOfCards() {
        return cards.size();
    }

    public List<WebElement> getCards() {
        scrollIntoView(getCard("Book Store Application"));
        return cards;
    }
}
