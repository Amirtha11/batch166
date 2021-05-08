package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.LoginApp;

public class A54_EnableToDisableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver wd= LoginApp.loginVcentry();
		
		wd.get("http://djangovinoth.pythonanywhere.com/enabledOrDisabled/");
		WebElement enableElement= wd.findElement(By.id("lastname"));
		// setAttribute('disabled', 'true')
		//setAttribute('id', 'Myid')
		JavascriptExecutor js=(JavascriptExecutor)wd;
		js.executeScript("arguments[0].setAttribute('disabled', 'true')", enableElement);
	}

}
