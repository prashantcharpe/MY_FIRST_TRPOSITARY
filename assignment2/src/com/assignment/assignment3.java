package com.assignment;

public class assignment3 {

	protected static int a;
	protected static int b;
	
	protected static void multy() {
		System.out.println(" multy value = " + a*b);	
	}
	
	protected static void div() {
		System.out.println(" div value = " +a/b);	
	}
	
	public static void main(String[] args) {
      
                       a=10;
           assignment3.b=2;
          multy();
           assignment3.div();
           
	}

}
