package methodoverriding;

abstract class parent {

	 void m7() {
		System.out.println("parent public " );
	}

	public void m5() {
		System.out.println("parent public " );
	}

	public void m5(int a) {
		System.out.println("parent public " + a);
	}
	
	public static void m6() {
		System.out.println("parent public static " );
	}
	
	public static void m6(int b) {
		System.out.println("parent public static "  + b);
	}
	
	public abstract void m1();
	public abstract void m1(int a);
	
	// abstract static void m2();
	// private abstract void m3();
	//public final abstract void m1();
	
	protected abstract void m4();
	protected abstract void m4(int a);
	
	//we cant create static abstract method 
	//we cant create private abstract method 
	//we cant create final abstract method 
}

public class Accessmodifire {

}
