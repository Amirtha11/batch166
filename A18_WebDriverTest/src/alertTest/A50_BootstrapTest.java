package alertTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.LoginApp;

public class A50_BootstrapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver wd= LoginApp.loginVcentry();
		
		wd.get("http://djangovinoth.pythonanywhere.com/bootstrapalert/no/");
		
		wd.findElement(By.id("info")).click();
		String data= wd.findElement(By.xpath("/html/body/main/div/div[2]/div")).getText();
		System.out.println(data);
	}

}
