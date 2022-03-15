package pkg2;

import pkg1.practice;

public class practice2 extends practice{
	
	private   int a;
	          int b;
	protected int c;
    public    int d;
    
    public void m2() {
   	 
   	 System.out.println(a);
   	 System.out.println(b);
    	 System.out.println(c);
        System.out.println(d);
	} 
    public static void main(String[] args) {
   	 
   	 practice2 obj2=new practice2();
   	 obj2.a=10;
   	 obj2.b=20;
   	 obj2.c=30;
   	 obj2.d=40;
   	 obj2.m2();	
   	 
   	 practice obj=new practice(); // this class is import from pkg1

   	 obj.d=50;   //only public variable can visible in other pkg2
   	 System.out.println("D is public veriable pkg1 " + obj.d);
   	 
   	 obj.m1();// public method also access through import.
   //only public variable can access in other pkg1.
   	 //default variable cant access in other pkg1.
   	 //private variable cant access in other pkg1.
   	 //protected variable cant access in other pkg1. 
	}
}
