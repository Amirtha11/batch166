package arrayListTest;

import java.util.ArrayList;

public class A9_ArrayListUserIndexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add(0, "Vcentry1");
		a.add(1, "Vcentry2");
		a.add(2, "Vcentry3");
		a.add(3, "Vcentry4");
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
		
	}

}
