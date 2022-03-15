package com.assignment;

public class SwitchStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int calculator = 4; 
		
		int a =10;
		int b= 2;
		
		switch(calculator) {
		 
		case 1 : System.out.println(" addition = " + (a+b)); break;
		
		case 2 : System.out.println(" subtraction = " + (a-b)); break;
		
		case 3 : System.out.println(" multiplication = " + (a*b)); break;
		
		case 4 : System.out.println(" division = " + (a/b)); break;
		
		case 5 : System.out.println(" reminder = " + (a%b)); break;
		
		default : System.out.println("this number of calculator not present");
		
		
		}
	}

}
