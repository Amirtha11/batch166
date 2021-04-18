package browsertest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A2_EnterURLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\geckodriver.exe");
		
		WebDriver wd= new FirefoxDriver();
		wd.get("https://www.google.com/?gws_rd=ssl");
	}

}
