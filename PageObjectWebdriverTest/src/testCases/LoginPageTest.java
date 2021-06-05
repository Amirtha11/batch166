package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest {

	@Test
	public void validateLogin(){
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\PageObjectTest\\browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		LoginPage.verifyLoginText(wd);
		LoginPage.enterUserName(wd);
		LoginPage.enterPassword(wd);
		LoginPage.clickLoginButton(wd);
		// LoginPage.clickSignUpNowLink(wd);
		
		
	}
}
