package arrayListTest;

import java.util.ArrayList;

public class A18_ArrayListSubListtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add( "Vcentry1"); 
		a.add( "Vcentry2");
		a.add( "Vcentry3");
		a.add( "Vcentry4");
		a.add( "Vcentry5");
		a.add( "Vcentry6");
		a.add( "Vcentry7");
		
		
		
		
		System.out.println(a.subList(1, 5));
	}

}
