package com.assignment2;

public class A {
}
class B extends A{
	
}
class C extends B{	
}

class mainclass{
	
	static void overloadmethod(A a) {
		System.out.println(" one ");
	}
	static void overloadmethod(B b) {
		System.out.println(" two ");
	}
	static void overloadmethod(C c) {
		System.out.println(" three ");
	}
	 public static void main(String[] args) {
		
		 C c =new C();// only print three not one or two
		 B b =new B();// only print two not one or three
		 A a =new A();// only print one not three or two
		
	 overloadmethod(c);
	 overloadmethod(b);
     overloadmethod(a); }
	 
}
	 
	