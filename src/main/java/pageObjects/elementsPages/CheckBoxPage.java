package pageObjects.elementsPages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends ElementsPage {

    public static final String EXPAND_ALL = "Expand all";
    public static final String COLLAPSE_ALL = "Collapse all";

    @FindBy(className = "rct-option-expand-all")
    private WebElement expandAllButton;
    @FindBy(className = "rct-option-collapse-all")
    private WebElement collapseAllButton;
    @FindBy(id = "result")
    private WebElement resultString;
    @FindBy(className = "rct-title")
    private List<WebElement> listCheckBoxes;

    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public boolean isDisplayedResultString() {
        scrollIntoView(resultString);
        return resultString.isDisplayed();
    }

    public void clickOnButton(String button) {
        switch (button) {
            case EXPAND_ALL -> expandAllButton.click();
            case COLLAPSE_ALL -> collapseAllButton.click();
        }
    }

    public WebElement getCheckBox(String checkBox) {
        for (WebElement checkBoxItem : listCheckBoxes) {
            if (checkBoxItem.getText().contains(checkBox)) {
                return checkBoxItem;
            }
        }
        return null;
    }

    public void clickOnCheckBox(String checkBox) {
        scrollIntoView(getCheckBox(checkBox));
        getCheckBox(checkBox).click();
    }

    public boolean isContainItemResultString(String item) {
        return resultString.getText().contains(item);
    }

    public boolean checkIsSelectedCheckBox(String checkBox) {
        scrollIntoView(getCheckBox(checkBox));
        return getCheckBox(checkBox).isSelected();
    }
}
