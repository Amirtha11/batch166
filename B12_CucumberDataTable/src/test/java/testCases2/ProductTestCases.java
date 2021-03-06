package testCases2;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductTestCases {

	WebDriver wd;
	@Given ("open Browser as {string}")
	public void openBrowser(String browser) {
	WebDriverManager.chromedriver().setup();
	wd=new ChromeDriver();
	wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    @When ("Enter url as {string}")
    public void enterUrl(String url) {
    	wd.get(url);
    }
    @When ("Enter user name as {string}")
    public void enterUserName(String userName) {
    	wd.findElement(By.name("username")).sendKeys(userName);
    	
    }
    @And ("Enter password as {string}")
    public void enterPassword(String password) {
    	wd.findElement(By.name("password")).sendKeys(password);

    }
    @When ("Click login button")
    public void clickLogin() {
    	wd.findElement(By.name("password")).submit();
    }
    @Then ("verify login sucess")
    public void verifyLoginSucess() {
    	System.out.println("verifyLoginSucess"+wd.getTitle());
    }
 
    @When ("click framework form")
    public void clickFrameForm() {
    	wd.get("http://djangovinoth.pythonanywhere.com/labhome/");
    	wd.findElement(By.id("element44")).click();
    }
    @And ("Click Simple form")
    public void clickSimpleform() {
    	wd.findElement(By.name("element45")).click();
    }
    @Then ("validate whether user can place order upto 5 times")
    public void validatePlaceProduct(DataTable table) {
    	
    	List<List<String>> data= table.asLists();
    	for (int i=0;i<data.size();i++) {
    	wd.findElement(By.id("id0")).sendKeys(data.get(i).get(0));
       	wd.findElement(By.id("id1")).sendKeys(data.get(i).get(1));
       	wd.findElement(By.id("id2")).sendKeys(data.get(i).get(2));
       	wd.findElement(By.id("id3")).sendKeys(data.get(i).get(3));
       	wd.findElement(By.id("id4")).sendKeys(data.get(i).get(4));
    	wd.findElement(By.id("id5")).sendKeys(data.get(i).get(5));
    	
    	wd.findElement(By.id("idyes")).click();
    	wd.findElement(By.id("cod")).click();
    	wd.findElement(By.id("order")).click();
    	}
    }
    @Then ("logout the user")
    public void logoutUser() {
    	wd.findElement(By.linkText("Logout")).click();
    }

    
    @Then ("validate whether user can place order upto 5 times using map")
    public void validatePlaceProductUsingMap(DataTable table) {
    	
    	List<Map<String,String>> data= table.asMaps();
    	for (int i=0;i<data.size();i++) {
    	wd.findElement(By.id("id0")).sendKeys(data.get(i).get("PRODUCT"));
       	wd.findElement(By.id("id1")).sendKeys(data.get(i).get("MOBILE"));
       	wd.findElement(By.id("id2")).sendKeys(data.get(i).get("EMAIL"));
       	wd.findElement(By.id("id3")).sendKeys(data.get(i).get("PRODCTCAT"));
       	wd.findElement(By.id("id4")).sendKeys(data.get(i).get("QTY"));
    	wd.findElement(By.id("id5")).sendKeys(data.get(i).get("PURCHASER"));
    	
    	wd.findElement(By.id("idyes")).click();
    	wd.findElement(By.id("cod")).click();
    	wd.findElement(By.id("order")).click();
    	}
    }
}