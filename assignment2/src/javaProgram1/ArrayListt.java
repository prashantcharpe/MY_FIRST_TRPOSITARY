package javaProgram1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListt {
	
	public static void main(String[] args) {
		
	
	ArrayList<Object> arr = new ArrayList<Object>();
	
	arr.add("prashant");
	arr.add(10);
	arr.add(true);
	arr.add(45.00d);
	arr.add('d');
	System.out.println(arr);
	System.out.println(arr.contains(10));

	ArrayList<Object> arr1 = new ArrayList<Object>();
	
	arr1.add("prashant");
	arr1.add(10);
	arr1.add(true);
	arr1.add(45.00d);
	arr1.add('d');
	arr.addAll(arr1);
	//System.out.println(arr.retainAll(arr1));
	System.out.println(arr);
	//arr1.clear();
	System.out.println(arr1);
	System.out.println(arr.containsAll(arr1));
	System.out.println(arr.equals(arr1));
	System.out.println();
	
	Iterator<Object> itr =  arr.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
arr.remove(1);
System.out.println(arr);

System.out.println(arr.toArray());

Object[] a= arr.toArray();

for(int i=0; i<a.length; i++) {
	System.out.println(a[i]);
}
	System.out.println("**************************************************");
	
	
	arr.add(0, "naiem");
	System.out.println(arr.get(1));
	System.out.println(arr);
	System.out.println(arr.indexOf(10));
	System.out.println(arr.lastIndexOf('d'));
	
	
	
	

	
	
	
	
	
	
	
	}
}
