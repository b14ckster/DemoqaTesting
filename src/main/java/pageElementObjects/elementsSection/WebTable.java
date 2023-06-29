package pageElementObjects.elementsSection;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageElementObjects.BaseElement;

@FindBy(xpath = "//div[contains(@class, 'ReactTable')]")
public class WebTable extends BaseElement {

    private static final String PREVIOUS = "Previous";
    private static final String NEXT = "Next";

    private static final String FIRST_NAME = "First Name";
    private static final String LAST_NAME = "Last Name";
    private static final String AGE = "Age";
    private static final String EMAIL = "Email";
    private static final String SALARY = "Salary";
    private static final String DEPARTMENT = "Department";
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

    private WebElement getButton(String button) {
        switch (button) {
            case PREVIOUS -> {
                scrollIntoView(previousButton);
                return previousButton;
            }
            case NEXT -> {
                scrollIntoView(nextButton);
                return nextButton;
            }
        }
        return null;
    }

    private WebElement getColumnName(String columnName) {
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
        scrollIntoView(selectPageSizeOption);
        selectPageSizeOption.click();
        selectPageSizeOption.findElement(By.xpath("//option[@value='" + option + "']")).click();
    }

    public int getNumberOfRowsWithValues() {
        return rows.size() - sectionWithRows.findElements(By.className("-padRow")).size();
    }

    public void clickOnEditButtonInRow(int index) {
        getRowByIndex(index).findElement(By.cssSelector("[title='Edit']")).click();
    }

    public List<String> getValuesFromRowByIndex(int index) {
        List<WebElement> list = getRowByIndex(index).findElements(By.className("rt-td"));
        list.remove(list.size() - 1);
        List<String> list2 = new ArrayList<>();
        for (WebElement item : list) {
            list2.add(item.getText());
        }
        return list2;
    }

    protected int getNumberOfColumnByName(String columnName) {
        switch (columnName) {
            case FIRST_NAME -> {
                return 0;
            }
            case LAST_NAME -> {
                return 1;
            }
            case AGE -> {
                return 2;
            }
            case EMAIL -> {
                return 3;
            }
            case SALARY -> {
                return 4;
            }
            case DEPARTMENT -> {
                return 5;
            }
        }
        return -1;
    }

    public List<String> getListOfColumnValues(String columnName) {
        int index = getNumberOfColumnByName(columnName);
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < getNumberOfRowsWithValues(); i++) {
            resultList.add(rows.get(i).findElements(By.className("rt-td")).get(index).getText());
        }
        return resultList;
    }

    public boolean isColumnOfStringSortedInAscendingOrder(String columnName) {
        List<String> values = getListOfColumnValues(columnName);
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i).compareToIgnoreCase(values.get(i - 1)) < 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isColumnOfStringSortedInDescendingOrder(String columnName) {
        List<String> values = getListOfColumnValues(columnName);
        for (int i = 1; i < values.size(); i++) {
            if (values.get(i).compareToIgnoreCase(values.get(i - 1)) > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isColumnOfIntSortedInAscendingOrder(String columnName) {
        List<String> valuesString = getListOfColumnValues(columnName);
        List<Integer> valuesInt = new ArrayList<>();
        for (String s : valuesString) {
            valuesInt.add(Integer.parseInt(s));
        }
        for (int i = 1; i < valuesInt.size(); i++) {
            if (valuesInt.get(i) < valuesInt.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isColumnOfIntSortedInDescendingOrder(String columnName) {
        List<String> valuesString = getListOfColumnValues(columnName);
        List<Integer> valuesInt = new ArrayList<>();
        for (String s : valuesString) {
            valuesInt.add(Integer.parseInt(s));
        }
        for (int i = 1; i < valuesInt.size(); i++) {
            if (valuesInt.get(i) > valuesInt.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isRowContainsSortingValue(String sortingValue, int index) {
        List<String> row = getValuesFromRowByIndex(index);
        for (String item : row) {
            if (item.contains(sortingValue)) {
                return true;
            }
        }
        return false;
    }
}
