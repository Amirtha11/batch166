package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;

public class A20_ArrayListSortAllDatatypeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a= new ArrayList();
		a.add("vcentry5");
		a.add(true);
		a.add(2);
		a.add(2.5);
		a.add('a');
		Collections.sort(a);
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
			
		}
	}

}
