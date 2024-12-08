package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import static interfaces.ITags.*;

/**
 * Run tests. Take name-tags from feature-files, or ITags/
 */
@CucumberOptions(
    features = {"src/test/resources/featuresFiles/"},
    glue = {"steps", "hooks"},
    tags = TEXT_BOX
    )
public class RunTests extends AbstractTestNGCucumberTests {

}
