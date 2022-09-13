package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features" ,
        glue = "steps",
        plugin = {"pretty","html:target/cucumber/cucumber.html",
                "json:target/cucumber/cucumber.json"},

        tags = "@search")
public class TestRunner {
}
