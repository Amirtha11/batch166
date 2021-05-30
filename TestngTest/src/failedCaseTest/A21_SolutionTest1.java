package failedCaseTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class A21_SolutionTest1 {
	WebDriver wd;
     String path="C:\\Vcentry\\Workspace\\TestngTest\\screenshot\\";
	
	//String path="./";

	@Test(priority = 1)
	
	public void loginTest() throws IOException {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\TestngTest\\browser\\chromedriver.exe");

		 wd=new ChromeDriver();
			wd.manage().window().maximize();
			wd.get("http://djangovinoth.pythonanywhere.com/login/");
			WebElement username =wd.findElement(By.name("username"));
			username.sendKeys("Amirtha");
			WebElement password =wd.findElement(By.name("passwordfsdfewgf"));
			password.sendKeys("vcentry1");
			password.submit();
			//pass
			File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(path+"pass.jpeg"));
			}
		catch(Exception e) {
		//failed	
			File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(path+"fail.jpeg"));	
		}
	}
}
