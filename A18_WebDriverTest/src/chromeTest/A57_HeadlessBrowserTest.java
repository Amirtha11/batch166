package chromeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A57_HeadlessBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// headless browser - HTMLUnitDriver h=new HTMLUnitDriver();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); //2.0 and 3.0
		options.addArguments("--disable-gpu");
		
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver(options);
		wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		System.out.println(wd.getTitle());
		
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		System.out.println(wd.getTitle());
	}

}
