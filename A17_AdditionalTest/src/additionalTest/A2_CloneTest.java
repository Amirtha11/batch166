package additionalTest;

public class A2_CloneTest implements Cloneable {
public static int i;
public A2_CloneTest(int i) {
	this.i=i;
	
}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
System.out.println(i);
A2_CloneTest a1= new A2_CloneTest(10);
System.out.println(i);
A2_CloneTest a2= new A2_CloneTest(20);
System.out.println(i);
A2_CloneTest c= (A2_CloneTest) a1.clone();
System.out.println(i);
	}

}
