package linkedListTest;

import java.util.LinkedList;

public class A4_PeekTest {

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
		System.out.println("---------------------");
		
		System.out.println(l.peek());
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		
		System.out.println("-------after peek--------------");
		
		for(int i=0; i<l.size(); i++){
			System.out.println(l.get(i));
		}
	}

}
