package System;

import java.util.Scanner;

public class scannerExample {
	// to take value from console
	public static void main(String[] args) {
		
		//System.out.println(" please let me know which value i need to checkfor add/even");
	System.out.println("enter value");
       Scanner obj = new Scanner(System.in); //system.in use for get input value from console
      int var = obj.nextInt(); //next use for which type of deta u want like,int,long etc
      
       if (var%2==0) {
       System.out.println(" number is even = " + var );
       }else {
      System.out.println("number is odd = " + var);
       }
       System.out.println(" please enter string value for nextline ");
       obj.nextLine();
       String var3=obj.nextLine();//this use for double name
       System.out.println(" double character " + var3);
       System.out.println(" please enter string value");
       String var2=obj.next(); //this use for single name 
        
       System.out.println("single character " + var2);
      
	
	}
	

}
