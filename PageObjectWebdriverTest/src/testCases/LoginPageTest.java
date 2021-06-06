package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest {

	@Test(dataProvider = "logindata")
	public void validateLogin(String loginText,String username, String password) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\PageObjectTest\\browser\\chromedriver.exe");
		
		WebDriver wd=new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		
		LoginPage.verifyLoginText(wd); //0
		LoginPage.enterUserName(wd);    //1 
		LoginPage.enterPassword(wd); //2
		LoginPage.clickLoginButton(wd);
		//LoginPage.clickSignUpNowLink(wd);
		
	}
	

	@DataProvider(name="logindata")
	public static Object[][] provideData() {
		Object[][] data=new Object[3][3];
		// 1st data
		data[0][0]="Log In";
		data[0][1]="Amirtha";
		data[0][2]="vcentry1";
		 
		//2nd data
		data[1][0]="Log In";
		data[1][1]="Amirtha123";
		data[1][2]="vcentry1";
		
		//3rd data
		
		data[2][0]="Log In";
		data[2][1]="Amirtha";
		data[2][2]="vcentry123";
		
		return data;
		
	}
}
