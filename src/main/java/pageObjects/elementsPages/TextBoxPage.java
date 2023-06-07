package pageObjects.elementsPages;

import java.util.List;
import pageElementsObjects.LeftPannel;
import pageElementsObjects.SubTitle;
import pageElementsObjects.elementsPageElements.OutputColumn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

public class TextBoxPage extends ElementsPage {

    public static final String FULL_NAME = "Full Name";
    public static final String EMAIL = "Email";
    public static final String CURRENT_ADDRESS = "Current Address";
    public static final String PERMANENT_ADDRESS = "Permanent Address";
    @FindBy(id = "userName")
    private WebElement fullNameField;
    @FindBy(id = "userEmail")
    private WebElement emailField;
    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;
    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressField;
    @FindBy(id = "submit")
    private WebElement submitButton;
    private final OutputColumn outputColumn = new OutputColumn(driver);

    public TextBoxPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isDisplayedOutputColumn() {
        return outputColumn.getResultColumn().isDisplayed();
    }

    public void enterValuesInTextFields(List<List<String>> values) {
        values.forEach(field -> {
            switch (field.get(0)) {
                case FULL_NAME -> fullNameField.sendKeys(field.get(1));
                case EMAIL -> emailField.sendKeys(field.get(1));
                case CURRENT_ADDRESS -> currentAddressField.sendKeys(field.get(1));
                case PERMANENT_ADDRESS -> permanentAddressField.sendKeys(field.get(1));
            }
        });
    }

    public OutputColumn getOutput() {
        return outputColumn;
    }
}
