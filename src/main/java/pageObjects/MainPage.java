package pageObjects;

import java.util.List;
import org.openqa.selenium.WebElement;
import pageElementObjects.mainPage.HomeBanner;
import pageElementObjects.mainPage.HomeBody;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private final HomeBanner homeBanner;
    private final HomeBody homeBody;

    public MainPage(WebDriver driver) {
        super(driver);

        homeBanner = new HomeBanner(this.driver);
        homeBody = new HomeBody(this.driver);
    }

    public void openMainPage(String url) {
        driver.get(url);
    }

    public boolean isDisplayedTrainingRef() {
        return homeBanner.isDisplayedTrainingRef();
    }

    public int getAmountOfCards() {
        return homeBody.getAmountOfCards();
    }

    public void clickOnCard(String card) {
        homeBody.clickOnCard(card);
    }

    public List<WebElement> getCards() {
        return homeBody.getCards();
    }
}
