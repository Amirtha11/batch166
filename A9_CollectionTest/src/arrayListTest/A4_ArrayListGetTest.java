package arrayListTest;

import java.util.ArrayList;

public class A4_ArrayListGetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		a.add("Vcentry1"); //0
		a.add("Vcentry2"); //1
		a.add("Vcentry3"); //2
		a.add("Vcentry4"); //3
		a.add(1);          //4
		a.add(true);       //5
		System.out.println(a.get(3));
	}

}
