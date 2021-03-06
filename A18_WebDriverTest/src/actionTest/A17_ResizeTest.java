package actionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A17_ResizeTest {

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
		
		//resize element test
		
		WebElement actionlink= wd.findElement(By.name("element20"));
		actionlink.click();
		WebElement resizelink= wd.findElement(By.name("element21"));
		resizelink.click();
		WebElement resize = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div/div[3]"));
		Actions a= new Actions(wd);
		a.clickAndHold(resize).build().perform();
		a.moveToElement(resize, 150, 150).build().perform();
		a.release(resize).build().perform();;
		
	}

}
