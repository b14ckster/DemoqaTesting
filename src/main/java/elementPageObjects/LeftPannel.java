package elementPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(className = "left-pannel")
public class LeftPannel extends BaseElement {

    @FindBy(id = "item-0")
    private WebElement textBoxLink;
    @FindBy(id = "item-1")
    private WebElement checkBoxLink;
    @FindBy(id = "item-2")
    private WebElement radioButtonLink;
    @FindBy(id = "item-3")
    private WebElement webTablesLink;
    @FindBy(id = "item-4")
    private WebElement buttonsLink;
    @FindBy(id = "item-5")
    private WebElement linksLink;
    @FindBy(id = "item-6")
    private WebElement brokenLinksImagesLink;
    @FindBy(id = "item-7")
    private WebElement uploadAndDownloadLink;
    @FindBy(id = "item-8")
    private WebElement dynamicPropertiesLink;

    public LeftPannel(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickTextBoxLink() {
        textBoxLink.click();
    }

    public void clickCheckBoxLink() {
        checkBoxLink.click();
    }

    public void clickRadioButtonLink() {
        radioButtonLink.click();
    }

    public void clickWebTablesLink() {
        webTablesLink.click();
    }

    public void clickButtonsLink() {
        buttonsLink.click();
    }

    public void clickLinksLink() {
        linksLink.click();
    }

    public void clickBrokenLinksImagesLink() {
        brokenLinksImagesLink.click();
    }

    public void clickUploadAndDownloadLink() {
        uploadAndDownloadLink.click();
    }

    public void clickDynamicPropertiesLink() {
        dynamicPropertiesLink.click();
    }
}
