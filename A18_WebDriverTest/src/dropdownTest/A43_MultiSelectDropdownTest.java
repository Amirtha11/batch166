package dropdownTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A43_MultiSelectDropdownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
		WebElement loginlink= wd.findElement(By.linkText("Login"));
		loginlink.click();
		WebElement username= wd.findElement(By.name("username"));
		username.sendKeys("Amirtha");
		WebElement password= wd.findElement(By.name("password"));
		password.sendKeys("vcentry1");
		password.submit();
		wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
		
	// Navigate to dropdown
		
		WebElement elementSet2_link=wd.findElement(By.id("element10"));
		elementSet2_link.click();
		WebElement dropdown_link=wd.findElement(By.id("element11"));
		dropdown_link.click();
		
		WebElement days= wd.findElement(By.id("days"));
		Select s= new Select(days);
		
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByIndex(5);
		
		List<WebElement>options= s.getAllSelectedOptions();
		
		for(int i=0; i<options.size(); i++){
			String data= options.get(i).getText();
			System.out.println(data);
			
			// deselect
			
			s.deselectByIndex(1);
			Thread.sleep(2000);
			s.deselectByIndex(3);
			Thread.sleep(2000); 
			s.deselectByIndex(5);
		}
	}

}
