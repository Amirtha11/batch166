package chromeTest;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A56_ChromeInfoBarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// https://chromedriver.chromium.org/capabilities
		
		ChromeOptions options = new ChromeOptions(); // settings to change options in chrome
		// options.addArguments("--disable infobars"); // 2.0
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);
		
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver(options);
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wd.get("https://en.wikipedia.org/wiki/Chennai");
		WebElement para = wd.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/p[2]"));
		// <p> my text my text my text my text </p>
		String data= para.getText();
		System.out.println(data);
	}

}
