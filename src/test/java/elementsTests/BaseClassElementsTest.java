package elementsTests;

import baseForTests.BaseClassTest;
import org.testng.annotations.BeforeMethod;

public class BaseClassElementsTest extends BaseClassTest {

    @BeforeMethod
    public void openElementsPage() {
        mainPage.openMainPage(URL)
                .getHomeBody().clickElementsCard();
    }
}
