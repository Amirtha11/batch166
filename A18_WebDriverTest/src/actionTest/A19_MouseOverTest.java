package actionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A19_MouseOverTest {

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
		
		// mouseover action
		
		WebElement actionlink= wd.findElement(By.name("element20"));
		actionlink.click();
		WebElement mouseover= wd.findElement(By.name("element27"));
		mouseover.click();
		WebElement resume= wd.findElement(By.id("id11"));
		WebElement item= wd.findElement(By.id("id13"));
		WebElement havoc= wd.findElement(By.id("id17"));
		Actions a= new Actions(wd);
		a.moveToElement(resume).build().perform();
		Thread.sleep(2000);
		a.moveToElement(item).build().perform();
		Thread.sleep(2000);
		a.moveToElement(havoc).build().perform();
		a.click(havoc).build().perform();
	}

}
