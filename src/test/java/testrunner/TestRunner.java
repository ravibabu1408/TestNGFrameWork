package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(
		dryRun=false,
		monochrome=true,
				plugin = {"pretty",
				        "html:target/cucumberHtmlReport",
				        "json:target/jsonReports/cucumber-report.json"
				    }, // Plugin to generate HTML report and json report
        features = "src/test/resources/Feature",
        glue={"stepdefs"},
        tags= "@tag1"
        )
 
public class TestRunner extends AbstractTestNGCucumberTests {
	
}

	