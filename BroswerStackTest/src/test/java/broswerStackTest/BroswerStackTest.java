package broswerStackTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BroswerStackTest {
	public static final String AUTOMATE_USERNAME = "amirthanandhini_CcwOqJ";
	  public static final String AUTOMATE_ACCESS_KEY = "wCofK9gysfhpvgyJppff";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		
		DesiredCapabilities caps = new DesiredCapabilities();
	    caps.setCapability("os_version", "XP");
	    caps.setCapability("resolution", "1920x1080");
	    caps.setCapability("browser", "IE");
	    caps.setCapability("browser_version", "7.0");
	    caps.setCapability("os", "Windows");
	    caps.setCapability("name", "mac test1"); // test name
	    caps.setCapability("build", "BStack batch number 166"); // CI/CD job or build name

	   

			    WebDriver wd=new RemoteWebDriver(new URL(URL), caps);
			    wd.get("https://www.google.com/");
			    System.out.println(wd.getTitle());
			    wd.findElement(By.name("q")).sendKeys("chennai");
			    wd.findElement(By.name("q")).submit();
			    System.out.println(wd.getTitle());
			    wd.quit();
		  

	}

}
