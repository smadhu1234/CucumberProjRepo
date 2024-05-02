package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
// If you want to run specific feature file, just provide the file path in features attribute
// glue is used to link the feature files and stepdefinitions
/*
 * @CucumberOptions(features = "src/test/java/features/search.feature", glue =
 * "stepdefinitions", plugin = { "html:target/CucumberReport.html" })
 */

// It is always best way to keep the feature files under resources folder
@CucumberOptions(features = "src/test/resources/features/register.feature", 
		glue = { "stepdefinitions",
				"hooks" },
		tags = "@all and not @wip and not @ignore and not @dev",
plugin = {"html:target/CucumberReport.html" })
public class MyRunnerTest {

}
