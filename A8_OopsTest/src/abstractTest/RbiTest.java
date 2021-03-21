package abstractTest;

public abstract class RbiTest {
	public static int days=6;
	final public int interest=10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void credit(){
		System.out.println("credit logic from Rbi");
	}
public static void debit(){
	System.out.println("debit logic from Rbi");
}
public abstract void loan();
public abstract void KYC();
}
