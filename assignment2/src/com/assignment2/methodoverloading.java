package com.assignment2;

public class methodoverloading {
	
public void m1(int a, int b) {
	System.out.println(" m1 = "+ (a+b));
}

public double  m2(double e, int d) {
	return e+d;
}

public void m3(double a, float b, int c) {
	System.out.println(" m1 = "+ (a+b+c));
}
public static void main(String[] args) {
  methodoverloading c = new methodoverloading();
  
      c.m1(10, 10);
      
      System.out.println(" m2 = " + c.m2(10.5, 20));
      
      c.m3(20.5, 10, 20);
      
}
	
} 
