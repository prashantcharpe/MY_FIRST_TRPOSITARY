package com.assignment;

public class primeno {
	// natural number > 1
	// which is only 2 factors 1 and itself 
	// 19 => 1 and 19 => prime number
	// 28=> 1,2,4,7,14,28 => not prime no
	
	public static void main(String[] args) {
		int sum=0;
		//int b = 39;
		
		for(int i=0; i<=100; i++) {
			
			boolean flag=true; 
			
			for(int j=2; j<i; j++) {
			if (i%j==0) {
				flag= false;
			   break;
			}
		} 
		
		if(flag) {
			//sum=sum+i;
			System.out.println("is prime no = " + i);
		}else {
			System.out.println( " is not prime = " + i);
		}
		
	}//System.out.println("all prime no. sum= "+sum);
}
}
