
public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(add(2,2));
	}
public static int add(int a, int b){
	
	try{
		int i=1/0;
		return a+b;
		
	}
	catch (Exception e){
		return 1;
		
	}
	finally {
		return 0;
	}
}
}
