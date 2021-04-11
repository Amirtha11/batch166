package throwableTest;

public class TryFinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception handling initialized");

		 try{
			System.out.println("DB Logout successfully");
		int i= 1/0;
		
		 }
		 finally {
			 System.out.println("DB logged out successfully");
		 }
		 
		 System.out.println("exception handling completed");
	}

}
