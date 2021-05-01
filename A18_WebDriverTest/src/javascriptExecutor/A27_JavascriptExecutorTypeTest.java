package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A27_JavascriptExecutorTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/" );
		WebElement searchBox= wd.findElement(By.name("q"));
		// searchBox.sendKeys("chennai); 10- 1 time fail
		
		//interface== WebDriver, WebElement, JavascriptExecutor, TakesScreenshot
		
				//((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
				//((JavascriptExecutor)wd).executeScript("", "")
		
		JavascriptExecutor js = (JavascriptExecutor)wd;
		
		//js.executeScript("javascript", "e1","e2","e3");
		                     // "js",0,1,2
		
		js.executeScript("arguments[0].value='chennai'", searchBox);
		
	}

}
