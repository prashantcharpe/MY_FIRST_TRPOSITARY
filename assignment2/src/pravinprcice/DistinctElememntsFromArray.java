package pravinprcice;

import java.util.ArrayList;
import java.util.HashMap;

public class DistinctElememntsFromArray {
	
	public static void main(String[] args) {
		
		 int a [] = {1,2,3,4,5,4,6,7,5,2,1};
		 
		 printdistinct(a);	
		 printdistinct2(a);
	}
	
	public static void printdistinct(int arr[]){
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(!b.contains(arr[i])) {
				b.add(arr[i]);
				System.out.print(arr[i]+ " ");
			}
		}
}
	
	
	public static void printdistinct2(int arr[]) {
		HashMap<Integer, Integer> d = new HashMap<Integer,Integer>();
	for(int i=0; i<arr.length; i++) {
		d.put(arr[i], arr[i]);
	}
	System.out.println(d.keySet()+ " ");
	System.out.println(d.values()+ " ");
	
	
	}
}
