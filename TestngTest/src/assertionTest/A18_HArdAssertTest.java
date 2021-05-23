package assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class A18_HArdAssertTest {

	@Test(priority=1)
	public void validateTestcase(){
		
		System.out.println(" open browser");
		System.out.println(" get title");
		
		String expected="google";
		// webdriver get title
		String actual="yahoo";
		
		Assert.assertEquals(actual, expected); // terminated when fails
		
		
		System.out.println("close browser");
		System.out.println("test case completed");
	}
	
	@Test(priority=2)
	public void booktest(){
		System.out.println("book test");
	}
	
}
