package keywordsTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A12_ReportLogTest {

	@Test(priority=1)
	public void Logintest(){
		// System.out.println("--login testcase--");
		Reporter.log("--login testcase--");
		
	}
	
	@Test(priority=2)
public void Searchtest(){
		//System.out.println("--search product testcase--");
		Reporter.log("--search product testcase--");
	}


	@Test(priority=3)
public void Bookingtest(){
	//System.out.println("--booking testcase--");
		Reporter.log("--booking testcase--");
}

	@Test(priority=4)
public void Canceltest (){
	// System.out.println("--cancel testcase--");
		Reporter.log("--cancel testcase--");
}
}
