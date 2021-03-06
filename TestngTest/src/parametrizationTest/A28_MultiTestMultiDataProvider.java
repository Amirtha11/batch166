package parametrizationTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class A28_MultiTestMultiDataProvider {

	@Test(dataProvider= "logindata")
	public void LoginTest(String browser, String url, String username, String password){
		System.out.println("Open browser        :"+ browser);  //0
		System.out.println("Enter url           :"+ url);  //1
		System.out.println("Enter user name     :"+ username );  //2
		System.out.println("Enter password      :"+ password);  //3
		System.out.println("Click login button");
	}
	
	@Test(dataProvider="bookingdata")
	public void BookingTest(String ticket1, String ticket2 ){
		System.out.println("Enter ticket1        :"+ ticket1);  //0
		System.out.println("Enter ticket2          :"+ ticket2);  //1
		System.out.println("Click submit button");  //2
		
	}
	
	@DataProvider(name="bookingdata")
	public static Object [][] provideBookingData(){
		Object [][] data = new Object[3][2];
		data[0][0]="bus ticket 1";
		data[0][1]="bus ticket 2";
		
		data[1][0]="train ticket 1";
		data[1][1]="train ticket 2";
		
		data[2][0]="flight ticket 1";
		data[2][1]="flight ticket 2";
		
		return data;
		
		
	}
	
	@DataProvider(name= "logindata")
	public static Object [][] provideloginData(){
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
