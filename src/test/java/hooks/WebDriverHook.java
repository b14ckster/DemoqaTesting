package hooks;

import static context.TestContext.DRIVER;

import context.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverHook {

    private WebDriver driver;

    @Before
    public void SetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
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
