package com.assignment;

public class assignment2 {
	
	public float a;
	public float b;
	public float c;
	public float d;
	
	
	public void m1() {
	System.out.println("m1 add is = " +(a+b));
	}
	
	public void m2() {
		System.out.println("m2 add is = " +(c+d));
		}

	public static void main(String[] args) {
		assignment2 c = new assignment2();
		c.a=10.5f;
		c.b=20;
		c.d=30;
		c.d=40.5f;
		c.m1();
		c.m2();
	}

}
