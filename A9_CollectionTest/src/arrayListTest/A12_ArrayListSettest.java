package arrayListTest;

import java.util.ArrayList;

public class A12_ArrayListSettest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add( "Vcentry1"); // not possible
		a.add( "Vcentry2");
		a.add( "Vcentry3");
		a.add( "Vcentry4");
		
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
				
	}
		System.out.println("-----------");
		
		a.set(1, "Vcentry5");
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
			
			
		}
	}

}
