package parametrizationTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A27_SingleTestSingleDataProvider {

	@Test(dataProvider= "logindata")
	public void LoginTest(String browser, String url, String username, String password){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\TestngTest\\browser\\chromedriver.exe");
		WebDriver wd= new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get (url);
		wd. findElement(By.name("username")).sendKeys(username);
		wd.findElement(By.name("password")).sendKeys(password);
		wd.findElement(By.name("password")).submit();
	}
	
	@DataProvider(name= "logindata")
	public static Object [][] provideData(){
		// Object[][], Object[], Iterator<Object[]>
		//dataset data
		// 3   4
		// Object [row] [column]
		
		Object [][] data = new Object [3][4];
		//first data set
		data[0][0]="chrome";
		data[0][1]="http://djangovinoth.pythonanywhere.com/login/"; //URL
		data[0][2]="Amirtha";                                       //username
		data[0][3]="vcentry1";                                       //password
		
		// second data set
		data[1][0]="chrome";
		data[1][1]="http://djangovinoth.pythonanywhere.com/login/";
		data[1][2]="username b";
		data[1][3]="passsss";
		
		// third data set
		data[2][0]="chrome";
		data[2][1]="http://djangovinoth.pythonanywhere.com/login/";
		data[2][2]="uswercf";
		data[2][3]="vcentry1";
		return data;
		
	}
}
