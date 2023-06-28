package pageElementObjects.elementsSection;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageElementObjects.BaseElement;

@FindBy(xpath = "//div[contains(@class, 'ReactTable')]")
public class WebTable extends BaseElement {

    public static final String PREVIOUS = "Previous";
    public static final String NEXT = "Next";
    @FindBy(className = "-previous")
    private WebElement previousButton;
    @FindBy(className = "-next")
    private WebElement nextButton;
    @FindBy(className = "rt-th")
    private List<WebElement> headerWebTable;
    @FindBy(className = "rt-tr-group")
    private List<WebElement> rows;
    @FindBy(className = "rt-tbody")
    private WebElement sectionWithRows;
    @FindBy(className = "-pageSizeOptions")
    private WebElement selectPageSizeOption;

    public WebTable(WebDriver driver) {
        super(driver);
    }

    protected WebElement getButton(String button) {
        switch (button) {
            case PREVIOUS -> {
                return previousButton;
            }
            case NEXT -> {
                return nextButton;
            }
        }
        return null;
    }

    protected WebElement getColumnName(String columnName) {
        for (WebElement column : headerWebTable) {
            if (column.getText().contains(columnName)) {
                return column;
            }
        }
        return null;
    }

    public boolean isEnabledButton(String button) {
        return getButton(button).isEnabled();
    }

    public void clickOnButton(String button) {
        getButton(button).click();
    }

    public void clickOnColumnName(String columnName) {
        getColumnName(columnName).click();
    }

    protected WebElement getRowByIndex(int index) {
        return rows.get(--index);
    }

    public void deleteRowByIndex(int index) {
        getRowByIndex(index).findElement(By.cssSelector("[title='Delete']")).click();
    }

    public void selectPageSizeOption(int option) {
        selectPageSizeOption.click();
        selectPageSizeOption.findElement(By.xpath("//option[@value='" + option + "']")).click();
    }

    public int getNumberOfRowsWithValues() {
        return rows.size() - sectionWithRows.findElements(By.className("-padRow")).size();
    }

    public void clickOnEditButtonInRow(int index) {
        getRowByIndex(index).findElement(By.cssSelector("[title='Edit']")).click();
    }
}
