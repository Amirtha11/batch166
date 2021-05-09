package weeklyTasks;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
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
		
		WebElement username= wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		username.sendKeys("8939183005");
		WebElement password= wd.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input"));
		password.sendKeys("Moni@1994");
		password.submit();
		
		WebElement searchbox = wd.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		searchbox.sendKeys("Samsung");
		searchbox.submit();
		
		Thread.sleep(2000);
		
		WebElement image1= wd.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[1]/div[1]/div/div/img"));
		
		File src1=((TakesScreenshot)image1).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("C:\\Vcentry\\Workspace\\A18_WebDriverTest\\screenshot\\Samsung Guru 1200.jpg"));
		
WebElement image2= wd.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[3]/div/div/div/a/div[1]/div[1]/div/div/img"));
		
		File src2=((TakesScreenshot)image2).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src2, new File("C:\\Vcentry\\Workspace\\A18_WebDriverTest\\screenshot\\Samsung Guru 1200.jpg"));
		
WebElement image3= wd.findElement(By.xpath("/html/body/div/div/div[3]/div[1]/div[2]/div[4]/div/div/div/a/div[1]/div[1]/div/div/img"));
		
		File src3=((TakesScreenshot)image3).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src3, new File("C:\\Vcentry\\Workspace\\A18_WebDriverTest\\screenshot\\SAMSUNG Galaxy F12 (Sea Green, 64 GB).jpg"));
		
		
		
	}

}
