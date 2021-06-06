package testcases;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPageTest {
	
	// ^- staring , $- ending , *- data contains
	
	@Given ("open browser")
	public void openBrowser() {
		System.err.println("---- open browser----");
	}
	
	@When ("enter url")
	public void enterUrl() {
		System.err.println("---- enter url----");
	}

	@When ("click login link")
	public void clickLoginLink() {
		System.err.println("---- click login link----");
	}
	
	@And ("enter user name")
	public void enterUserName() {
		System.err.println("---- enter user name----");
	}
	
	@And ("enter password")
	public void enterPassword() {
		System.err.println("---- enter password----");
	}
	
@But ("dont click signup button")
	public void clickSignUpButton() {
	System.err.println("---- dont click signup button----");
	}

	@When ("click login button")
	public void clickLoginButton() {
		System.err.println("---- click login button----");
	}
	
	@Then ("verify user welcome page")
	public void verifyUserWelcomePage() {
		System.err.println("---- verify user welcome page----");
	}
	
	
		
}
