package CollectionSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		
	HashSet<Object> obj = new HashSet<Object>();	
	//hashset insertion order is not preseverd
	
	 obj.add("prashant");
	 obj.add(15);
	 obj.add(15);    //duplicate object---it will overwrite the existing object
	 obj.add('b');
	 obj.add(200.25f);
	 obj.add(true);
	 obj.add(16);
	 System.out.println(obj);
	 
	 System.out.println("I am coping obj collection in another collection by using clone() method");
	HashSet<Object> obj1  =  (HashSet<Object>) obj.clone();
	System.out.println(obj1);
	
	HashSet<Object> obj2  =  (HashSet<Object>) obj1.clone();
	System.out.println(obj2);
	 
    obj1.add(obj2);
    System.out.println("obj1 + obj2 " + obj1);
	
	 //contain method finding the value is present or not, if present then return true
	System.out.println( obj.contains(16));  
	
	//isEmpty method finding the value is empty or not, if empty then return true
	System.out.println(obj.isEmpty());
	 
	//returning the size of object or collection
	System.out.println(obj.size());
	 
	
	// clear() method use of clear or remove all object from  collection.
	obj.clear();
	System.out.println(obj);
	
	//remove method reomove perticular object or collection also from other collection
	obj1.remove(16);
	System.out.println("removing  16 object from obj1 collection " +obj1);
	
	//remove method reomove perticular object or collection also from other collection
	obj1.remove(obj2);
	System.out.println(obj1);
	
	
	Iterator itr = obj1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}
	
	

}
