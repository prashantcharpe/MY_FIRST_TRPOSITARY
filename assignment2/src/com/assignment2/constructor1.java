package com.assignment2;

public class constructor1 {
	
	public constructor1() {
		System.out.println(" i am from no parameter constructor");
	}
 
	constructor1(int a,int b){
		System.out.println(" i am from two parameter constructor = "+ (a+b) );
	}

	public static void main(String[] args) {
		
	 constructor1 z = new constructor1();
	 constructor1 z1 = new constructor1(10, 20);
	}
}
