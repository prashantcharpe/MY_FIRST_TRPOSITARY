package Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExample {
	
	public static void main(String[] args) {
		//Map doesn't extend collection interface
		HashMap<Integer, String> obj = new HashMap<Integer, String>();	
		
		//key-value pair
		obj.put(1, "one"); //put method use for add key&value or entry in map
		obj.put(2, "two");
		obj.put(2, "two");//in Hashmap duplicate key is not allow only duplicate value allow
		obj.put(4, "four");
		obj.put(5, "five");
		obj.put(6, "six");
		obj.put(7, "seven");
		obj.put(8, "eight");
		obj.put(3, "three");
		System.out.println(obj);
		
		HashMap<Integer, String> obj1 = new HashMap<Integer, String>();
		
		//putAll() method use for add collection to in other collection 
		obj1.putAll(obj);
		System.out.println("obj1 : " + obj1);
		
		//remove() method use for remove or delete specific key from map
		obj1.remove(2);
		System.out.println("key 2 is remove from map :"+obj1);
		
		//use for specific key&value is remove or not. and get retun ture&false
		System.out.println("key & value is remove from map : " + obj1.remove(2, "two"));
		
		//for checking key&value is present or not, and get retun ture&false
		System.out.println("key is present in  map : " +obj1.containsKey(1));
		System.out.println("value is present in  map : " +obj1.containsValue("one"));
		
		System.out.println(obj.equals(obj1));
		
		//get use for get the value of specific key 
		System.out.println("get use for get the value of specific key :" +obj1.get(5));
	
		System.out.println("to get hashcode : " +obj1.hashCode());
		
		
		//checking is empty or not and return true&false
		System.out.println(obj.isEmpty());
		
		//replacing value 
		System.out.println(obj1.replace(1, "ten"));
		System.out.println(obj1);
		
		//replacing old value to new vlaue
		System.out.println("if value is change the return true :" +obj1.replace(8, "eight", "niene"));
		System.out.println(obj1);
		
		//give size of map
		System.out.println(obj1.size());
		
		//get value of key
		System.out.println(obj.get(1)+"\n");
		
		//One way to iterate with key and value pair 
		 //use entryset method which is  return set entry set 
		Set<Entry<Integer, String>> entry = obj1.entrySet();
		 //set object store in key-value pair---> No? 
		
		//Iterating through all the key value pair 
		for(Entry<Integer, String> t:entry) {
		//using getkey and getvalue method of entry
		//retrive all map key&value 
		System.out.println(t.getKey() + " " + t.getValue());
		}
		
		//Another way -when you just want to know the values
		//Keyset() method use for get all key only from map
		System.out.println("\n"+"get all key: " +obj.keySet());
					
		//values() method use for get all value only from map
		System.out.println("get all value: " +obj.values());
		
		//clear() method use for removing all key&value from map
		obj.clear();
		System.out.println(obj);
	
	}
	}

