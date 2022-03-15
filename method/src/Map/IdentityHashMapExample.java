package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapExample {

	public static void main(String[] args) {
		
		//Two object of Interer class both having same value (10) 
		Integer t1 = new Integer(10);
		Integer t2 = new Integer(10);
	
		//this is exapmle of IdentityHashMap
		//== will return true if both the reference will point to same object
	     System.out.println(t1==t2);//false
	
	   //this is exapmle of HashMap
	   //equals return true if both object have same content
	   System.out.println(t1.equals(t2));
	   
	   HashMap<Integer, Integer> obj=new HashMap<Integer, Integer>();
	   obj.put(t1, 12); //t1--->12 
	 //it will check whether key is already present 
	 //Hashmap used equals method to check uniqueness t2.equals(t1)
      obj.put(t2, 13);
      System.out.println(obj);
      
      
    //IdentityHashMap will use == to check whether key is already present or not 
	  IdentityHashMap<Integer, Integer> obj1=new IdentityHashMap<Integer,Integer>(); 
		obj1.put(t1, 12); 
		obj1.put(t2, 13); 
		System.out.println(obj1);
	   
	}
	
}
