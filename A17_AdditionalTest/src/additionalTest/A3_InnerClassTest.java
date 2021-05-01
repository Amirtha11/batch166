package additionalTest;

public class A3_InnerClassTest {
class MyInnerClass{
	void add(){
		System.out.println("I am inner class add");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A3_InnerClassTest m= new A3_InnerClassTest();
m.sub();
A3_InnerClassTest.MyInnerClass i= m.new MyInnerClass();
i.add();

	}
void sub(){
	System.out.println("i am main class sub");
}
}
