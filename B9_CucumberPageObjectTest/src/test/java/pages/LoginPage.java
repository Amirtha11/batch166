package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public static void clickLoginLink( WebDriver wd){
		wd.findElement(By.linkText("Login")).click();
		
	}
	
 public static void enterUsername(WebDriver wd , String username){
	 wd.findElement(By.name("username")).sendKeys(username);
 }
 
 public static void enterPassword(WebDriver wd, String password){
	 wd.findElement(By.name("password")).sendKeys(password);
	 
 }
 
 public static void clickLoginbutton(WebDriver wd){
	 wd.findElement(By.name("password")).submit();
 }
 
 public static void clickSignUpLink(WebDriver wd){
	 
	 
 }
 
}
