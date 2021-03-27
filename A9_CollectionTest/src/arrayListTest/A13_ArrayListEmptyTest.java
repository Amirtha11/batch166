package arrayListTest;

import java.util.ArrayList;

public class A13_ArrayListEmptyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add( "Vcentry1"); // not possible
		a.add( "Vcentry2");
		a.add( "Vcentry3");
		a.add( "Vcentry4");
		System.out.println(a.isEmpty());
		a.clear();
		System.out.println(a.isEmpty());
	}

}
