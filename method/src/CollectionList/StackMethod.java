package CollectionList;

import java.util.Stack;

public class StackMethod {
public static void main(String[] args) {
	
	Stack<Object> obj = new Stack<Object>();
	obj.push("string");
	obj.push(10);
	obj.add("string");
	obj.add(0, 125);
	obj.addElement(500);
	System.out.println(obj);
	
	System.out.println(obj.peek());//get or print last object from collection
	
	obj.pop(); //removing the last object from collection
	System.out.println(obj);
	
	
	System.out.println(obj.empty());//checking collection is empty then return true ither false.
	
	System.out.println(obj.search(10));//returning the index value of this object
	
	
}
}
