package step_defenitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/login.feature", glue = {"step_defenitions"}, plugin = { "pretty",
        "html:target/cucumber-reports" })
public class CucumberTestRunner {

   
}
