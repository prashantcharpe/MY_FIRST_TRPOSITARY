package CollectionList;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VeectorMethod {

	public static void main(String[] args) {

		Vector<Object> obj = new Vector<Object>();
		Vector<Object> obj1 = new Vector<Object>();

		obj.add("one"); // adding only object or element
		obj.add(0, "two"); // adding object or element on 0 index position
		obj.addElement("three"); // adding element object
		System.out.println(obj);

		System.out.println(obj.firstElement());// only 1st index object showing or get
		System.out.println(obj.lastElement());// only last index object showing or ger
		System.out.println(obj.elementAt(0));// get object or element from index position
		
		obj1.add("four");
		obj1.add("four");
		obj1.add(0, "five");
		obj1.addElement("six");
		System.out.println(obj1);

		obj.addAll(obj1); // only adding collection in othere collection
		System.out.println(obj);

		obj.addAll(0, obj1);// adding collection from 0 index
		System.out.println(obj);

		System.out.println(obj.capacity());

		System.out.println(obj.removeElement("one"));
		// removing one object, in object is remove then return value is true ither
		// false
		System.out.println(obj);

		obj.removeElementAt(0);// removing one element or object from index position
		System.out.println(obj);

		System.out.println("**********Enumeration************");

		// If you want to retrive objects from collection one by one we use cursors
		// Enumeration is one of the cursor
		
		Enumeration enumerationobj = obj.elements();
		while (enumerationobj.hasMoreElements()) {
			System.out.println(enumerationobj.nextElement());
		}

		System.out.println("*********Iterator*************");

		Iterator iteratorobj = obj.iterator();
		while (iteratorobj.hasNext()) {
			System.out.println(iteratorobj.next());
		}

		System.out.println("*********ListIterator*************");

		ListIterator listitreatorobj = obj.listIterator();
		while (listitreatorobj.hasNext()) {
			System.out.println(listitreatorobj.next());
		}
		System.out.println("*********ListIterator*************");
		
		while (listitreatorobj.hasPrevious()) {
			System.out.println(listitreatorobj.previous());
		}
		System.out.println("*********removeAllElements*************");

		obj.removeAllElements(); // removing all object or element
		System.out.println(obj);

	}

}
