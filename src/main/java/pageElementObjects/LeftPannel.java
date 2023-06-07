package pageElementObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@FindBy(className = "left-pannel")
public class LeftPannel extends BaseElement {

    public static final String TEXT_BOX = "Text Box";
    public static final String CHECK_BOX = "Check Box";
    public static final String RADIO_BUTTON = "Radio Button";
    public static final String WEB_TABLES = "Web Tables";
    public static final String BUTTONS = "Buttons";
    public static final String LINKS = "Links";
    public static final String BROKEN_LINKS_IMAGES = "Broken Links - Images";
    public static final String UPLOAD_AND_DOWNLOAD = "Upload and Download";
    public static final String DYNAMIC_PROPERTIES = "Dynamic Properties";

    @FindBy(id = "item-0")
    private WebElement textBoxItem;
    @FindBy(id = "item-1")
    private WebElement checkBoxItem;
    @FindBy(id = "item-2")
    private WebElement radioButtonItem;
    @FindBy(id = "item-3")
    private WebElement webTablesItem;
    @FindBy(id = "item-4")
    private WebElement buttonsItem;
    @FindBy(id = "item-5")
    private WebElement linksItem;
    @FindBy(id = "item-6")
    private WebElement brokenLinksImagesItem;
    @FindBy(id = "item-7")
    private WebElement uploadAndDownloadItem;
    @FindBy(id = "item-8")
    private WebElement dynamicPropertiesItem;

    public LeftPannel(WebDriver driver) {
        super(driver);
    }

    public void clickOnItem(String item) {
        switch (item) {
            case TEXT_BOX -> textBoxItem.click();
            case CHECK_BOX -> checkBoxItem.click();
            case RADIO_BUTTON -> radioButtonItem.click();
            case WEB_TABLES -> webTablesItem.click();
            case BUTTONS -> buttonsItem.click();
            case LINKS -> linksItem.click();
            case BROKEN_LINKS_IMAGES -> brokenLinksImagesItem.click();
            case UPLOAD_AND_DOWNLOAD -> uploadAndDownloadItem.click();
            case DYNAMIC_PROPERTIES -> dynamicPropertiesItem.click();
        }
    }
}
