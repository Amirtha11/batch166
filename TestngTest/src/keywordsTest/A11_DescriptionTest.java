package keywordsTest;

import org.testng.annotations.Test;

public class A11_DescriptionTest {

	@Test(priority=1, description="login ecomerce app")
	public void Logintest(){
		System.out.println("--login testcase--");
	}
	
	@Test(priority=2, description="search product")
public void a_Searchtest(){
		System.out.println("--search product A testcase--");
	}

	@Test(priority=3, description="book travel ticket")
public void Bookingtest(){
	System.out.println("--booking testcase--");
}

	@Test(priority=4, description="cancel travel ticket")
public void Canceltest (){
	System.out.println("cancel testcase--");
}
}
