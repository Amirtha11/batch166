package arrayListTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ArrayBlockingQueue;

public class A19_ArrayListSortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a= new ArrayList();
a.add("vcentry5");
a.add("vcentry3");
a.add("vcentry1");
a.add("vcentry2");
a.add("vcentry4");
Collections.sort(a);
for(int i=0; i<a.size(); i++){
	System.out.println(a.get(i));
	
}

	}

}
