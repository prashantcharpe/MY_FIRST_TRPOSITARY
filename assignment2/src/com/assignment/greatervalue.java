package com.assignment;

public class greatervalue {
	public static void main(String[] args) {
		
		greatervalue z=new greatervalue();
		z.swaip();
		z.swaip1();
		
		int a= 10;
		int b =20;
		
		float c =10.05f;
		float d =20.00f;
		 
		if (a<b) {
			System.out.println(" b " + b + " is greater value than a");
		}
		System.out.println(" multiplication of two floating value " + (c * d ));
	} 
	
	public void swaip() {
		int e =20;
		int f=30;
		int g;
		
		g=e;
		e=f;
		f=g;
		
		 System.out.println(" f " + f);
		 System.out.println(" e " + e);
	}
	public void swaip1() {
		int e =20;
		int f=30;
		
		e=e+f;
		f=e-f;
		e=e-f;

		 System.out.println(" f1 " + f);
		 System.out.println(" e1 " + e);
	}

}
