import pageObjects.MainPage;
import org.testng.annotations.Test;
import pageObjects.elements.ElementsPage;
import pageObjects.elements.TextBoxPage;

public class SomeTest extends BaseClassTest {

    String fullName = "Zalupa Tigra";
    String email = "ZhopaKota@suka.com";
    String currentAddress = "Muhosransk";
    String permanentAddress = "Popa Putina";

    @Test
    public void firstTest() {
        mainPage.openMainPage(URL)
                .getHomeBody().clickElementsCard();
        elementsPage.getLeftPannel().clickTextBoxLink();
        textBoxPage.enterUserName(fullName)
                   .enterEmail(email)
                   .enterCurrentAddress(currentAddress)
                   .enterPermanentAddress(permanentAddress)
                   .clickSubmitButton();
    }
}
