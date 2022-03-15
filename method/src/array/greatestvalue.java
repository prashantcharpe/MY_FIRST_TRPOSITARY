package array;

import java.util.Arrays;

public class greatestvalue {
	
	static int arry[]= {2,7,9,5,1,4};
	
	public static void main(String[] args) {
	 int p;
		for(int i=0; i<arry.length; i++) {
			for(int j=i; j<arry.length; j++) {
				if (arry[i]<arry[j]) {
				     p = arry[i];
					arry[i]=arry[j];
					arry[j]=p;
				}
			}
		}
		System.out.println("greatest element in aary = " + arry[0]);
	
	Arrays.sort(arry);
	for( int i=0; i<arry.length; i++) {
		System.out.print(arry[i]+ " ");
	}
	
	
	
	
	
	}
}
