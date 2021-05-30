package failedCaseTest;

import org.testng.annotations.Test;

public class A24_FailedCaseOnlyRerun {

	@Test(priority = 1,groups = {"search","book","cancel"})
	public void loginTest() {
		System.out.println("----Loing Test completed----");
	}
	
    @Test(priority = 2,groups = {"search","book","cancel"})
	public void searchTest() {
    	int i=1/0;
		System.out.println("----Search Test completed----");
	}

    @Test(priority = 3,groups = {"book"})
	public void bookTest() {
		System.out.println("----Book Test completed----");
	}
	
	@Test(priority = 4,groups = {"cancel"})
	public void cancelTest() {
		System.out.println("----Cancel Test completed----");
	}
}
