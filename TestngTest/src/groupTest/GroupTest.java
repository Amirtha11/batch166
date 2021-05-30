package groupTest;

import org.testng.annotations.Test;

public class GroupTest {

	@Test(priority = 1,groups = {"search","book","cancel"})
	public void loginTest() {
		System.out.println("----Loing Test completed----");
	}
	
    @Test(priority = 2,groups = {"search","book","cancel"})
	public void searchTest() {
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
