package encapsulationTest;

public class HdfcTest {

	private int accnum;

	public int getAccnum() {
		System.out.println("yes customer acc active");
		return accnum;
	}

	public void setAccnum(int accnum) {
		System.out.println("we are processing your request please wait");
		
		this.accnum = accnum;
	}
	

}
