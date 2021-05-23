package keywordsTest;

import org.testng.annotations.Test;

public class A6_SkipTest {

	@Test(priority=-1)
	public void LoginDB(){
		System.out.println("--login DB testcase--");
	}
	
	
	@Test(priority=0)
	public void Openbrowsertest(){
		System.out.println("--open browser testcase--");
	}
	
	@Test(priority=1)
	public void Logintest(){
		System.out.println("--login testcase--");
	}
	
	@Test(priority=2, enabled=false) // by default enable will be true
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
