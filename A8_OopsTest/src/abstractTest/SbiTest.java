package abstractTest;

public class SbiTest extends RbiTest {
	public static void main(String[] args) {
		credit();
		debit();
		// RbiTest r=new RbiTest(); not possible
		SbiTest s= new SbiTest();
		s.KYC();
		s.loan();
		s.netbanking();
		
		RbiTest r= new SbiTest();
		r.KYC();
		r.loan();
	//	r.netbanking(); not possible
		
		
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan from Sbi 10%");
	}

	@Override
	public void KYC() {
		// TODO Auto-generated method stub
		System.out.println("KYC-Sbi process");
	}
	public void netbanking(){
		
	}

}
