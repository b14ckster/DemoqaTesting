package steps;

import context.TestContext;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import pageObjects.MainPage;
import pageObjects.elementsPages.CheckBoxPage;
import pageObjects.elementsPages.ElementsPage;
import pageObjects.elementsPages.TextBoxPage;

public abstract class BaseForSteps {

    public static final String BASE_URL = "https://demoqa.com/";
    protected WebDriver driver;
    protected SoftAssertions softAssertions;
    protected MainPage mainPage;
    protected ElementsPage elementsPage;
    protected TextBoxPage textBoxPage;
    protected CheckBoxPage checkBoxPage;

    public BaseForSteps() {
        driver = TestContext.getInstance().getTestObject(TestContext.DRIVER);
        softAssertions = new SoftAssertions();

        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
    }
}
