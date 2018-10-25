package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"},
        format = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"}
        )
public class TestRunner {
}
