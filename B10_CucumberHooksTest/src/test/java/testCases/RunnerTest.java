package testCases;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( tags = "@login",
   plugin = {"pretty", 
		   	 "html:reports/report.html",
		   	 "json:reports/report.json",
		   	 "junit:reports/report.xml",

				})
public class RunnerTest {

}