package elementTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A68_GetAllLinksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		List<WebElement> links= wd.findElements(By.tagName("a"));
		
		for(int i=0; i<links.size(); i++){
		String data= links.get(i).getText();
		if(!data.isEmpty()){
		System.out.println(data);
		}
		
		
	}
	}
}
