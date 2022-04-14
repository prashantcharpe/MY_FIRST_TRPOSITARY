package javaProgram;

public class methodhiding extends parent {

	public static void m1() {
		System.out.println(" i am  static from child");
	}

	public void m2() {
		System.out.println(" i am from child m2");
	}

	public static void main(String[] args) {
		//this implicit upcating its not compile time erro
		methodhiding obj = new methodhiding();
		obj.m1();
		obj.m2();
		System.out.println();
		
		parent obj3 = new parent();
		obj3.m1();
		obj3.m2();
		
		System.out.println();
		//this implicit downcasting
		//parent <------------ child
		parent obj1 = new methodhiding();
		obj1.m1();
		obj1.m2();
		
		System.out.println();
		
		//this implicit downcasting its give compile time error
		//methodhiding obj2 = new parent();
		//obj2.m1();
		//obj2.m2();
	
		//this explicitly downcasting its not give compile time error
		methodhiding obj2 = (methodhiding)obj1;
		obj2.m1();
		obj2.m2();
	}
}

class parent {

	public static void m1() {
		System.out.println(" i am static from parent m1");
	}

	public void m2() {
		System.out.println(" i am from parent m2");
	}
}