package CollectionSet;

import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> obj = new TreeSet<Integer>();
		
		//Heterogeneous object not allow in tree set 
		//insertion order is not  Preserved 
		
		//obj.add("prashant");
		//obj.add('A');
		//obj.add(125.25f);
		//obj.add(365.25d);
		//obj.add(true); 
		
		obj.add(15);        //duplicate value is not allow
		obj.add(15);
		obj.add(25);
		obj.add(68);
		obj.add(100);
		obj.add(779);
		obj.add(35);
		System.out.println(obj);
		
		//USING SortedSet Method
		// SortedSet Method is all return methods 
		System.out.println("*************************************SortedSet Method*************************************************************************"+"\n");
		
		System.out.println("using first method, print 1st object : " + obj.first());
		System.out.println("using last method, print last object : " +obj.last());
		
		//headSet() method use for returnig the value is less than given object like 68
		System.out.println("using headSet method, printing less value of given object 68 : " +obj.headSet(68));
		
		//tailSet() method use for returnig the value is EQUAL or GRETAR than given object like 68
		System.out.println("using headSet method, printing equal or gretar than value of given object 68 " +obj.tailSet(68));
		
		//subSet() method use for returnig the value is EQUAL or GRETAR than given object like 68
		System.out.println("using subSet method, printing equal or gretar than value of given object 68 " +obj.subSet(25, 100));
		
		System.out.println("*************************************NavigableSet Method*************************************************************************"+"\n");
		
		//USING NavigableSet Method
		// NavigableSet Method is all return methods 
		
		//ceiling() return the give object if available ithere return greater value
		System.out.println("ceiling method return given value ithere greater value : "+obj.ceiling(16));
		
		//floor() return the give object if available ithere return less value
		System.out.println("floor method return given value ithere less value : "+obj.floor(24));
				
		//descendingSet() return the given object in descending order
		System.out.println("descendingSet method retur given object in descending order : "+obj.descendingSet());
		
		//headSet() return all object, is less than from given object
		System.out.println("headSet method return all object, is less than from given object  : "+obj.headSet(35));
		
		//headSet() return all object, is less than or equal from given object if condition is true
		System.out.println("headSet method return all object, is less than  or equal from given object if condition is true  : "+obj.headSet(35, true));
		
		//higher() only return one greater object from given  object.
		 System.out.println("higher() only return one greater object from given object : "+obj.higher(35));
		
		//lower() only return one less object from given  object.
		 System.out.println("lower() return only less object from given  object.: "+obj.lower(35));
		
		//using pollFirst method, print 1st object
		 System.out.println(" using pollFirst method, print 1st object: "+obj.pollFirst());
		 
		//using pollLast method, print last object
		 System.out.println(" using pollLast method, print last object: "+obj.pollLast());
		 
		//using subSet
		 System.out.println(" subSet: "+obj.subSet(25, false, 100, false));
		 System.out.println(" subSet: "+obj.subSet(25, true, 100, false));
		 System.out.println(" subSet: "+obj.subSet(25, false, 100, true));
		 System.out.println(" subSet: "+obj.subSet(25, true, 100, true));
		 
		 System.out.println(10+20+"abs"+10%5+20 );
	}
}
