package actionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class A16_DragAndDropTest {

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
		//dragandDrop
		WebElement actionlink= wd.findElement(By.name("element20"));
		actionlink.click();
		WebElement draganddroplink= wd.findElement(By.name("element25"));
		draganddroplink.click();
		
	WebElement source=	wd.findElement(By.id("draggable"));
	WebElement target=	wd.findElement(By.id("droppable"));
	Actions a= new Actions(wd);
	//a.dragAndDrop(source, target);  not executed properly
	// a.dragAndDrop(source, target).build().perform(); works perfectly
	// a.dragAndDrop(source, target).perform();
	
	/* a.clickAndHold(source).perform();
	   a.moveToElement(target).perform();
	   a.release(source).perform(); */
	
	a.clickAndHold(source).moveToElement(target).release().build().perform();
	
	
		
	}

}
