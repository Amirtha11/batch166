package parameterTest;

import org.testng.annotations.Test;



import org.testng.annotations.Parameters;




public class ParameterTest {

	@Parameters({"browser","url","username","password"})
	@Test
	public void Logintest(String browser, String url, String username, String password){
		System.out.println("Open Browser    --:"+browser);
		System.out.println("Enter URL       --:"+url);
		System.out.println("Enter user name --:"+username);
		System.out.println("Enter password  --:"+password);
		System.out.println("Click login button");
		System.out.println("-----------------------------------");
	}
}
