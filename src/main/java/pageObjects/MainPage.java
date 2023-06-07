package pageObjects;

import pageElementObjects.mainPageElements.HomeBanner;
import pageElementObjects.mainPageElements.HomeBody;
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

    public HomeBanner getHomeBanner() {
        return homeBanner;
    }

    public HomeBody getHomeBody() {
        return homeBody;
    }
}
