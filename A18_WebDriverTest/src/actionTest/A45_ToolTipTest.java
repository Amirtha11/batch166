package actionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.LoginApp;

public class A45_ToolTipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wd= LoginApp.loginVcentry();
		
		wd.get("http://djangovinoth.pythonanywhere.com/tooltip/");
		WebElement inputbox= wd.findElement(By.id("age"));
		String tooltip=inputbox.getAttribute("title");
		System.out.println(tooltip);
	}

}
