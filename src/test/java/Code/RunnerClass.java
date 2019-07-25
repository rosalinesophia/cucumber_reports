package Code;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Feature", glue="",monochrome=true,plugin="json:target\\jsonreport.jason")

public class RunnerClass {

}
