package steps.elementsPage;

import context.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import org.assertj.core.api.Assertions;
import steps.BaseForSteps;
import utils.ElementsSectionUtil;

import static utils.ElementsSectionUtil.getValuesWithoutFirstLine;

public class webTablesSteps extends BaseForSteps {

    @Then("{string} button should be enabled")
    public void checkIsEnabledButton(String button) {
        Assertions.assertThat(webTablesPage.isEnabledButton(button)).isTrue();
    }

    @When("I click on {string} button")
    public void clickOnButton(String button) {
        webTablesPage.clickOnButton(button);
    }

    @When("I enter {string} in search box")
    public void enterTextInSearchBox(String text) {
        webTablesPage.enterTextInSearchBox(text);
        TestContext.getInstance().setTestObject("sortingValue", text);
    }

    @When("I click on {string} column in web table")
    public void clickOnColumnHeader(String columnName) {
        webTablesPage.clickOnColumnHeader(columnName);
    }

    @When("I delete {int} row in web table")
    public void deleteRowFromWebTable(int index) {
        TestContext.getInstance().setTestObject("deletedRow", webTablesPage.getValuesFromRowByIndex(index));
        webTablesPage.deleteRowByIndex(index);
    }

    @When("I change rows per page to {int} rows")
    public void changeRowsPerPage(int numberOfRows) {
        webTablesPage.changeRowsPerPage(numberOfRows);
    }

    @When("I add new {int} rows in web table containing:")
    public void addNewRowsInWebTable(int numberOfRows, List<List<String>> table) {
        for (int i = 1; i <= numberOfRows; i++) {
            webTablesPage.addNewRow(table.get(i));
        }
        TestContext.getInstance().setTestObject("table", getValuesWithoutFirstLine(table));
    }

    @When("At least {int} rows with values should be in web table")
    public void checkNumberOfRowsInWebTable(int numberOfRows) {
        Assertions.assertThat(webTablesPage.getNumberOfRowsWithValues()).isGreaterThanOrEqualTo(numberOfRows);
    }

    @When("I edit {int} row in web table to:")
    public void editRow(int rowIndex, List<List<String>> values) {
        webTablesPage.editRow(rowIndex, values.get(1));
        TestContext.getInstance().setTestObject("editedRow", values.get(1));
        List<List<String>> resultValues = TestContext.getInstance().getTestObject("values");
        resultValues.remove(--rowIndex);
        resultValues.add(rowIndex, values.get(1));
        TestContext.getInstance().setTestObject("values", resultValues);
    }

    @Then("Added rows and following rows should be a in web table:")
    public void checkRowsInWebTable(List<List<String>> values) {
        List<List<String>> expectedValues = TestContext.getInstance().getTestObject("values");
        values.remove(0);
        for (int i = 0; i < values.size(); i++) {
            expectedValues.add(i, values.get(i));
        }
        for (int i = 0; i < expectedValues.size(); i++) {
            softAssertions.assertThat(webTablesPage.getValuesFromRowByIndex(i + 1)).isEqualTo(expectedValues.get(i));
        }
        softAssertions.assertAll();
    }

    @Then("{int} row should contain entered values in web table")
    public void checkEditedRow(int rowIndex) {
        List<String> expectedValues = TestContext.getInstance().getTestObject("editedRow");
        softAssertions.assertThat(webTablesPage.getValuesFromRowByIndex(rowIndex)).isEqualTo(expectedValues);
    }

    @Then("Deleted row is no longer in web table")
    public void checkIfRowDeleted() {
        List<String> deletedRow = TestContext.getInstance().getTestObject("deletedRow");
        int size = webTablesPage.getNumberOfRowsWithValues();
        for (int i = 1; i <= size; i++) {
            softAssertions.assertThat(deletedRow).isNotEqualTo(webTablesPage.getValuesFromRowByIndex(i));
        }
        softAssertions.assertAll();
    }

    @Then("Web table should be sorted by {string} column of {string} in {string} order")
    public void checkTableSorting(String columnName, String type, String order) {
        Assertions.assertThat(webTablesPage.isRowSorted(columnName, type, order)).isTrue();
    }

    @Then("Web table should contain rows only with entered value")
    public void checkFilteredWebTable() {
        String sortingValue = TestContext.getInstance().getTestObject("sortingValue");
        for (int i = 1; i <= webTablesPage.getNumberOfRowsWithValues(); i++) {
            Assertions.assertThat(webTablesPage.isRowContainsSortingValue(sortingValue, i)).isTrue();
        }
    }
}
