package pageObjects.elementsPages;

import pageElementObjects.LeftPannel;
import pageElementObjects.SubTitle;
import org.openqa.selenium.WebDriver;
import pageObjects.BasePage;

public class ElementsPage extends BasePage {

    private final SubTitle subTitle;
    private final LeftPannel leftPannel;

    public ElementsPage(WebDriver driver) {
        super(driver);

        subTitle = new SubTitle(this.driver);
        leftPannel = new LeftPannel(this.driver);
    }

    public void clickOnItemOnLeftPanel(String item) {
        leftPannel.clickOnItem(item);
    }

    public String getSubTitleText() {
        return subTitle.getSubTitleText();
    }
}
