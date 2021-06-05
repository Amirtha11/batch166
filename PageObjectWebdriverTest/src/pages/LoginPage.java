package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage {
	
	public static void verifyLoginText(WebDriver wd) {
		String loginText=wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/legend")).getText();
		Assert.assertEquals(loginText, "Log In");
	}

	public static void enterUserName(WebDriver wd) {
		wd.findElement(By.name("username")).sendKeys("Amirtha");
	}
public static void enterPassword(WebDriver wd) {
		wd.findElement(By.name("password")).sendKeys("vcentry1");
	}

	public static void clickLoginButton(WebDriver wd) {
		wd.findElement(By.xpath("/html/body/main/div/div/div/div/form/div/button")).click();
	}
public static void clickSignUpNowLink(WebDriver wd) {
		wd.findElement(By.linkText("Sign Up Now")).click();
	}
	
	
}
