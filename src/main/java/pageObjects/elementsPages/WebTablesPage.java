package pageObjects.elementsPages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageElementObjects.elementsSection.RegistrationForm;
import pageElementObjects.elementsSection.WebTable;

public class WebTablesPage extends ElementsPage {

    public static final String ADD_BUTTON = "Add";

    @FindBy(id = "addNewRecordButton")
    private WebElement addNewRecordButton;
    @FindBy(id = "searchBox")
    private WebElement searchBox;

    private final WebTable webTable;

    private final RegistrationForm registrationForm;

    public WebTablesPage(WebDriver driver) {
        super(driver);
        webTable = new WebTable(this.driver);
        registrationForm = new RegistrationForm(this.driver);
    }

    public void clickOnButton(String button) {
        if (button.equals(ADD_BUTTON)) {
            addNewRecordButton.click();
        } else {
            webTable.clickOnButton(button);
        }
    }

    public boolean isEnabledButton(String button) {
        return webTable.isEnabledButton(button);
    }

    public void enterTextInSearchBox(String text) {
        searchBox.sendKeys(text);
    }

    public void clickOnColumnHeader(String columnName) {
        webTable.clickOnColumnName(columnName);
    }

    public void deleteRowByIndex(int index) {
        webTable.deleteRowByIndex(index);
    }

    public void changeRowsPerPage(int numberOfRows) {
        webTable.selectPageSizeOption(numberOfRows);
    }

    public void addNewRow(List<String> values) {
        addNewRecordButton.click();
        registrationForm.fillRegistrationForm(values);
    }

    public int getNumberOfRowsWithValues() {
        return webTable.getNumberOfRowsWithValues();
    }

    public void editRow(int index, List<String> values) {
        webTable.clickOnEditButtonInRow(index);
        registrationForm.fillRegistrationForm(values);
    }
}
