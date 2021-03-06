package screenshotTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class A25_ScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		// interfaces == webdriver, takescreenshot , outputType
		
		File src= ((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src, new File("C:\\Vcentry\\Workspace\\A18_WebDriverTest\\screenshot\\bing..JPG"));
		
	}

}
