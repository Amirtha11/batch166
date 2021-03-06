package sikuliTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SikuliTest {

	public static void main(String[] args) throws FindFailed {
		
		Screen s= new Screen();
		Pattern gmail = new Pattern("C:\\Vcentry\\Workspace\\SikuliTest\\Locator\\gmail.PNG");
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver wd= new ChromeDriver();
		
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		
		s.wait(gmail,10);
		s.click(gmail);
		
		
	}
}
