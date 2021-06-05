package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class LoginPage {
	
	
		
		// @FindBy -wd.findElement
		
		// @FindBy(how=How.NAME,using="username") - wd.findElement(By.name(name))
		
		@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div/form/fieldset/legend") 
		public   WebElement loginTextElement;
		
		@FindBy(how=How.NAME,using="username") 
		public   WebElement username;
		
		@FindBy(how=How.NAME,using="password") 
		public   WebElement password;
		
		@FindBy(how=How.XPATH,using="/html/body/main/div/div/div/div/form/div/button") 
		public   WebElement loginButton;
		
		@FindBy(how=How.LINK_TEXT,using="Sign Up Now") 
		public   WebElement signUpLink;
		
		public void verifyLoginText(String exptected) {
			String loginText=loginTextElement.getText();
			Assert.assertEquals(loginText, exptected);
		}
		public void enterUserName(String username) {
			//wd.findElement(By.name("username")).sendKeys(username);
			this.username.sendKeys(username);
		}
	public void enterPassword(String password) {
			this.password.sendKeys(password);
		}
		
		public void clickLoginButton() {
			this.loginButton.click();
		}
		
		public void clickSignUpLink() {
			this.signUpLink.click();
		}
		
		public void enterUsername(String username){
			this.username.sendKeys(username);
		}
		
		
		
		
	}


