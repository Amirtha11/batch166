package arrayListTest;

import java.util.ArrayList;

public class A14_ArrayListRemoveTest {

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
		System.out.println("-----------------");
		
		a.remove(1);
		
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
			
		}
	}

}
