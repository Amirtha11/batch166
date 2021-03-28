package mapTest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap  map = new HashMap();
		map.put("username", "abc");
		map.put("password", "123");
		map.put("domain", "testing");
		map.put("company", "vcentry");
		map.put("mobile", null);
		// System.out.println(map.get("username"));
		
		// Set s= map.keySet();
		// Iterator it= s.iterator(); //or
		
		Iterator it=map.keySet().iterator();
		
		while(it.hasNext()){
			// System.out.println(it.next());
			
			String key= (String) it.next();
			System.out.println(key+"-"+map.get(key));
		}
	}

}
