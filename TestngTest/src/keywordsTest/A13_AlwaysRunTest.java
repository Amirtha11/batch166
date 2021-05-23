package keywordsTest;

import org.testng.annotations.Test;

public class A13_AlwaysRunTest {

	@Test(priority = 1)
	public void loginTest() {
		System.out.println("--login test case--");
	}

	@Test(priority = 2, dependsOnMethods= "loginTest")
	public void searchTest() {
		int i=1/0;
		System.out.println("--search testy case--");
	}
	
    @Test(priority = 3, dependsOnMethods="searchTest", alwaysRun= true)
	public void bookingTest() {
		System.out.println("--booking test case--");
	}
    
	@Test(priority = 4, dependsOnMethods="bookingTest")
	public void cancelTest() {
		System.out.println("--cancel test case--");
	}
}
