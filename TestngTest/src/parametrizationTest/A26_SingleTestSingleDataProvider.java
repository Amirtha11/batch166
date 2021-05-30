package parametrizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A26_SingleTestSingleDataProvider {

	@Test(dataProvider= "logindata")
	public void LoginTest(String browser, String url, String username, String password){
		System.out.println("Open browser        :"+ browser);  //0
		System.out.println("Enter url           :"+ url);  //1
		System.out.println("Enter user name     :"+ username );  //2
		System.out.println("Enter password      :"+ password);  //3
		System.out.println("Click login button");
	}
	
	@DataProvider(name= "logindata")
	public static Object [][] provideData(){
		// Object[][], Object[], Iterator<Object[]>
		//dataset data
		// 3   4
		// Object [row] [column]
		
		Object [][] data = new Object [3][4];
		//first data set
		data[0][0]="firefox";
		data[0][1]="test url a";
		data[0][2]="username a";
		data[0][3]="password a";
		
		// second data set
		data[1][0]="chrome";
		data[1][1]="test url b";
		data[1][2]="username b";
		data[1][3]="password b";
		
		// third data set
		data[2][0]="safari";
		data[2][1]="test url c";
		data[2][2]="username c";
		data[2][3]="password c";
		return data;
		
	}
}
