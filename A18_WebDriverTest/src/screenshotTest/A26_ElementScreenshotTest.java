package screenshotTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class A26_ElementScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
     WebElement logo=wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/a/img"));
		
		File src=((TakesScreenshot)logo).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Vcentry\\Workspace\\A18_WebDriverTest\\screenshot\\logo3.JPG"));
	}

}
