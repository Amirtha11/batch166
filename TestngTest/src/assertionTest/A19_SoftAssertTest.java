package assertionTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class A19_SoftAssertTest {
	
	@Test(priority=1)
	public void validateTestcase(){
		
		System.out.println(" open browser");
		System.out.println(" get title");
		
		String expected="google";
		// webdriver get title
		String actual="googl";
		
		SoftAssert s = new SoftAssert(); // non static
			s.assertEquals(actual, expected);
		
		System.out.println("close browser");
		System.out.println("test case completed");
		
		s.assertAll();
		
		
	}
	
	@Test(priority=2)
	public void booktest(){
		System.out.println("book test");
	}

}
