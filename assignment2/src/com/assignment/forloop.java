package com.assignment;

public class forloop {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i=1; i<=10; i++) {
			
			sum=sum + i;
			System.out.println("sum of first 10 natural number = " + sum);
		}/* now sum value is 0 and i value is 1 
		sum = sum + i / 0 + 1 = 1  1st iteration 
		now sum value is  1
		
		i value inc by 1 now i value is 2
		
		  then  now sum value is 1 and i value is 2
		sum = sum + i / 1 + 2 = 3  2nd iteration 
		now sum value is  3
		 
		 */
	}
}
 