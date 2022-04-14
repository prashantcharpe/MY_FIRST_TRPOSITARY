package javaProgram;



class A extends Object {
	public A() {
		super();
		System.out.println(" Default con A");
	}
}

class B extends A {
	public B() {
		super();
		System.out.println(" Default con B");
	}
}

class C extends B {
	public C() {
		super();
		System.out.println(" Default con C");
	}
}

public class constructorChaining1 extends C {
	
	public constructorChaining1() {
		super();
		System.out.println(" Default con constructorChaining1");
	
	}
	
	public static void main(String[] args) {
		constructorChaining1 obj = new constructorChaining1();
	}

}