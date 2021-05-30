package failedCaseTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class A25_ITestResultTest {

	@Test(priority = 1)
	public void loginTest() {
		System.out.println("----Loing Test completed----");
	}
	
    @Test(priority = 2)
	public void searchTest() {
    	int i=1/0;
		System.out.println("----Search Test completed----");
	}

    @Test(priority = 3)
	public void bookTest() throws InterruptedException {
    	Thread.sleep(3000);
		System.out.println("----Book Test completed----");
	}
	
	@Test(priority = 4)
	public void cancelTest() {
		System.out.println("----Cancel Test completed----");
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("getEndMillis   -:"+result.getEndMillis());
		System.out.println("getHost        -:"+result.getHost());
		System.out.println("getInstance    -:"+result.getInstance());
		System.out.println("getInstanceName-:"+result.getInstanceName());
		System.out.println("getName        -:"+result.getName());
		System.out.println("getStartMillis -:"+result.getStartMillis());
		System.out.println("getStatus      -:"+result.getStatus());
		System.out.println("getTestName    -:"+result.getTestName());
		System.out.println("isSuccess      -:"+result.isSuccess());
		System.out.println("getMethod      -:"+result.getMethod());
	System.out.println("----------------------------------------------------------------");	
}
	}
