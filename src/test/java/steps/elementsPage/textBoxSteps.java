package steps.elementsPage;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import org.assertj.core.api.Assertions;
import steps.BaseForSteps;
import utils.ElementsSectionUtil;

public class textBoxSteps extends BaseForSteps {

    @When("I enter following values in text fields:")
    public void EnterValuesInTextFields(List<List<String>> values) {
        textBoxPage.enterValuesInTextFields(values);
        TestContext.getInstance().setTestObject("values", ElementsSectionUtil.getSecondColumnFromValues(values));
    }

    @When("I click on Submit button")
    public void ClickOnSubmitButton() {
        textBoxPage.clickOnSubmitButton();
    }

    @Then("Output should appear")
    public void CheckOutput() {
        Assertions.assertThat(textBoxPage.isDisplayedOutputColumn()).isTrue();
    }

    @Then("Output should contain entered values")
    public void CheckOutputValues() {
        List<String> expectedValues = TestContext.getInstance().getTestObject("values");

        softAssertions.assertThat(textBoxPage.getNameFromOutputColumn())
                      .isEqualTo(expectedValues.get(0));
        softAssertions.assertThat(textBoxPage.getEmailFromOutputColumn())
                      .isEqualTo(expectedValues.get(1));
        softAssertions.assertThat(textBoxPage.getCurrentAddressFromOutputColumn())
                      .isEqualTo(expectedValues.get(2));
        softAssertions.assertThat(textBoxPage.getPermanentAddressFromOutputColumn())
                      .isEqualTo(expectedValues.get(3));

        softAssertions.assertAll();
    }
}
