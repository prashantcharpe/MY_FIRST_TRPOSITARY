package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
public static void main(String[] args) {
	
	ArrayList<Object> obj = new ArrayList<Object>();
	
	obj.add("first");
	obj.add(125);
	obj.add(750.25f);
	obj.add('A');
	obj.add(true);
	
	System.out.println(obj);

	//If i want to access specific object or print
	System.out.println(obj.get(0));

	
	//type casting object to string
	String var = (String) obj.get(0);
	System.out.println(var);
	System.out.println(var.toUpperCase());
	System.out.println( );
	
	Iterator iterator = obj.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	//this r iterator method-->hasnext and next and remove
	//HasNext used for checking the object r availabe or not in collection
	//next used for get current object like get method
	
	System.out.println("-----------Old Style-----------------");
	
	for(int i=0;i<obj.size();i++) {
		System.out.println(obj.get(i));
	}
}
}
