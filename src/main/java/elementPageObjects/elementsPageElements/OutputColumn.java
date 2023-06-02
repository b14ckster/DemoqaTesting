package elementPageObjects.elementsPageElements;

import elementPageObjects.BaseElement;
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

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getCurrentAddressField() {
        return currentAddressField;
    }

    public WebElement getPermanentAddressField() {
        return permanentAddressField;
    }

    public WebElement getResultColumn() {
        return resultColumn;
    }

    @FindBy(id = "output")
    private WebElement resultColumn;

    public OutputColumn(WebDriver webDriver) {
        super(webDriver);
    }

}
