package winiumTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

public class WiniumTest {
	
	
public static void main(String[] args) throws MalformedURLException, InterruptedException {
	
	DesktopOptions options = new DesktopOptions();
	options.setApplicationPath("C:\\Windows\\System32\\Calc.exe");
	WiniumDriver wd= new WiniumDriver(new URL("http://localhost:9999"),options);
	Thread.sleep(5000);
	wd.findElement(By.name("Seven")).click();
	wd.findElement(By.name("Eight")).click();
	wd.findElement(By.name("Nine")).click();
	wd.findElement(By.name("Plus")).click();
	wd.findElement(By.name("One")).click();
	wd.findElement(By.name("Two")).click();
	wd.findElement(By.name("Three")).click();
	wd.findElement(By.name("Equals")).click();
	String result = wd.findElement(By.id("CalculatorResults")).getAttribute("Name");
	System.out.println(result);
	
	
}
}
