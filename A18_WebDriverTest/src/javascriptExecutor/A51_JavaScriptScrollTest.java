package javascriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utils.LoginApp;

public class A51_JavaScriptScrollTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver wd= LoginApp.loginVcentry();
		
		wd.get("http://djangovinoth.pythonanywhere.com/scroll/");
		Thread.sleep(2000);
		
		//windows.scrollBy(x,y);
		// x axis - left to right
		// y axis - top to bottom
		
JavascriptExecutor js= (JavascriptExecutor)wd;
js.executeScript("window.scrollBy(0, 1500)");
Thread.sleep(2000);
js.executeScript("window.scrollBy(0, -1500)");

	}

}
