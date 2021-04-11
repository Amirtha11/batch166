package setTest;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 TreeSet s =new TreeSet();
 s.add("a");
 s.add("b");
 s.add("c");
 s.add("d");
 
 s.add("a");
 s.add("b");
 s.add("c");
 s.add("d");
 //s.add(null);
 
 Iterator it = s.iterator();
 
 /* System.out.println(it.hasNext());
 System.out.println(it.next());
 
 System.out.println(it.hasNext());
 System.out.println(it.next());
 
 System.out.println(it.hasNext());
 System.out.println(it.next());
 
 System.out.println(it.hasNext());
 System.out.println(it.next());
 
 System.out.println(it.hasNext());
 System.out.println(it.next()); */
 
 while(it.hasNext()){
	   System.out.println(it.next());
 }
	}

}
