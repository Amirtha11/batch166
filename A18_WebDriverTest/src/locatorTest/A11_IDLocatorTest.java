package locatorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A11_IDLocatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\geckodriver.exe");
		
		WebDriver wd= new FirefoxDriver();
		wd.get("https://www.bing.com/");
		WebElement searchbox =wd.findElement(By.id("sb_form_q"));
		searchbox. sendKeys("chennai");
	}

}
