package keywordsTest;

import org.testng.annotations.Test;

public class A9_InvocationTimeOut {

	
	@Test(priority=1, invocationTimeOut=10000)
	public void Logintest() throws InterruptedException{
		Thread.sleep(11000);
		System.out.println("--login testcase--");
		
	}
}
// this function should get completed in 10 sec but it's taking 11 sec, 
//so the test case is failed'