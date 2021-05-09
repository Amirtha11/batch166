package weeklyTasks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.io.FileHandler;

public class B1_FlipkartImageTaskTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	
		
System.setProperty("webdriver.chrome.driver", "C:\\Vcentry\\Workspace\\A18_WebDriverTest\\Browser\\chromedriver.exe");
		
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		wd.findElement(By.tagName("body")).sendKeys(Keys.ESCAPE);
		
		WebElement searchbox =wd.findElement(By.name("q"));
		searchbox. sendKeys("samsung");
		searchbox.sendKeys(Keys.ENTER);
		int i=2;
		
		while(true){
		
		WebElement mobilename= wd.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[+i+]/div/div/div/a/div[2]/div[1]/div[1]"));
		WebElement mobileimage= wd.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[+i+]/div/div/div/a/div[1]/div[1]/div/div/img"));
		
		String MobileName= mobilename.getText();
		
		File src=((TakesScreenshot)mobileimage).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Vcentry\\Workspace\\A18_WebDriverTest\\screenshot\\MobileName +jpg"));
		i++;
		
	}

}
}
