package com.vcentry.lab.initializer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 
 * 
 * this is used for initialize env, locator, webdriver, excel,reports
 */




public class Initializer {
	
	public static void initialize() throws IOException{
		
		
		
		Properties envProp = new Properties();
		envProp.load(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"lab"+File.separator+"config"+File.separator+"env.properties")));
		
		Properties locatorprop = new Properties();
		locatorprop.load(new FileInputStream(new File(System.getProperty("user.dir")+File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"com"+File.separator+"vcentry"+File.separator+"lab"+File.separator+"config"+File.separator+"locator.properties")));

		if(envProp.getProperty("BROWSER").equals("chrome")){
			WebDriverManager.chromedriver().setup();
			wd=new ChromeDriver();
			
		}else if(envProp.getProperty("BROWSER").equals("firefox")){
			WebDriverManager.firefoxdriver().setup();
			wd=new FirefoxDriver();
			
		}else if(envProp.getProperty("BROWSER").equals("safari")){
			
		}else if(envProp.getProperty("BROWSER").equals("IE")){
			WebDriverManager.iedriver().setup();
			wd=new InternetExplorerDriver();
			
		}
	}

}
