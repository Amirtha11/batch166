package interfaceTest;

public class HdfcTest implements RbiTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//RbiTest r=new RbiTest(); object creation in interface is not possible
   //c, d, l, e = c, d, l, e		
	HdfcTest h=new HdfcTest();
	h.credit();
	h.debit();
	h.loan();
	h.eduloan();
	
  //c, d, l  = c, d, l, e 
	RbiTest r=new HdfcTest();
	r.credit();
	r.debit();
	r.loan();
	//r.eduloan(); not visible
	}

	@Override //represents that it is from parent
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("credit from Hdfc");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("debit from Hdfc");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		System.out.println("loan from Hdfc");
	}
	public void eduloan(){
		
	}

	
	

}
