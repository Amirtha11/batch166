package cookieTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A63_GetCookieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd= new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://apps.na.collabserv.com/manage/account/dashboardHandler/input");
		
		
		Set<Cookie> cookie= wd.manage().getCookies();
		Iterator<Cookie> it = cookie.iterator();
		
		//hashnext , next
		
		while(it.hasNext()){
			//System.out.println(it.next());
			Cookie mycookie= it.next();
			System.out.println(mycookie.getDomain()+"---"+mycookie.getName()+"---"+mycookie.getPath()+"---"+mycookie.getValue()+"---"+mycookie.getExpiry());
			
			
			
			
			
			
		}
		
		
		
	}

}
