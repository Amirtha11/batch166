package annotationTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class A17_BeforeAfterTestTest {
	
	@BeforeTest
	public void loginnetwork(){
		System.err.println("--login network--");
	}
	
	@AfterTest
	public void logoutnetwork(){
		System.err.println("--logout network--");
	}

	@BeforeClass
	public void loginDB(){
		System.out.println("--logon DB--");
	}
	
	@AfterClass
	public void logoutDB(){
		System.out.println("--logout DB--");
		
	}
	
	@BeforeMethod
	public void openbrowsertest(){
		System.err.println("--open browser test");
	}
	 //err - to change colour
	
	@AfterMethod
	public void closebrowsertest(){
		System.err.println("--close browser test");
	}
	
	
	@Test(priority=1)
	public void Logintest(){
		System.out.println("--login testcase--");
	}
	
	@Test(priority=2)
public void Searchtest(){
		System.out.println("--search testcase--");
	}

	@Test(priority=3)
public void Bookingtest(){
	System.out.println("--booking testcase--");
}

	@Test(priority=4)
public void Canceltest (){
	System.out.println("cancel testcase--");
}
}
