package annotationTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class A15_BeforeAfterMethodTest {

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
