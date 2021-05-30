package failedCaseTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class A23_FailedCaseOnlyScreenshotTest {
	String path="C:\\Vcentry\\Workspace\\TestngTest\\screenshot\\";
	WebDriver wd;
	@Test(priority = 1)
	public void loginTest() {
		 wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		WebElement username =wd.findElement(By.name("username"));
		username.sendKeys("Amirtha");
		WebElement password =wd.findElement(By.name("passwordkkjjhgg"));
		password.sendKeys("vcentry1");
		password.submit();
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		
		if(!result.isSuccess()) {
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(path+"screenshot.jpeg"));
		} 
		
		else {
			System.out.println("Your test is passed, so we didnt take screenshot");
		}

	}
}
