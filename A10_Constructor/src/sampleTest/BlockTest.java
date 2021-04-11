package sampleTest;

public class BlockTest {
	{
		System.out.println("normal block");
	}
	
	static {
		System.out.println("static block1");
	}
	static {
		System.out.println("static block2");
	}
	
	public BlockTest() {
		System.out.println("constructor block");
	}
	
	public static void add(){
		System.out.println("function block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
