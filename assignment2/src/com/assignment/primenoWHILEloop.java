package com.assignment;

import java.util.Scanner;

public class primenoWHILEloop {

	public static void main(String[] args) {
		
	
			Scanner sn=new Scanner(System.in);
			System.out.println("plz enter no.");
			int a=sn.nextInt();
			int b=a;
			int i=2;
			boolean flag=false;
			while(i<b) {
				
				
				if(b%i==0) {
					
					flag=true;
					break;
				}
				i++;
			}
			
			if(!flag) {
				System.out.println("no. is prime");
			}else {
				System.out.println("no. is NOT prime");
			}
	}
}
