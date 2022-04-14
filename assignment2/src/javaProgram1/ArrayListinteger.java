package javaProgram1;

import java.util.ArrayList;

public class ArrayListinteger {
	
	public static void main(String[] args) {
		
	
	ArrayList<Integer> ar1 = new ArrayList<Integer>();
	ar1.add(10);
	ar1.add(12);
	ar1.add(1045);
	ar1.add(458695);
	ar1.add(104854);
	ar1.add(1041968);
	ar1.add(107894);
	ar1.add(1045968);
	ArrayList<Integer> ar2 = new ArrayList<Integer>();
	ar2.add(10);
	ar2.add(12);
	ar2.add(1045);
	ar2.add(458695);
	ar2.add(104854);
	ar2.add(1041968);
	ar2.add(107894);
	ar2.add(1045968);
	ArrayList<Integer> ar3 = new ArrayList<Integer>();
	ar3.add(10);
	ar3.add(12);
	ar3.add(1045);
	ar3.add(458695);
	ar3.add(104854);
	ar3.add(1041968);
	ar3.add(107894);
	ar3.add(1045968);
	System.out.println(ar3.size());

	ArrayList<ArrayList<Integer>> ar = new ArrayList<ArrayList<Integer>>();

	ar.add(ar1);
	ar.add(ar2);
	ar.add(ar3);
	
	System.out.println(ar);
	System.out.println(ar.size());
	
	for(int i=0; i<ar.size(); i++) {
		System.out.println(ar.get(i));
	}
	System.out.println();
	
	for(int i=0; i<ar.size(); i++) {
		for(int j =0; j<ar.get(i).size(); j++) {
			System.out.println("ar.get(" +i+").get("+ j+")= "+ar.get(i).get(j));
		}
	}{
		
	}
	}
}