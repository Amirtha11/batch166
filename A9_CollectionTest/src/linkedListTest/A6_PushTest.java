package linkedListTest;

import java.util.LinkedList;

public class A6_PushTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");
		
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
		System.out.println("-------------------");
		
		l.push("aa");
		
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
	}

}
