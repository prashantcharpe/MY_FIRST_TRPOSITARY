package pkg3;

import pkg1.practice;

public class practice3{
	
	private   int a;
	          int b;
	protected int c;
    public    int d;
    
    public void m3() {
   	 
   	 System.out.println(a);
   	 System.out.println(b);
    	 System.out.println(c);
        System.out.println(d);
	} 
    public static void main(String[] args) {
   	 
    	 practice3 obj3=new practice3();
       	 obj3.a=10;
       	 obj3.b=20;
       	 obj3.c=30;
       	 obj3.d=40;
       	 obj3.m3();	
   	 
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
