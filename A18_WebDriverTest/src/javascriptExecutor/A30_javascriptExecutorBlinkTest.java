package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A30_javascriptExecutorBlinkTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/" );
		WebElement logo=wd.findElement(By.xpath("/html/body/div[1]/div[2]/div/a/img"));
		
		JavascriptExecutor js= (JavascriptExecutor)wd;
		
		for(int i=0; i<10; i++){
			Thread.sleep(500);
		
		js.executeScript("arguments[0].style.border='3px solid red'", logo);
		Thread.sleep(500);
		js.executeScript("arguments[0].style.border='3px solid white'", logo);
		}
	}

}
