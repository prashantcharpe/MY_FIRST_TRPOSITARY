package javaProgram;


class D  {
	public D(int a, int b) {
		super();
		System.out.println(" Default con A");
	}
}

class E extends D {
	public E(int a, int b) {
		super(10,20);
		System.out.println(" Default con B");
	}
}

class F extends E {
	public F() {
		//CALL E CONS
		super(10,20);
		System.out.println(" Default con C");
	}
}

public class constructorChaining2 extends C {
	
	public constructorChaining2() {
		super();
		System.out.println(" Default con constructorChaining1");
	
	}
	
	public static void main(String[] args) {
		constructorChaining2 obj = new constructorChaining2();
	}

}