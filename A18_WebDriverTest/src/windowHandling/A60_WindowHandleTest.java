package windowHandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A60_WindowHandleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://book.theautomatedtester.co.uk/chapter1");
		wd.findElement(By.xpath("/html/body/div[5]")).click();
		
		//wd.getWindowHandle() - current windows - string
		//wd.getWindowHandles() - all windows  - set<String>

		Set<String> window = wd.getWindowHandles(); // LinkedHashSet - Hashset , treeset
		System.out.println(window);
		
		Iterator<String> it= window.iterator(); // HashNext - true , next - value
		String parentId= it.next();
		String childId= it.next();
		
		wd.switchTo().window(childId);
		
		Thread.sleep(2000);
		String data=wd.findElement(By.id("popuptext")).getText();
		System.out.println(data);
		wd.findElement(By.id("closepopup")).click();
		
		wd.switchTo().window(parentId); // to bring the focus back to parent window
		Thread.sleep(2000);
		wd.findElement(By.xpath("/html/body/div[11]/input")).click();
	}

}
