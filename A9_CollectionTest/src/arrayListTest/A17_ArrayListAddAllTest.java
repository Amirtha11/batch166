package arrayListTest;

import java.util.ArrayList;

public class A17_ArrayListAddAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add( "Vcentry1"); 
		a.add( "Vcentry2");
		a.add( "Vcentry3");
		a.add( "Vcentry4");
		
		ArrayList b= new ArrayList();
		b.add("vcentry5");
		b.add("vcentry6");
		b.add("vcentry7");
		// a.add(b); it adds entire array as a new list
		
		a.addAll(b);
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
		
	}

}
