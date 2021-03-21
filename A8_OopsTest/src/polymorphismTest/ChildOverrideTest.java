package polymorphismTest;

public class ChildOverrideTest extends ParentOverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//add();
		ChildOverrideTest c= new ChildOverrideTest();
		c.exe();
	}
public static void add(){
	System.out.println("add from child class");
}
public void exe(){
	super.add(); // override from parent class
	add();
	this.add(); // override from current class
}
}
