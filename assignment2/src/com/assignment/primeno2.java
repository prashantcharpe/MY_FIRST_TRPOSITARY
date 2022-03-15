package com.assignment;

public class primeno2 {
public static void main(String[] args) {
	
	
	int no=11;
	int temp=0;
	
	for(int i=2; i<no; i++) {
		 if(no%i==0) {
			 temp = temp +1;
		 }
	}   if(temp>0) {
		System.out.println("is not prime no");
	}else {
		System.out.println("is prime no");
	}
	
	
}
}
