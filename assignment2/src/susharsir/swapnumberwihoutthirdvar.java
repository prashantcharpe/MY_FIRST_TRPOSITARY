package susharsir;

import java.util.Scanner;

public class swapnumberwihoutthirdvar {
	
	
	public static void main(String[] args) {
		
		
		
		Scanner obj=new Scanner(System.in);
		System.out.println(" enter swaip number");
		int a=obj.nextInt();
		int b=obj.nextInt();
		
		System.out.println(" befor swaip number = "+ a + " " + b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println();
		System.out.println(" AFTER swaip number = "+ a + " " + b);
		
	}

}
