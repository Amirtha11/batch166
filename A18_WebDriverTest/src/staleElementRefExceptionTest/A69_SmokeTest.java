package staleElementRefExceptionTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A69_SmokeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		List<WebElement> links= wd.findElements(By.tagName("a"));
		
		for(int i=0; i<links.size(); i++){
		String data= links.get(i).getText();
		if(!data.isEmpty()){
		//System.out.println(data);
		
		links.get(i).click();
		System.out.println(wd.getTitle());
		wd.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		}
		
		
	}
	}
	

}
