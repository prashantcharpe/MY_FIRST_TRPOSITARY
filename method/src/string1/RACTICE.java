package string1;

public class RACTICE {

	int a;
	static final int b;

	public RACTICE() {
		System.out.println(" i am constructor");
	}

	public void m1() {
		System.out.println(" i am m1");
	}

	public static void m2() {
		System.out.println(" i am m2");
	}

	public static void main(String[] args) {

		m2();

		RACTICE r = new RACTICE();

		r.m1();
	}

	static {
		b = 10;
		System.out.println(" i am static block = " + b);
	}
}
