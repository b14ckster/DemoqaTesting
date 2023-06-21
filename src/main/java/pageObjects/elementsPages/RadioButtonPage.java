package pageObjects.elementsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RadioButtonPage extends ElementsPage {

    public static final String YES_RADIO = "Yes";
    public static final String IMPRESSIVE_RADIO = "Impressive";
    public static final String NO_RADIO = "No";

    @FindBy(id = "yesRadio")
    private WebElement yesRadioButton;
    @FindBy(id = "impressiveRadio")
    private WebElement impressiveRadioButton;
    @FindBy(id = "noRadio")
    private WebElement noRadioButton;
    @FindBy(className = "text-success")
    private WebElement resultString;

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRadioButton(String radio) {
        switch (radio) {
            case YES_RADIO -> {
                return yesRadioButton;
            }
            case IMPRESSIVE_RADIO -> {
                return impressiveRadioButton;
            }
            case NO_RADIO -> {
                return noRadioButton;
            }
        }
        return null;
    }

    public void clickOnRadioButton(String radio) {
        clickByActions(getRadioButton(radio));
    }

    public boolean isDisplayedResultString() {
        return resultString.isDisplayed();
    }

    public boolean isContainsTextResultString(String text) {
        return resultString.getText().contains(text);
    }

    public boolean IsEnabledRadioButton(String radio) {
        return getRadioButton(radio).isEnabled();
    }
}
