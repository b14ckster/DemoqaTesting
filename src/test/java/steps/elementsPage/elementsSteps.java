package steps.elementsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import steps.BaseForSteps;

public class elementsSteps extends BaseForSteps {

    @Then("{string} page should be opened")
    public void CheckOpenedPage(String subTitle) {
        Assertions.assertThat(elementsPage.getSubTitle().getSubTitleText()).isEqualTo(subTitle);
    }

    @When("I click on {string} on left panel")
    public void clickOnItemInLeftPanel(String item) {
        elementsPage.getLeftPannel().clickOnItem(item);
    }
}
