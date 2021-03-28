package setTest;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet  s= new LinkedHashSet();
s.add("d");
s.add("b");
s.add("a");
s.add("e");

s.add("d");
s.add("b");
s.add("a");
s.add("e");
s.add(null);
s.add(1);
s.add(true);

Iterator it=s.iterator();

while(it.hasNext()){
	System.out.println(it.next());
}
	}

}
