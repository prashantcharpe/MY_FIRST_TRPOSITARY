
package CollectionList;

import java.util.ArrayList;

public class practice2 {

	public static void main(String[] args) {

		ArrayList<Object> obj = new ArrayList<Object>();
		ArrayList<Object> obj1 = new ArrayList<Object>();

		obj1.add("stella");
		obj.add("prashant");
		obj.add(100);
		obj.add(true);
		obj.add('A');
		obj.add(125.25f);
		obj.add(300.55d);

		System.out.println(obj.size());// showing how much object r present in collection in the number

		obj.add(0, "pravin");

		System.out.println(obj);
		System.out.println(obj.get(1)); // use for get value from specific location

		obj.set(1, "priyanka"); // use for replace value
		System.out.println(obj);

		obj.addAll(obj1);
		System.out.println(obj);

		obj.addAll(2, obj1);
		System.out.println(obj);

		System.out.println("object present or not in collection = " + obj.contains(100)); // use for obj present or not
																							// in collection
		System.out.println("other collection object present or not in this collection = " + obj.containsAll(obj1));// use
																													// for
																													// other
																													// collection
																													// object
																													// present
																													// or
																													// not
																													// in
																													// collection

		System.out.println("two collection equals or not = " + obj.equals(obj1));// use for two collection object equal
																					// or not

		System.out.println("hashcode = " + obj.hashCode());// use for get uniqcode from collection

		System.out.println(" object is empty or not = " + obj.isEmpty());

		obj.remove(0);
		System.out.println(obj);// remove only 0 index object

//obj.removeAll(obj); //remove all object from collection
//System.out.println(obj);

//obj.removeAll(obj1); //remove other collection object from this collection
//System.out.println(obj);

		obj.retainAll(obj1);
		System.out.println(obj);// use for retain only other collection object and remove current collection
								// object

		obj.clear();
		System.out.println(obj);// user for clear all object or remove

//System.out.println(obj1.indexOf(obj));

//obj.lastIndexOf(obj);

	}
}