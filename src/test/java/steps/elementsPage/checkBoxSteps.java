package steps.elementsPage;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import org.assertj.core.api.Assertions;
import steps.BaseForSteps;
import utils.ElementsSectionUtil;

import static utils.ElementsSectionUtil.makeLowerCase;

public class checkBoxSteps extends BaseForSteps {

    @When("I click on {string} button on Check Box Page")
    public void clickOnButtonOnCheckBoxPage(String button) {
        checkBoxPage.clickOnButton(button);
    }

    @When("I click on {string} checkbox on Check Box Page")
    public void clickOnCheckBoxOnCheckBoxPage(String checkBox) {
        checkBoxPage.clickOnCheckBox(checkBox);
    }

    @When("I select following check boxes:")
    public void selectFollowingCheckBoxes(List<String> checkBoxes) {
        for (String checkBox : checkBoxes) {
            checkBoxPage.clickOnCheckBox(checkBox);
        }
        TestContext.getInstance().setTestObject("checkBoxes", checkBoxes);
    }

    @Then("Result string should appear")
    public void checkResultString() {
        Assertions.assertThat(checkBoxPage.isDisplayedResultString()).isTrue();
    }

    @Then("Result string should contain entered values with following values:")
    public void checkResultStringValues(List<String> followingValues) {
        List<String> checkBoxes = TestContext.getInstance().getTestObject("checkBoxes");
        checkBoxes = makeLowerCase(checkBoxes);
        checkBoxes.addAll(followingValues);
        for (String checkBox : checkBoxes) {
            softAssertions.assertThat(checkBoxPage.isContainItemResultString(checkBox)).isTrue();
        }
        softAssertions.assertAll();
    }

    @Then("Check Box {string} is not selected")
    public void checkIsSelectedCheckBox(String checkBox) {
        Assertions.assertThat(checkBoxPage.checkIsSelectedCheckBox(checkBox)).isFalse();
    }
}
