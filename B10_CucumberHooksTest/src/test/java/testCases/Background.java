package testCases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Background {

	@Given ("establish DB connection")
	public void establishDBConnection() {
		System.err.println("---establish DB connection---");
	}
	
	@When ("enter DB user name")
	public void enterDBUserName() {
		System.err.println("---enter DB user name---");
	}
	@When ("enter DB password")
	public void enterDBPassword() {
		System.err.println("---enter DB password---");
	}
	@And ("Click DB login")
	public void clickDBLogin() {
		System.err.println("---Click DB login---");
	}
	
}