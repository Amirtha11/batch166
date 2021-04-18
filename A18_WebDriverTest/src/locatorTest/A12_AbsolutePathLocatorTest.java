package locatorTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A12_AbsolutePathLocatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\geckodriver.exe");
		
		WebDriver wd= new FirefoxDriver();
		wd.get("https://www.google.com/");
		WebElement searchbox =wd.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		searchbox. sendKeys("chennai");
	}

}
