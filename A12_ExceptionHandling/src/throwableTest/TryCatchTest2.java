package throwableTest;

public class TryCatchTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Error Handling initialized");
		 try{
			 int[] a = new int[2];
			 a[0]= 10;
			 a[1]=20;
			// a[2]=30;
			 
		 int i= 1/0;
		 }
		 
		 catch(Exception e){
			 System.out.println("Alert: Sorry something went wrong ");
			 System.out.println(e.getLocalizedMessage());
		 }
	}

}
