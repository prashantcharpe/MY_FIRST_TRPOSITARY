package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterator {
	
	public static void main(String[] args) {
	
		//Map store the object in key value pair and it you want to retrive any value
		//u can do it throuh key 

	HashMap<Integer, String> obj = new HashMap<Integer, String>();	
	
	//key-value pair
	obj.put(1, "one"); //put method use for add key&value or entry in map
	obj.put(2, "two");
	obj.put(2, "two");//in Hashmap duplicate key is not allow only duplicate value allow
	obj.put(3, "three");
	obj.put(4, "four");
	obj.put(5, "five");
	obj.put(6, "six");
	obj.put(7, "seven");
	obj.put(8, "eight");
	System.out.println(obj);
	
	//Another way -when you just want to know the values
	//Keyset() method use for get all key only from map
	System.out.println("get all key: " +obj.keySet());
		
	//we use iterator bcoz of keyset
	//key return a set and iterator is collection method or set method
	//only key is return 
	Iterator p = obj.keySet().iterator();
	while(p.hasNext()){
		System.out.println(p.next());
	}
	
	}
}
