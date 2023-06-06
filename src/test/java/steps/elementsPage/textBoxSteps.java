package steps.elementsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import steps.BaseForSteps;

public class textBoxSteps extends BaseForSteps {

    @When("I enter following values in text fields:")
    public void EnterValuesInTextFields() {

    }

    @When("I click on Submit button")
    public void ClickOnSubmitButton() {
        textBoxPage.clickSubmitButton();
    }

    @Then("Output should appear")
    public void CheckOutput() {
        Assertions.assertThat(textBoxPage.isDisplayedOutputColumn()).isTrue();
    }

    @Then("Output should contain entered values")
    public void CheckOutputValues() {

    }

}
