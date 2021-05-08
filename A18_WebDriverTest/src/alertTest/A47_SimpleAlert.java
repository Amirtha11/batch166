package alertTest;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.LoginApp;

public class A47_SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver wd= LoginApp.loginVcentry();
		
		wd.get("http://djangovinoth.pythonanywhere.com/alert/");
		WebElement button = wd.findElement(By.id("id1"));
		button.click();
		
		Thread.sleep(2000);
		//switchto - alert, frame, windows
		
		Alert a= wd.switchTo().alert();
		
		String msg= a.getText();
		System.out.println(msg);
		a.accept(); // click ok button
		
	}

}
