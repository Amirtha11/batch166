package throwableTest;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Exception handling initialized");

 try{
	System.out.println("DB Logout successfully");
int i= 1/0;
// int i= 1/1;
 }
 
 catch(Exception e){
	 System.out.println(e.getLocalizedMessage());
 }
 finally{
	 System.out.println("DB logout successfully");
	 
 }

System.out.println("Exception handling completed");
	}

}
