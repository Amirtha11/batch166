package throwableTest;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Error Handling initialized");
 try{
 int i= 1/0;
 }
 catch(ArithmeticException e){
	 System.out.println("Alert: you have entered invalid number "); // message for User
	 
	 System.out.println(e.getLocalizedMessage()); // message for dev
	 
 }
 
 
 System.out.println("Error Handling completed");
	}

}
