package testOptions;

import io.cucumber.testng.*;

@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
