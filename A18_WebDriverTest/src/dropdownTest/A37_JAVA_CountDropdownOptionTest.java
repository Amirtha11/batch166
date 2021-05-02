package dropdownTest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A37_JAVA_CountDropdownOptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.tamildailycalendar.com/tamil_daily_calendar.php");
		WebElement month = wd.findElement(By.id("month"));
		
		/*
		 * Select s= new Select(month);
		java.util.List<WebElement> options=s.getOptions();
		System.out.println("Total options count is : "+options.size());
		 */
		
		List<WebElement> options = month.findElements(By.tagName("option"));
		System.out.println("Total options count is : "+options.size());
	}

}
