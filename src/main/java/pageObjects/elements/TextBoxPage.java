package pageObjects.elements;

import elementObjects.LeftPannel;
import elementObjects.MainHeader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObjects.BasePage;

public class TextBoxPage extends BasePage {

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
    private final MainHeader mainHeader = new MainHeader(driver);
    private final LeftPannel leftPannel = new LeftPannel(driver);

    public TextBoxPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LeftPannel getLeftPannel() {
        return leftPannel;
    }

    public MainHeader getMainHeader() {
        return mainHeader;
    }

    public TextBoxPage enterUserName(String userName) {
        fullNameField.sendKeys(userName);
        return this;
    }

    public TextBoxPage enterEmail(String email) {
        emailField.sendKeys(email);
        return this;
    }

    public TextBoxPage enterCurrentAddress(String currentAddress) {
        currentAddressField.sendKeys(currentAddress);
        return this;
    }

    public TextBoxPage enterPermanentAddress(String permanentAddress) {
        permanentAddressField.sendKeys(permanentAddress);
        return this;
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}
