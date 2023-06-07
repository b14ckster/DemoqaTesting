package pageElementsObjects.elementsPageElements;

import pageElementsObjects.BaseElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(id = "output")
public class OutputColumn extends BaseElement {

    @FindBy(id = "name")
    private WebElement nameField;
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;
    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressField;
    @FindBy(id = "output")
    private WebElement resultColumn;

    public OutputColumn(WebDriver webDriver) {
        super(webDriver);
    }

    public WebElement getResultColumn() {
        return resultColumn;
    }

    public String getNameTextWithoutFirstPart() {
        return nameField.getText().replaceFirst("Name:", " ");
    }

    public String getEmailTextWithoutFirstPart() {
        return emailField.getText().replaceFirst("Email:", " ");
    }

    public String getCurrentAddressWithoutFirstPart() {
        return currentAddressField.getText().replaceFirst("Current Address :", " ");
    }

    public String getPermanentAddressWithoutFirstPart() {
        return permanentAddressField.getText().replaceFirst("Permananet Address :", " ");
    }
}
