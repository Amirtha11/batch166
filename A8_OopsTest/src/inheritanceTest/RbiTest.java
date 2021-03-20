package inheritanceTest;

public class RbiTest extends WorldBank{
	public static void main(String[] args) {
		credit();
		debit();
		eduloan();
		/* RbiTest o=new RbiTest();
		o.netbanking(); */ //non static example
		System.out.println(interest);
	}
public static void eduloan(){
	System.out.println("eduloan from Rbi");
}
}
