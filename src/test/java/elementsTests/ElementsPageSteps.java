package elementsTests;

import baseForTests.BaseAbstractSteps;
import org.testng.annotations.BeforeMethod;

public class ElementsPageSteps extends BaseAbstractSteps {

    @BeforeMethod
    public void openElementsPage() {
        mainPage.openMainPage(URL)
                .getHomeBody().clickElementsCard();
    }
}
