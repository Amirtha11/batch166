package encapsulationTest;

public class GpayTest {
public static void main(String[] args) {
	HdfcTest h= new HdfcTest();
	h.setAccnum(123);
	System.out.println("you are eligible for transfer"+ h.getAccnum());
}
}

