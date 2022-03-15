package com.assignment;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		/*a series of numbers in which each number 
		  ( Fibonacci number ) is the sum of the two preceding 
		  numbers. The simplest is the series 1, 1, 2, 3, 5, 8, etc.
		 */
	int b=1, c;
		
		for(int a=1; a<=100;) { // infinity
		
			System.out.println(a);
			c=a+b;      //c=2     c=3   c=5
			a=b;        //a=1     a=2   a=3
		  b=c;	         //b=2    b=3   b=5
		}
		
	/*	int a=0, b=1 , c;
		
		while(a>=0)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
		int a=0, b=1 , c;
		do {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}while(a>=0); */
		
		
	}
}
