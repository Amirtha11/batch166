package chromeTest;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class A58_MobileUserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> mobileEmulation = new HashMap<String, String>();
        mobileEmulation.put("deviceName", "Nexus 5");

		ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
        
		WebDriver wd = new ChromeDriver(chromeOptions);
        wd.manage().window().maximize();
		
		wd.get("https://www.google.com/");
		System.out.println(wd.getTitle());
		
		wd.findElement(By.name("q")).sendKeys("chennai");
		wd.findElement(By.name("q")).submit();
		System.out.println(wd.getTitle());
	}

}
