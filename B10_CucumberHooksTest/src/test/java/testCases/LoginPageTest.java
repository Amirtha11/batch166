package testCases;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


//StepDefninitons 

public class LoginPageTest {
	// ^ -start, $- ending, *- data contains
	
	//open browser as "firefox"
	
	//String browser="firefox"
	
	@Before(order=2)
	public void setupA(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>setupA<<<<<<<<<<<<<<<<<<<");
		System.out.println("Login internet");
	}
	
	@After(order=2)
	public void teardownA(){
		System.out.println(">>>>>>>>>>>>>>>>>teardownA<<<<<<<<<<<<<<<<<");
		System.out.println("logout internet");
	}
	
	@Before(order=1)
	public void setupB(){
		System.out.println(">>>>>>>>>>>>>>>>>>>>setupB<<<<<<<<<<<<<<<<<<<");
		System.out.println("Login internet");
	}
	
	@After(order=1)
	public void teardownB(){
		System.out.println(">>>>>>>>>>>>>>>>>teardownB<<<<<<<<<<<<<<<<<");
		System.out.println("logout internet");
	}
	
	@Given ("open browser as {string}")
	public void openBrowser(String browser) {
	
		System.err.println("----openBrowser----"+browser);
	}
	
	@When ("enter url as {string}")
	public void enterUrl(String url) {
		System.err.println("----enterUrl----"+url);

	}
	
	@When ("click login link")
	public void clickLoginLink() {
		System.err.println("----clickLoginLink----");

	}
	
	@And ("enter user name as {string}")
	public void enterUserName(String username) {
		System.err.println("----enterUserName----"+username);

	}
	
	@And ("enter password as {string}")
	public void enterPassword(String password) {
		System.err.println("----enterPassword----"+password);

	}
	
	
	@But ("dont click signup button")
	public void clickSignUpButton() {
		System.err.println("----clickSignUpButton----");

	}
	@When ("click login button")
	public void clickLoginButton() {
		System.err.println("----clickLoginButton----");

	}
	@Then ("verify user welcome page")
	public void verifyUserWelcomePage() {
		System.err.println("----verifyUserWelcomePage----");

	}
	
	
	
}