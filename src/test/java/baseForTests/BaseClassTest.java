package baseForTests;

import pageObjects.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pageObjects.elementsPages.ElementsPage;
import pageObjects.elementsPages.TextBoxPage;

public class BaseClassTest extends DataForTests {
    protected WebDriver driver;
    protected SoftAssertions softAssertions;
    protected MainPage mainPage;
    protected ElementsPage elementsPage;
    protected TextBoxPage textBoxPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        softAssertions = new SoftAssertions();

        mainPage = new MainPage(driver);
        elementsPage = new ElementsPage(driver);
        textBoxPage = new TextBoxPage(driver);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
