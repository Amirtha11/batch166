package keywordsTest;

import org.testng.annotations.Test;

public class A8_InvocationCountTest {
	
	@Test(priority=1, invocationCount=10)
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
