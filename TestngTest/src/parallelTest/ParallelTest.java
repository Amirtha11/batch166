package parallelTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver wd;
	
	@BeforeTest
	@Parameters({"browser"})
	public void setUp(String browser) {
		if (browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\TestngTest\\browser\\chromedriver.exe");
			wd = new ChromeDriver();
			
		} 
		else if (browser.equals("firefox")) {
	
			System.setProperty("webdriver.gecko.driver", "C:\\Vcentry\\Workspace\\TestngTest\\browser\\geckodriver.exe");

			wd = new FirefoxDriver();
		}
		else if (browser.equals("ie")) {

			wd = new InternetExplorerDriver();
		}
	}

	@Test(priority=1)
	public void loginTest() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\TestngTest\\browser\\chromedriver.exe");
		
		wd.get("https://www.google.com/");
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		Thread.sleep(2000);
		wd.navigate().back();
		Thread.sleep(2000);
		wd.navigate().forward();
		
	}
}
