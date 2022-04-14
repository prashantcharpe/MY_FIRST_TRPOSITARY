package javaProgram1;

import java.util.LinkedList;

public class LINKEDlist {

	public static void main(String[] args) {
		
	
	LinkedList<Integer> obj = new LinkedList<Integer>();
	
	obj.add(10);
	obj.add(100);
	obj.addFirst(50);
	obj.addLast(500);
	
	
	System.out.println(obj);
	System.out.println(obj.getFirst());
	System.out.println(obj.getLast());
	obj.removeFirst();
	System.out.println(obj);
	
	}
}
