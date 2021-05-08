package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.LoginApp;

public class A52_JavaScriptScrollIntoViewTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver wd= LoginApp.loginVcentry();
		
		wd.get("http://djangovinoth.pythonanywhere.com/scroll/");
		Thread.sleep(2000);
		
		WebElement link= wd.findElement(By.linkText("Click Here Pandas"));
		// scroll in to view
		
	JavascriptExecutor js=	(JavascriptExecutor)wd;
	js.executeScript("arguments[0].scrollIntoView()", link);
	}

}
