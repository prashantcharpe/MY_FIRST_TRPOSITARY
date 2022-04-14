package methodoverriding;

public class AceesModifireOverriding {

	public void m1() {
		System.out.println("parent public a");
	}

	public void m1(int a) {
		System.out.println("parent public " + a);
	}

	static void m2() {
		System.out.println("parent defult ");
	}

	static void m2(int a) {
		System.out.println("parent default " + a);
	}

	private void m3() {
		System.out.println("parent private");
	}

	private void m3(int a) {
		System.out.println("parent private " + a);
	}

	protected void m4() {
		System.out.println("parent protected");
	}

	protected void m4(int a) {
		System.out.println("parent protected " + a);
	}
	
	public final void m5() {
		System.out.println("parent final public a");
	}
	
	public final void m5(int a) {
		System.out.println("parent final public a" + a);
	}

}

class access extends AceesModifireOverriding {

	public void m1() {
		System.out.println("child public a");
	}

	public void m1(int a) {
		System.out.println(" child public " + a);
	}

	static void m2() {
		System.out.println("child defult ");
	}

	static void m2(int a) {
		System.out.println("child default " + a);
	}

	private void m3() {
		System.out.println("child private");
	}

	private void m3(int a) {
		System.out.println("child private " + a);
	}

	protected void m4() {
		System.out.println("child protected");
	}

	protected void m4(int a) {
		System.out.println("child protected " + a);
	}
	
	/*
	 * public final void m5() { System.out.println("parent final public a"); }
	 * 
	 * public final void m5(int a) { System.out.println("parent final public a" +
	 * a); }
	 */
	
	

	public static void main(String[] args) {

		AceesModifireOverriding t = new AceesModifireOverriding();
		t.m1(10);
		t.m1();
		t.m2();
		t.m2(20);
		//t.m3();
		//t.m3(30);
		t.m4();
		t.m4(40);
		t.m5();
		t.m5(50);
		
		System.out.println();
		access t1 = new access();
		t1.m1(10);
		t1.m1();
		t1.m2();
		t1.m2(20);
		t1.m3();
	    t1.m3(30);
		t1.m4();
		t1.m4(40);
		
		
		
	}

	// private method cant override
	// static methodcant override
	//final method cant override
}