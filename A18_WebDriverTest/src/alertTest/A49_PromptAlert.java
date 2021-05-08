package alertTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.SendKeys;

import utils.LoginApp;

public class A49_PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver wd= LoginApp.loginVcentry();
		
		wd.get("http://djangovinoth.pythonanywhere.com/alert/");
		WebElement button = wd.findElement(By.id("id3"));
		button.click();
		Thread.sleep(2000);
		
		Alert a= wd.switchTo().alert();
		String data= a.getText();
		System.out.println(data);
		
		// sendKeys(char); webelement
		// Sendkeys(char); actions
		// sendkeys(String); alert
		
		a.sendKeys("Vcentry");
		a.accept();
	}

}
