package arrayListTest;

import java.util.ArrayList;

public class A5_ArrayListGetAllDataTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		a.add("Vcentry1");
		a.add("Vcentry2");
		a.add("Vcentry3");
		a.add("Vcentry4");
		a.add(1);
		a.add(true);
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
	}

}
