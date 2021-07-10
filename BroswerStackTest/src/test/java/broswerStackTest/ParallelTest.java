package broswerStackTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {

	public static final String AUTOMATE_USERNAME = "amirthanandhini_CcwOqJ";
	  public static final String AUTOMATE_ACCESS_KEY = "wCofK9gysfhpvgyJppff";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  WebDriver wd;
	  
	  @Parameters({"browser"})
	  @BeforeTest
	  public void setup(String browser) throws MalformedURLException{
		  if(browser.equals("iphone")){
			  DesiredCapabilities caps = new DesiredCapabilities();
			    caps.setCapability("browserName", "iPhone");
			    caps.setCapability("device", "iPhone 12");
			    caps.setCapability("realMobile", "true");
			    caps.setCapability("os_version", "14");
			    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
			    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
			    
			    wd= new RemoteWebDriver(new URL(URL), caps);
		  }
		  else if(browser.equals("mac")){
			  DesiredCapabilities caps = new DesiredCapabilities();
			    caps.setCapability("os_version", "High Sierra");
			    caps.setCapability("resolution", "1920x1080");
			    caps.setCapability("browser", "Chrome");
			    caps.setCapability("browser_version", "latest");
			    caps.setCapability("os", "OS X");
			    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
			    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
			    
			    wd= new RemoteWebDriver(new URL(URL), caps);
			  
		  }
		  else if(browser.equals("xp")){
			  DesiredCapabilities caps = new DesiredCapabilities();
			    caps.setCapability("os_version", "XP");
			    caps.setCapability("resolution", "1920x1080");
			    caps.setCapability("browser", "IE");
			    caps.setCapability("browser_version", "7.0");
			    caps.setCapability("os", "Windows");
			    caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
			    caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name
			    
			    
			    wd = new RemoteWebDriver(new URL(URL), caps);
		  }
		  
	  }
	  
	  
	  @Test
	  public void verifyParallelTest() throws MalformedURLException, InterruptedException{
		  
				    wd.get("https://www.google.com/");
				    System.out.println(wd.getTitle());
				    wd.findElement(By.name("q")).sendKeys("chennai");
				    wd.findElement(By.name("q")).submit();
				    System.out.println(wd.getTitle());
				    wd.quit();
				    
				    wd.navigate().back();
				    Thread.sleep(2000);
				    wd.navigate().forward();
				    Thread.sleep(2000);
				    wd.navigate().back();
				    Thread.sleep(2000);
				    wd.navigate().forward();
				    Thread.sleep(2000);
				    wd.navigate().back();
				    Thread.sleep(2000);
				    wd.navigate().forward();
				    Thread.sleep(2000);
				    wd.navigate().back();
				    Thread.sleep(2000);
				    wd.navigate().forward();
				    Thread.sleep(2000);
				    wd.quit();
			  

	  }
}
