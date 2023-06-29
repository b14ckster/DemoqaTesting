package pageElementObjects.elementsSection;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageElementObjects.BaseElement;

@FindBy(className = "modal-dialog modal-lg")
public class RegistrationForm extends BaseElement {

    @FindBy(id = "firstName")
    private WebElement firstNameInput;
    @FindBy(id = "lastName")
    private WebElement lastNameInput;
    @FindBy(id = "userEmail")
    private WebElement emailInput;
    @FindBy(id = "age")
    private WebElement ageInput;
    @FindBy(id = "salary")
    private WebElement salaryInput;
    @FindBy(id = "department")
    private WebElement departmentInput;
    @FindBy(id = "submit")
    private WebElement submitButton;

    public RegistrationForm(WebDriver driver) {
        super(driver);
    }

    private void enterFirstName(String firstName) {
        firstNameInput.clear();
        firstNameInput.sendKeys(firstName);
    }

    private void enterLastName(String lastName) {
        lastNameInput.clear();
        lastNameInput.sendKeys(lastName);
    }

    private void enterEmail(String email) {
        emailInput.clear();
        emailInput.sendKeys(email);
    }

    private void enterAge(String age) {
        ageInput.clear();
        ageInput.sendKeys(age);
    }

    private void enterSalary(String salary) {
        salaryInput.clear();
        salaryInput.sendKeys(salary);
    }

    private void enterDepartment(String department) {
        departmentInput.clear();
        departmentInput.sendKeys(department);
    }

    private void clickOnSubmitButton() {
        submitButton.click();
    }

    public void fillRegistrationForm(List<String> values) {
        enterFirstName(values.get(0));
        enterLastName(values.get(1));
        enterAge(values.get(2));
        enterEmail(values.get(3));
        enterSalary(values.get(4));
        enterDepartment(values.get(5));
        clickOnSubmitButton();
    }
}
