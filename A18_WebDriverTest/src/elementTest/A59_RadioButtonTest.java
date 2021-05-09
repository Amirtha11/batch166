package elementTest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.seleniumhq.jetty9.util.component.Container.Listener;

import utils.LoginApp;

public class A59_RadioButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver wd= LoginApp.loginVcentry();
		wd.get("http://djangovinoth.pythonanywhere.com/radiobutton/");
		
		List<WebElement> radio= wd.findElements(By.name("technology2"));
		
		for(int i=0; i<radio.size(); i++){
			String data= radio.get(i).getAttribute("value");
			System.out.println(data);
			
			if(data.equals("Flask")){
				radio.get(i).click();
			}
			
		}
	}

}
