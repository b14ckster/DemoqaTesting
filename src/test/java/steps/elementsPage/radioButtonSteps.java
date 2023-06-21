package steps.elementsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import steps.BaseForSteps;

public class radioButtonSteps extends BaseForSteps {

    @When("I click on {string} radio button on Radio Button Page")
    public void clickOnRadioButton(String radio) {
        radioButtonPage.clickOnRadioButton(radio);
    }

    @Then("Result string should appear and contain text: {string}")
    public void checkResultString(String resultValue) {
        Assertions.assertThat(radioButtonPage.isDisplayedResultString()).isTrue();
        Assertions.assertThat(radioButtonPage.isContainsTextResultString(resultValue)).isTrue();
    }

    @Then("Radio button {string} is disabled")
    public void checkIsDisabledRadioButton(String radio) {
        Assertions.assertThat(radioButtonPage.IsEnabledRadioButton(radio)).isFalse();
    }
}
