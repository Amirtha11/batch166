package setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a,b,c         a,b,c
		//HashSet h= new HashSet();
		
	 // a,b         a,b,c
		Set s= new HashSet();
		s.add("d");
		s.add("a");
		s.add("c");
		s.add("b");
		s.add("d");
		s.add("a");
		s.add("c");
		s.add("b");
		// System.out.println(s.size());
		Iterator it= s.iterator();
		/* System.out.println(it.hasNext()); //verify the memory
		System.out.println(it.next());    //read the value
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext());
		System.out.println(it.next());
		System.out.println(it.hasNext()); // false
		System.out.println(it.next()); // error
		*/
		
	while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
		
	}

}
