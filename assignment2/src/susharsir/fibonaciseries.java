package susharsir;

public class fibonaciseries {
	
	public static void main(String[] args) {
		
		int a=0, b=1, c;
		
		for(; a<=100;) {
			System.out.println(" addition of previous numner = "+a);
			
			c=a+b;
			a=b;
			b=c;
		}
	}

}
