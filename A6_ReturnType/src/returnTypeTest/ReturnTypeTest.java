package returnTypeTest;

public class ReturnTypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//add();
//sub();
		int result=add()+sub();
		System.out.println(result);
		System.out.println(msg()); //or
		String s=msg();
		System.out.println(s);
	}
public static int add(){
	int i=1;
	int j=1;
	int k=i+j;
	int z=i+j+k;
	System.out.println(k);
	return k;
	//return z;only one return statement allowed
}

public static int sub(){
	int i=5;
	int j=2;
	int k=i-j;
	System.out.println(k);
	return k;
}
public static String msg(){
	int i=1;
	int j=1;
	int k=i+j;
	String msg="addition of two number is :" +k;
	return msg;
}
}
