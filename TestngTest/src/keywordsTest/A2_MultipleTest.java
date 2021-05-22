package keywordsTest;

import org.testng.annotations.Test;

public class A2_MultipleTest {

	@Test
	public void Logintest(){
		System.out.println("--login testcase--");
	}
	
	@Test
public void Searchtest(){
		System.out.println("--search testcase--");
	}

	@Test
public void Bookingtest(){
	System.out.println("--booking testcase--");
}

	@Test
public void Canceltest (){
	System.out.println("cancel testcase--");
}
}
