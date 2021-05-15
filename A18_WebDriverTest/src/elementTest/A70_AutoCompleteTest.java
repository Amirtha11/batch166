package elementTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.LoginApp;

public class A70_AutoCompleteTest {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver wd= LoginApp.loginVcentry();
		
		wd.get("http://djangovinoth.pythonanywhere.com/autocomplete/");
		wd.findElement(By.id("tags1")).sendKeys("a");
		Thread.sleep(2000);
		
		String start="/html/body/ul[3]/li[";
		String end="]/div";
int i=1;
		while (true) {
			try {
			String fullXpath=start+i+end;
			String data=wd.findElement(By.xpath(fullXpath)).getText();
			System.out.println(data);
			i++;
			} catch (Exception e) {
				// TODO: handle exception
				break;
			}
		}
	}
}
