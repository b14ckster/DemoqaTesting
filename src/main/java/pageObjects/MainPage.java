package pageObjects;

import elementPageObjects.mainPageElements.HomeBanner;
import elementPageObjects.mainPageElements.HomeBody;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private final HomeBanner homeBanner = new HomeBanner(driver);
    private final HomeBody homeBody = new HomeBody(driver);

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage openMainPage (String url) {
        driver.get(url);
        return this;
    }

    public HomeBanner getHomeBanner() {
        return homeBanner;
    }

    public HomeBody getHomeBody() {
        return homeBody;
    }
}
