package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"},
		tags= "@Login",format={"pretty","html:report"},
		features="src/test/resources/Feature",
		glue={"testCases"})



public class Runner {

	@AfterClass
	public static void teardown() {

	}
}




