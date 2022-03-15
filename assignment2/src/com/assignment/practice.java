package com.assignment;


public class practice {
	
}
class Y extends practice	{
	
} 
class Z extends Y{
	
}

class main{
	static void overloadmethod(practice x) {
		System.out.println("one");
	}
	static void overloadmethod(Y y) {
		System.out.println("two");
	}
	static void overloadmethod(Z z) {
		System.out.println("three");
	}
	


	public static void main(String [] args) {
  
		Z z =new Z();// only print three not one or two
		 Y y =new Y();// only print two not one or three
		 practice x =new practice();// only print one not three or two
	
		 overloadmethod(x); 
		 
	}
		
}