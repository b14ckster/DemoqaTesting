package pageObjects.elementsPages;

import pageElementsObjects.LeftPannel;
import pageElementsObjects.SubTitle;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

public class ElementsPage extends BasePage {

    private final SubTitle subTitle = new SubTitle(driver);
    private final LeftPannel leftPannel = new LeftPannel(driver);

    public ElementsPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LeftPannel getLeftPannel() {
        return leftPannel;
    }

    public SubTitle getSubTitle() {
        return subTitle;
    }
}
