package elementTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A44_CheckBoxTest {

	public static void main(String[] args) {
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
		
		//Navigate to checkbox
		
		WebElement elementSet1_link=wd.findElement(By.id("element1"));
		elementSet1_link.click();
		WebElement checkbox_link=wd.findElement(By.id("element3"));
		checkbox_link.click();
		
		WebElement checkbox=wd.findElement(By.id("Django"));
		//checkbox.click();
		
		if(checkbox.isDisplayed()){
			System.out.println("checkbox is present");
			
		}
		if(checkbox.isEnabled()){
			System.out.println("checkbox is enabled");
		
		}
		if(checkbox.isSelected()){
			System.out.println("checkbox is already selected");
		}
		else{
			System.out.println("checkbox is not selected hence click");
			checkbox.click();
		}
	}

}
