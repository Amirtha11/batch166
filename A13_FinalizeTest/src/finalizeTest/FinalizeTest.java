package finalizeTest;

public class FinalizeTest {
public void finalize(){
	System.out.println("finalize called");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalizeTest f1= new FinalizeTest();
FinalizeTest f2= new FinalizeTest();
FinalizeTest f3= new FinalizeTest();
FinalizeTest f4= new FinalizeTest();
f1=null;
f2=null;
f3=null;
f4=null;

System.gc();


	}

}
