package sampleTest;

public class ConstructorTest {
public static int i;
public static int j;

 ConstructorTest(){
	i=5;
	j=5;
}
 
 ConstructorTest(int i, int j){        //constructor overloading
		this.i=i;                      // parameterized constructor
		this.j=j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(i);
System.out.println(j);

ConstructorTest c = new ConstructorTest();

System.out.println(i);
System.out.println(j);

ConstructorTest d= new ConstructorTest(10,10);
System.out.println(i);
System.out.println(j);
	}

}
