package browsertest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A24_BrowserPositionTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bobcat.com/index");
		
		Thread.sleep(2000);
		
		
		Dimension dimension= new Dimension(300, 800);
	wd.manage().window().setSize(dimension);
	
	Thread.sleep(2000);
	
	Point point= new Point(800, 0);
	wd.manage().window().setPosition(point);
	
	}

}
