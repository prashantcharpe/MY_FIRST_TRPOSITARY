package javaProgram1;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		//homogeneous 
		ArrayList<Integer> obj1 = new ArrayList<Integer>();
		ArrayList<String> obj2= new ArrayList<String>();
		ArrayList<String> obj= new ArrayList<String>();
	
		obj.add("df");
		obj.add("df");
		obj.add("df");
		obj.add("df");
		System.out.println(obj);
		
		obj2.add("prashant");
		
		String ss = obj2.get(0);
		System.out.println(ss);
		System.out.println(obj2);
		
		if(obj2.get(0)==null) {
			System.out.println(" null");
		}
		obj2.removeAll(obj);
		System.out.println(obj);
		System.out.println("*******************************");
		ArrayList<Character>obj3= new ArrayList<Character>();
	
	//heterogeneous
		ArrayList<Object> obj4 = new ArrayList<Object>();
		ArrayList obj5 = new ArrayList();


		System.out.println(obj4.isEmpty());
		System.out.println(obj4.size());
		obj4.add(10);
		obj4.add("prashant");
		obj4.add('a');
		obj4.add(12.05f);
		obj4.add(true);
		obj4.add(null);
		obj4.add("prashant");
		obj4.add(10);
		
		System.out.println(obj4.isEmpty());
		for(int i=0; i<obj4.size(); i++) {
			System.out.println(obj4.get(i));
		}
		System.out.println();
		obj4.set(1, "pravin");
		obj4.set(4, false);
		System.out.println(obj4);
		
	
	
		
	
	
	}
}
