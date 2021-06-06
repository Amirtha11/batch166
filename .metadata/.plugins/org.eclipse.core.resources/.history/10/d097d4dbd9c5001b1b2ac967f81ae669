package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPageTest {

	@Test
	public void verifyLoginTest(){
		System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\PageObjectTest\\browser\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		
		LoginPage loginPage= PageFactory.initElements(wd, LoginPage.class);
		loginPage.verifyLoginText("Log In");
		loginPage.enterUserName("Amirtha");
		loginPage.enterPassword("vcentry1");
		loginPage.clickLoginButton();
		//loginPage.clickSignUpLink();
	}
}
