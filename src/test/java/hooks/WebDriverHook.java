package hooks;

import static context.TestContext.DRIVER;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Class for initialize Web Driver and saving for future steps
 */
public class WebDriverHook {

    private WebDriver driver;

    @Before
    public void SetUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));

        TestContext.getInstance().setTestObject(DRIVER, driver);
    }

    @After
    public void tearDown() {
        driver = TestContext.getInstance().getTestObject(DRIVER);
        if (driver != null) {
            driver.quit();
        }
        TestContext.getInstance().cleanContext();
    }
}
