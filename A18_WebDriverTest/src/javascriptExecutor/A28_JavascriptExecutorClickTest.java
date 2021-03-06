package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A28_JavascriptExecutorClickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/" );
		WebElement gmail = wd.findElement(By.linkText("Gmail"));      //argument[0]
		WebElement images = wd.findElement(By.linkText("Images"));   //argument[1]
		
		JavascriptExecutor js= (JavascriptExecutor)wd;
		js.executeScript("arguments[0].click()", gmail, images);
		// js.executeScript("arguments[1].click()", gmail, images);
	
	}

}
