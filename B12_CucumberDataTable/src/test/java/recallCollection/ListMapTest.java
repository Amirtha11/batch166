package recallCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ListMapTest {

	public static void main(String[] args) {
		HashMap<String, String> mapa= new HashMap<String, String>();
		mapa.put("username", "username a");
		mapa.put("password", "password a");
		mapa.put("domain", "testing a");
		mapa.put("company", "company a");
		
		HashMap<String, String> mapb= new HashMap<String, String>();
		mapb.put("username", "username a");
		mapb.put("password", "password b");
		mapb.put("domain", "testing b");
		mapb.put("company", "company b");
		
		HashMap<String, String> mapc= new HashMap<String, String>();
		mapc.put("username", "username c");
		mapc.put("password", "password c");
		mapc.put("domain", "testing c");
		mapc.put("company", "company c");
		
		HashMap<String, String> mapd= new HashMap<String, String>();
		mapd.put("username", "username d");
		mapd.put("password", "password d");
		mapd.put("domain", "testing d");
		mapd.put("company", "company d");
		
		
	ArrayList<HashMap<String, String>> list = new ArrayList<HashMap<String,String>>();
	list.add(mapa); //0
	list.add(mapb);  //1
	list.add(mapc);  //2
	list.add(mapd);  //3
	
	for(int i=0; i<list.size(); i++){
		System.out.println(list.get(i).get("username"));
		System.out.println(list.get(i).get("password"));
		System.out.println(list.get(i).get("domain"));
		System.out.println(list.get(i).get("company"));
	}
	
	}

}
