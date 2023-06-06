package hooks;

import static context.TestContext.DRIVER;
import static context.TestContext.getInstance;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHook {

    private WebDriver driver;

    @Before
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        getInstance().setTestObject(DRIVER, driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
        getInstance().cleanContext();
    }
}
