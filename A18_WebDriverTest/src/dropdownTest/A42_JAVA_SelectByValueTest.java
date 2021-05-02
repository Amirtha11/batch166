package dropdownTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A42_JAVA_SelectByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
		WebElement month = wd.findElement(By.id("month"));
		
		List<WebElement> options = month.findElements(By.tagName("option"));
		
		for(int i=0; i<options.size(); i++){
			String data = options.get(i).getAttribute("value");
			if(data.equals("07")){
				options.get(i).click();
			}
		}
	}

}
