package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = {"src/test/resources/featuresFiles/"},
    glue = {"steps", "hooks"}
    )
public class RunAllCucumberTests extends AbstractTestNGCucumberTests {

}
