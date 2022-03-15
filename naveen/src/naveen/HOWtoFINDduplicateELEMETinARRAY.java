package naveen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HOWtoFINDduplicateELEMETinARRAY {

	public static void main(String[] args) {
		
		
		int a[]= {10,20,30,40,10};
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate element = "+a[j]);
				}
			}
		}System.out.println("***********************");
		
		String name[]= {"java","ruby","c","paython","java","c"};
		for(int i=0; i<name.length; i++) {
			for(int j=i+1; j<name.length; j++) {
				if(name[i]==name[j] ) {
					System.out.println("duplicate element = "+name[j]);
				}
			}
		}
		
		System.out.println("***********************");
		
		//2nd using Hashset java collection it store unique values o(n)
		HashSet<String> store = new HashSet<String>();
		for(String names : name) {
			if(store.add(names)==false) {
				System.out.println("duplicate element = "+ names);
			}
		}
		System.out.println("***********************");
		//3rd HashMap
		Map<String, Integer> storemap = new HashMap<String, Integer>();
		for(String names : name) {
		 Integer count = storemap.get(names);
		 if(count==null) {
			 storemap.put(names, 1);
		 }
		 else {
			 storemap.put(names, count++);
		 }
			}
		//get the values from this Hashmap
		
		Set<Entry<String, Integer>> entrySet=storemap.entrySet();
	    for(Entry<String, Integer> entry : entrySet) {
		if(entry.getValue()>1) {
			System.out.println("duplicate element = "+ entry.getKey());
		}
	}
		
		
		
	}
}
