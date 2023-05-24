package elementPageObjects.elementsPageElements;

import elementPageObjects.BaseComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(id = "output")
public class OutputColumn extends BaseComponent {

    @FindBy(id = "name")
    private WebElement nameField;
    @FindBy(id = "email")
    private WebElement emailField;
    @FindBy(id = "currentAddress")
    private WebElement currentAddressField;
    @FindBy(id = "permanentAddress")
    private WebElement permanentAddressField;

    public OutputColumn(WebDriver webDriver) {
        super(webDriver);
    }

}
