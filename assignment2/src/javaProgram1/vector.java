package javaProgram1;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		
	
	Vector<String> obj = new Vector<String>();
	obj.addElement("bike");
	obj.add("sum");
	obj.addElement("csk");
	obj.addElement("rr");
	
	System.out.println(obj);
	obj.removeElementAt(0);
	System.out.println(obj);
	System.out.println(obj.firstElement());
	System.out.println(obj.capacity());
	System.out.println(obj.elements());
	
	
	Enumeration itr = obj.elements();
	while(itr.hasMoreElements()) {
		System.out.println(itr.nextElement());
	}
	
	Stack<Integer> obj2 = new Stack<Integer>();
	
	obj2.push(10);
	obj2.push(20);
	obj2.push(30);
	obj2.push(40);
	System.out.println(obj2);
	
	System.out.println(obj2.peek());
	
	obj2.pop(); //
	System.out.println(obj2);
	
	System.out.println(obj2.empty());
	System.out.println(obj2.search(20));
}
}