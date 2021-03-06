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
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class A22_SolutionTest2 {
	String path="C:\\Vcentry\\Workspace\\TestngTest\\screenshot\\";
	WebDriver wd;
	@Test(priority = 1)
	public void loginTest() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\TestngTest\\browser\\chromedriver.exe");
		 wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://djangovinoth.pythonanywhere.com/login/");
		WebElement username =wd.findElement(By.name("username"));
		username.sendKeys("Amirtha");
		WebElement password =wd.findElement(By.name("passwordsdwd"));
		password.sendKeys("vcentry1");
		password.submit();
	}
	
	@AfterMethod
	public void tearDown() throws IOException {
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(path+"screenshot.jpeg"));
		Reporter.log("loginTest completed");
	}
}

