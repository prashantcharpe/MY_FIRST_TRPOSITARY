package com.assignment2;

public class AA {
	 
	public int m1(int a) {
		System.out.println(" int = " +a);
		return a;
		
	}
	public double m1(double a) {
		System.out.println(" double = "+a);
		return a;
		
	}
	/*protected int m1(int a) {
		return a;
	} // if we change access modifier then duplicate method is showing */
	
public static void main(String[] args) {
	AA n = new AA();
	n.m1(10.5);
	
	n.m1(10);
}
}
