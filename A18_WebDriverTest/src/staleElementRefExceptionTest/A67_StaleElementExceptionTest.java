package staleElementRefExceptionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A67_StaleElementExceptionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		// wd.get("https://www.google.com/");
		wd.navigate().to("https://www.google.com/");
		
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("chennai");
		input.submit();
		
		Thread.sleep(2000);
		wd.navigate().back();
		input.sendKeys("guindy");
	}

}
