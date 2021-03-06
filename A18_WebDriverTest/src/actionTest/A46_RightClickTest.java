package actionTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.LoginApp;

public class A46_RightClickTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver wd= LoginApp.loginVcentry();
		
		wd.get("http://djangovinoth.pythonanywhere.com/rightclick/");
		WebElement google= wd.findElement(By.linkText("Google"));
		
		Actions a= new Actions(wd);
				a.contextClick(google).build().perform();
				
				a.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(2000);
				a.sendKeys(Keys.ARROW_DOWN).build().perform();
				Thread.sleep(2000);
				a.sendKeys(Keys.ENTER).build().perform();
				
	}

}
