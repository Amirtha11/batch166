package staticTest;

public class StaticTest {
public static void main(String[] args) {
	StaticTest S=new StaticTest();
	//StaticTest S1=new StaticTest();
	System.out.println(S);
	//System.out.println(S1);
	S.balance();
	//balance();
}
public void credit(){ //dynamic memory
	System.out.println("credit");
}
public static void debit(){
	System.out.println("debit");
}
public void balance(){ //dynamic memory
	credit();
	debit();
}
}
