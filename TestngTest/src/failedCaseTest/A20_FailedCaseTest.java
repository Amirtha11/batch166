package failedCaseTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class A20_FailedCaseTest {
	
		@Test(priority = 1)
		public void loginTest() throws IOException {

			System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\TestngTest\\browser\\chromedriver.exe");
			WebDriver wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://djangovinoth.pythonanywhere.com/login/");
			WebElement username =wd.findElement(By.name("username"));
			username.sendKeys("Amirtha");
			WebElement password =wd.findElement(By.name("passwordkkjhkhkj"));
			password.sendKeys("vcentry1");
			password.submit();
		
		}

}