package actionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A18_SliderTest {

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
		
		// Slider Action
		
		WebElement actionlink= wd.findElement(By.name("element20"));
		actionlink.click();
		WebElement slider= wd.findElement(By.name("element22"));
		slider.click();
		WebElement sliderbutton = wd.findElement(By.xpath("/html/body/main/div/div[2]/div/div[1]/div/div/span"));
		Actions a= new Actions(wd);
		a.dragAndDropBy(sliderbutton, 80, 0).build().perform(); // x-axis
		// a.dragAndDropBy(sliderbutton, 0, 80).build().perform(); // y-axis
		Thread.sleep(2000);
		a.dragAndDropBy(sliderbutton, -80, 0).build().perform(); // reverse
		
	}

}
