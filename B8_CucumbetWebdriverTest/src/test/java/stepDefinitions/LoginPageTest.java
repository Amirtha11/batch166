package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


//StepDefninitons 

public class LoginPageTest {
WebDriver wd;
	
	//String browser="firefox"
	@Given ("open browser as {string}")
	public void openBrowser(String browser) {
	
	  WebDriverManager.chromedriver().setup();
	  wd=new ChromeDriver();
	  wd.manage().window().maximize();
	  wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}

	@When ("enter url as {string}")
	public void enterUrl(String url) {
		
		wd.get(url);

	}
@When ("click login link")
	public void clickLoginLink() {
		wd.findElement(By.linkText("Login")).click();

	}
	
	@And ("enter user name as {string}")
	public void enterUserName(String username) {
		wd.findElement(By.name("username")).sendKeys(username);
		

	}
@And ("enter password as {string}")
	public void enterPassword(String password) {
wd.findElement(By.name("password")).sendKeys(password);
	}
	
	
	@But ("dont click signup button")
	public void clickSignUpButton() {
		System.err.println("----clickSignUpButton----");

	}
@When ("click login button")
	public void clickLoginButton() {
		wd.findElement(By.name("password")).submit();
	}
	@Then ("verify user welcome page")
	public void verifyUserWelcomePage() {
		System.err.println("----verifyUserWelcomePage----");

	}
	
	
}