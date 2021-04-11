package setTest;

import java.util.HashSet;
import java.util.Iterator;

public class CompareTreeAndHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet s= new HashSet();
   
   s.add("a");
   s.add("b");
   s.add("c");
   s.add("d");
   
   s.add("a");
   s.add("b");
   s.add("c");
   s.add("d");
   // s.add(1);
   s.add(true);
   
   Iterator it = s.iterator()
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
