package linkedListTest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 LinkedList l= new LinkedList();
 l.add("d");
 l.add("c");
 l.add("a");
 l.add("b");
 
 l.add("d");
 l.add("c");
 l.add("a");
 l.add("b");
 
 // l.size();
 // l.remove();
 
 Iterator it = l.iterator();
 
 while(it.hasNext()){
	 System.out.println(it.next());
 }
 
	}

}
