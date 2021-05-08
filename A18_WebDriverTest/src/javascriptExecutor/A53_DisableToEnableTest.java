package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.LoginApp;

public class A53_DisableToEnableTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver wd= LoginApp.loginVcentry();
		
		wd.get("http://djangovinoth.pythonanywhere.com/enabledOrDisabled/");
		WebElement disabledElement= wd.findElement(By.id("dis"));
		//removeAttribute('disabled') - disabled
		JavascriptExecutor js=(JavascriptExecutor)wd;
		js.executeScript("arguments[0].removeAttribute('disabled')", disabledElement);	
	}

}
