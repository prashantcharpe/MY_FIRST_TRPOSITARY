package CollectionList;

import java.util.ArrayList;

public class CollectionInterfaceMethod {

	
	public static void main(String[] args) {
	
		ArrayList<Object>  obj = new ArrayList<Object>();
		ArrayList<Object>   obj1 = new ArrayList<Object>();
		ArrayList<Object>   obj3 = new ArrayList<Object>();
		
		obj.add("string");
		obj.add(25);
		obj.add(125.5f);
		obj.add(135.05d);
		obj.add('A');
		obj.add(true);
		System.out.println(obj);
		
		obj1.add("string");
		obj1.add(25);
		obj1.add(125.5f);
		obj1.add(135.05d);
		obj1.add('A');
		obj1.add(true);
		System.out.println(obj1);
		
		//obj.clear(); // removing all obj and only showing empty []
		//System.out.println(obj);
		
		System.out.println(obj.contains(25));//if object available then return ture ither false
		System.out.println(obj.containsAll(obj1));//if coleection available then return ture ither false
	
		System.out.println(obj.equals(obj1));//if both collection have same object then return true ither false
		
	    System.out.println(obj.hashCode());// give unique hashcode to this collection
	    
	    System.out.println(obj3.isEmpty());//if collection is empty then return true ither false
	    
	  System.out.println(obj.remove(25));//0=string
	   System.out.println(obj);//object is removed from collection
	   
	    obj.addAll(obj1);
	    System.out.println(obj);
	    
	   //System.out.println(obj.removeAll(obj1));// removing all collection(obj + obj1)
	  // System.out.println(obj);
	   
	   System.out.println(obj.size());//showing how much object is present in coleection
	   
	  obj.toArray();
	  System.out.println(obj);//conver to array
		
	}
}
