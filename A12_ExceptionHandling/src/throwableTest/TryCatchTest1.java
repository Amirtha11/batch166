package throwableTest;

public class TryCatchTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Error Handling initialized");
		 try{
			 int[] a = new int[2];
			 a[0]= 10;
			 a[1]=20;
			 a[2]=30;
			 
		 int i= 1/0;
		 }
		 catch(ArithmeticException e){
			 System.out.println("Alert: you have entered invalid number "); // message for User
			 
			 System.out.println(e.getLocalizedMessage()); // message for dev
		 }
			 
			 catch(ArrayIndexOutOfBoundsException e){
				 System.out.println("Alert: You have reached your maximum count");
				 System.out.println(e.getLocalizedMessage());
			 }
			 
		 
		 System.out.println("Error Handling completed");



	}
	
}


