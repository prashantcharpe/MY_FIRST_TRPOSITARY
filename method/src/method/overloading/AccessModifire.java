package method.overloading;

public class AccessModifire {

	public static void m1() {
		System.out.println("public a");
	}

	public static void m1(int a) {
		System.out.println("public a" + a);
	}

	static void m2() {
		System.out.println("defult ");
	}

	static void m2(int a) {
		System.out.println("default " + a);
	}

	private static void m3() {
		System.out.println("private");
	}

	private static void m3(int a) {
		System.out.println("private " + a);
	}

	protected static void m4() {
		System.out.println("protected");
	}

	protected static void m4(int a) {
		System.out.println("protected " + a);
	}
	
	public final static void m5() {
		System.out.println("public final a");
	}

	public final static void m5(int a) {
		System.out.println("public final " + a);
	}
	
	public static void main(String[] args) {
		AccessModifire.m1();
		AccessModifire.m1(10);
		AccessModifire.m2();
		AccessModifire.m2(20);
		AccessModifire.m3();
		AccessModifire.m3(30);
		AccessModifire.m4(40);
		AccessModifire.m4();
		AccessModifire.m5();
		AccessModifire.m5(50);
	}
}
