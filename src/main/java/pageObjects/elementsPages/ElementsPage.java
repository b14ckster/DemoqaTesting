package pageObjects.elementsPages;

import elementPageObjects.LeftPannel;
import elementPageObjects.MainHeader;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

public class ElementsPage extends BasePage {

    private final MainHeader mainHeader = new MainHeader(driver);
    private final LeftPannel leftPannel = new LeftPannel(driver);

    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LeftPannel getLeftPannel() {
        return leftPannel;
    }

    public MainHeader getMainHeader() {
        return mainHeader;
    }
}
