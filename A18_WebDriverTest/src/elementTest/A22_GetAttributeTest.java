package elementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A22_GetAttributeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://www.bing.com/");
		
		WebElement searchBox= wd.findElement(By.name("q"));
		searchBox.sendKeys("Chennai");
		
		// <p>  My text </p>        - getText()
	   // <input value='my text'>  - getAttribute()
				
				//String data=searchBox.getText(); //<p>  My text </p> 
				String data=searchBox.getAttribute("value");
				System.out.println("Your input is :"+data);
		
	}

}
