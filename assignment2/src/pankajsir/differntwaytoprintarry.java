package pankajsir;

import java.util.Arrays;

public class differntwaytoprintarry {
	
	static int a[] = {10,20,30,40}; // single
	
	static int b[][]= {{10,20}, {30,40,50}};//double
	
	static int c[][][]= {{{10,20},{30,40}},{{50,60},{70,80}}};
	
	static String srt []= {"black", "white", "red"};
	
	
	
	public static void main(String[] args) {
		//Arrys.asList
		 String srt []= {"black", "white", "red"};// only use for nonprimitive type
		 int number2 []= {10,20,30,40};
		 
			for (int i=0; i<srt.length; i++) {  //using for loop
				System.out.print(srt[i]+ " ");
			}System.out.println();
		 
		//using Arrays.aslist
		 System.out.println("by using Array.asList method "+ Arrays.asList(srt)); 
		//using Arrays.toString
		 System.out.println("by using Array.toString method "+ Arrays.toString(number2));
		 
		//print 2d and 3d arryas by using Arrays.deepToString method
			System.out.println("by using Arrays.deepToString method "+ Arrays.deepToString(b));
			System.out.println("by using Arrays.deepToString method "+ Arrays.deepToString(srt));
		 
		 
		 
	for (int i=0; i<a.length; i++) {  //using for loop
		System.out.print(a[i]+ " ");
	}System.out.println();
	
	//static int b[][]= {{10,20}, {30,40,50}};//double
	for (int i=0; i<b.length; i++) {
		for(int j=0; j<b[i].length; j++) {
		System.out.print(b[i][j]+ " ");
		}System.out.println();
	}
	
	for(int i=0; i<c.length; i++) {
		for(int j=0; j<c[i].length; j++) {
			for(int k=0; k<c[i][j].length; k++) {
				System.out.print(c[i][j][k]+ " ");
			}System.out.println("\n");	
		}
	}

	for(int number : a) {              // using for each and enhance loop
		System.out.print(number+ " ");
	}System.out.println();
	
	
	
	}
	
	
	

}

