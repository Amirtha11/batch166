package arrayListTest;

import java.util.ArrayList;

public class A16_ArrayListClonetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a=new ArrayList();
		a.add( "Vcentry1"); 
		a.add( "Vcentry2");
		a.add( "Vcentry3");
		a.add( "Vcentry4");
		ArrayList b=(ArrayList) a.clone();
		b.add("Vcentry5");
		for(int i=0; i<a.size(); i++){
			System.out.println("a Arary is:" + a.get(i));
		}
		System.out.println("--------------------");
		
		for(int i=0; i<b.size(); i++){
			System.out.println("b Arary is:" + b.get(i));
		}
	}

}
