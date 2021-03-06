package testCases2;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@productMap", plugin = {"pretty", 
	   	 "html:reports/report.html",
	   	 "json:reports/report.json",
	   	 "junit:reports/report.xml",

			})
public class RunnerTest {

}