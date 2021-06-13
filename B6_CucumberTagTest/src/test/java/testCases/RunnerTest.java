package testCases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( tags = "@smokeTest",
   plugin = {"pretty", 
		   	 "html:reports/report.html",
		   	 "json:reports/report.json",
		   	 "junit:reports/report.xml",

				})
public class RunnerTest {

}

// if you want to run all scenarios use feature tag
//if you want to run spefic  scenarios use scenario tag
//if you want to grop of scenarios use same tag in multiple scenario