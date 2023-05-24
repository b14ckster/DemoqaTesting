package elementsTests;

import org.testng.annotations.Test;

public class TextBoxPageTests extends BaseClassElementsTest {

    @Test
    public void enterValuesTest() {
        elementsPage.getLeftPannel().clickTextBoxLink();
        textBoxPage.enterUserName(FULL_NAME)
                   .enterEmail(EMAIL)
                   .enterCurrentAddress(CURRENT_ADDRESS)
                   .enterPermanentAddress(PERMANENT_ADDRESS)
                   .clickSubmitButton();
    }

}
