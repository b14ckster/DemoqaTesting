package steps.elementsPage;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import org.assertj.core.api.Assertions;
import steps.BaseForSteps;
import utils.ElementsSectionUtil;

public class webTablesSteps extends BaseForSteps {

    @Then("{string} button should be enabled")
    public void checkIsEnabledButton(String button) {
        Assertions.assertThat(webTablesPage.isEnabledButton(button)).isFalse();
    }

    @When("I click on {string} button")
    public void clickOnButton(String button) {
        webTablesPage.clickOnButton(button);
    }

    @When("I enter {string} in search box")
    public void enterTextInSearchBox(String text) {
        webTablesPage.enterTextInSearchBox(text);
    }

    @When("I click on {string} column in web table")
    public void clickOnColumnHeader(String columnName) {
        webTablesPage.clickOnColumnHeader(columnName);
    }

    @When("I delete {int} row in web table")
    public void deleteRowFromWebTable(int index) {
        webTablesPage.deleteRowByIndex(index);
    }

    @When("I change rows per page to {int} rows")
    public void changeRowsPerPage(int numberOfRows) {
        webTablesPage.changeRowsPerPage(numberOfRows);
    }

    @When("I add new {int} rows in web table containing:")
    public void addNewRowsInWebTable(int numberOfRows, List<List<String>> values) {
        for (int i = 1; i <= numberOfRows; i++) {
            webTablesPage.addNewRow(values.get(i));
        }
        TestContext.getInstance().setTestObject("values", ElementsSectionUtil.getValuesWithoutFirstLine(values));
    }

    @When("At least {int} rows with values should be in web table")
    public void checkNumberOfRowsInWebTable(int numberOfRows) {
        Assertions.assertThat(webTablesPage.getNumberOfRowsWithValues()).isGreaterThanOrEqualTo(numberOfRows);
    }

    @When("I edit {int} row in web table to!:")
    public void editRow(int rowIndex, List<List<String>> values) {
        webTablesPage.editRow(rowIndex, values.get(1));
        List<List<String>> resultValues = TestContext.getInstance().getTestObject("values");
    }
}
