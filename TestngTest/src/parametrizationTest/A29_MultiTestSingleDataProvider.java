package parametrizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class A29_MultiTestSingleDataProvider {

	String browser;
	String url; 
	String username;
	String password;
	String ticket1;
	String ticket2;
	
	
	@Factory(dataProvider = "logindata")
	A29_MultiTestSingleDataProvider(String browser,String url, String username,String password,String ticket1,String ticket2){
		this.browser=browser;
		this.url=url;
		this.username=username;
		this.password=password;
		this.ticket1=ticket1;
		this.ticket2=ticket2;
	}
@Test(priority = 1 )
	public void loginTest() {
		System.out.println("Open browser         :"+browser); //0
		System.out.println("Enter Url            :"+url); //1
		System.out.println("Enter user name      :"+username); //2
		System.out.println("Enter password       :"+password); //3
		System.out.println("Click Login Button");
	}
	
	@Test(priority = 2 )
	public void bookingTest() {
		
		System.out.println("Enter ticket1  :"+ticket1); //4
		System.out.println("Enter ticket2  :"+ticket2); //5
	}
	
@DataProvider(name = "logindata")
	public static  Object [][] provideLoginData() {
		
		Object [][] data=new Object[3][6];
		//first data set
		data[0][0]="firefox"; // browser
		data[0][1]="test url a"; // url
		data[0][2]="username a"; //username
		data[0][3]="password a"; //password
		data[0][4]="bus ticket1"; //ticket1
		data[0][5]="bus ticket2"; //ticket2
		
        //second data set
		data[1][0]="chrome";
		data[1][1]="test url b";
		data[1][2]="username b";
		data[1][3]="password b";
		data[1][4]="train ticket1"; //ticket1
		data[1][5]="train ticket2"; //ticket2
		
		//thrid data set
		data[2][0]="safari";
		data[2][1]="test url c";
		data[2][2]="username c";
		data[2][3]="password c";
		data[2][4]="air ticket1"; //ticket1
		data[2][5]="air ticket2"; //ticket2
		return data;
	}
}