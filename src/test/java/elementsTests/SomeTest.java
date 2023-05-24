package elementsTests;

import baseForTests.BaseClassTest;
import org.testng.annotations.Test;

public class SomeTest extends BaseClassTest {

    @Test
    public void firstTest() {
        mainPage.openMainPage(URL)
                .getHomeBody().clickElementsCard();
        elementsPage.getLeftPannel().clickTextBoxLink();
        textBoxPage.enterUserName(FULL_NAME)
                   .enterEmail(EMAIL)
                   .enterCurrentAddress(CURRENT_ADDRESS)
                   .enterPermanentAddress(PERMANENT_ADDRESS)
                   .clickSubmitButton();
    }
}
