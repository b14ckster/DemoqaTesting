package steps.elementsPage;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import org.assertj.core.api.Assertions;
import steps.BaseForSteps;
import utils.TextBoxUtil;

public class textBoxSteps extends BaseForSteps {

    @When("I enter following values in text fields:")
    public void EnterValuesInTextFields(List<List<String>> values) {
        textBoxPage.enterValuesInTextFields(values);
        TestContext.getInstance().setTestObject("values", TextBoxUtil.getTextFieldsValues(values));
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
        List<String> values = TestContext.getInstance().getTestObject("values");


    }

}
