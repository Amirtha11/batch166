package polymorphismTest;

public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
add(1,1);
add(1,1,1);
add(1,1,"addition of two number is :");
add(1, "addition of two number is : ", 5);
	}
	public static void add(int i, int j){
		//int i=1;
		//int j=1;
		int k=i+j;
		System.out.println(k);
	}
public static void add(int i, int j, int z){
	//int i=1;
	//int j=1;
	//int z=1;
	int k=i+j+z;
			System.out.println(k);
}
public static void add(int i, int j, String msg){
	//int i=1;
	//int j=1;
	//int z=1;
	int k=i+j;
			System.out.println(msg+ k);
}
public static void add(int i, String msg, int j){
	//int i=1;
	//int j=1;
	//int z=1;
	int k=i+j;
			System.out.println(msg+ k);
}
}
