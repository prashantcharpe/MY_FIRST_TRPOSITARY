package CollectionList;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMethod {
public static void main(String[] args) {
	
	
	LinkedList obj = new LinkedList();
	
	obj.add("one");
	obj.add(0, "two");
	obj.addFirst("three");
	obj.addLast(4);
	obj.add("fure");
	obj.add(0, "five");
	obj.addFirst("six");
	obj.addLast(7);
	System.out.println(obj);
	
	System.out.println(obj.get(1));
     System.out.println(obj.getFirst());
     System.out.println(obj.getLast());
     
     System.out.println(obj.removeFirst());//removing only 1st position obect
     System.out.println(obj);
     
     System.out.println(obj.removeLast());//removing only last position obect
     System.out.println(obj);
  

     
     System.out.println("**********************");
     
     System.out.println(obj.iterator().hasNext());
     
 System.out.println("**********************");
     
     System.out.println(obj.iterator().next());
     
     System.out.println("*********Iterator*************");
     
   Iterator iteratorobj  =obj.iterator();
   while(iteratorobj.hasNext()) {
	   System.out.println(iteratorobj.next());
   }
   
   System.out.println("***********ListIterator***********");
   
  ListIterator listitreatorobj =obj.listIterator();
  while(listitreatorobj.hasNext()) {
	  System.out.println(listitreatorobj.next());
  }
  System.out.println("***********ListIterator***********");
  
  while(listitreatorobj.hasPrevious()) {
	  System.out.println(listitreatorobj.previous());
  }
  
	 
}
}
