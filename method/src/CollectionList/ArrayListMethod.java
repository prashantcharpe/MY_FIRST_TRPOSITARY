package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListMethod {

	public static void main(String[] args) {
		
		ArrayList<Object>  obj = new ArrayList<Object>();//no prameter constructor ArrayList 
		ArrayList<Object>   obj1 = new ArrayList<Object>();
		
		ArrayList<Object> obj3 = new ArrayList<Object>(3);//prameter constructor ArrayList giving size 
		
		obj3.add(0, "string");//adding object from 0 index position
		obj3.add(1, 125);
		obj3.add(2, 125.02f);
		obj3.add(3, 350.25d);
		obj3.add(4, 'A');
		obj3.add(5, true);
		System.out.println(obj3);
		
	obj.add(0, "string");//adding object from 0 index position
	obj.add(1, 125);
	obj.add(2, 125.02f);
	obj.add(3, 350.25d);
	obj.add(4, 'A');
	obj.add(5, true);
	System.out.println(obj);
	
	obj1.add(0, "prashant");
	obj1.add(1, 125);
	obj1.add(2, 125.02f);
	obj1.add(3, 350.25d);
	obj1.add(4, 'A');
	obj1.add(5, false);
	System.out.println(obj1);
	
	obj.addAll(0, obj1);//adding another collection from 0 index position
	System.out.println(obj);
	
	obj.remove(6);//removeing object from 6 index position
	System.out.println(obj);
	
	obj.get(0);//geting object from 0 index position
	System.out.println(obj);
	
	obj.set(0, "ironman");//replacing object from 0 index position
	System.out.println(obj);
	
	
	System.out.println(obj.indexOf('A'));//showing object index position
	
	System.out.println(obj.lastIndexOf(true));
	
	Object p=obj.get(1);//initilizing the object to the object p
	System.out.println(p);
	
	Integer t=(Integer) obj.get(1);//hetrongeneous statement converting to the integer object 
	System.out.println(t);

	System.out.println();
	
	 System.out.println("************Iterator**********");
	
	  Iterator iterator = obj.iterator(); while(iterator.hasNext()) {
	  System.out.println(iterator.next()); }
	
	  System.out.println("*********ListIterator*************" );
	  
	  ListIterator listitreatorobj =obj.listIterator();
	  while(listitreatorobj.hasNext()) {
		  System.out.println(listitreatorobj.next());
	  }
	  System.out.println("*********ListIterator*************" );
	  
         while(listitreatorobj.hasPrevious()) {
		  System.out.println(listitreatorobj.previous()); }

		
	   
	}
}
