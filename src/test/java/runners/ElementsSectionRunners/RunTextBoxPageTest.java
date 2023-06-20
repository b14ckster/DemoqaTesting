package runners.ElementsSectionRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/featuresFiles/elementsSection/textBoxPageTest.feature"},
    glue = {"steps", "hooks"}
)
public class RunTextBoxPageTest extends AbstractTestNGCucumberTests {
}
