package com.assignment;

public class multiplicatonofnumber {
	
	public static void main(String[] args) {
		
		int table =1;
		for (int i=1; i<=10; i++) {
			for(int j=1; j<=i; j++)
			
			System.out.print(table * j+" ");
		}System.out.println();
		
     /* table variable value is 2 and i is 1 
        2 * 1= 2
        2 * 2 = 4   table variable value is constant but i value is
        inc by 1 up to 10 
      */
		
        /*  for (int i=2; i<=10; i+=2) we can do also by by another method 
			System.out.println(i);
			
			
			 for (int i=1; i<=10; i*=2) we can do also by by another method 
			System.out.println(i);
		*/
		
		
	} 

}
