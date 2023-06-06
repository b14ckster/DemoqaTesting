package pageObjects;

import elementPageObjects.mainPageElements.HomeBanner;
import elementPageObjects.mainPageElements.HomeBody;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage {

    private HomeBanner homeBanner;
    private HomeBody homeBody;

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public MainPage openMainPage (String url) {
        driver.get(url);
        homeBanner = new HomeBanner(driver);
        homeBody = new HomeBody(driver);
        return this;
    }

    public HomeBanner getHomeBanner() {
        return homeBanner;
    }

    public HomeBody getHomeBody() {
        return homeBody;
    }
}
