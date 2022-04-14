package javaProgram;

public class encapsulation {
	
	public static void main(String[] args) {
		PARENT2 obj = new PARENT2();
		int a1 = obj.getA();
		System.out.println(a1);
		System.out.println(obj.getA());
		
	     System.out.println(obj.setA(15));
		
		
		
		
		
	}

}

class PARENT2{
	private int a=10, b=20;
	
	public int  getA() {
		return a;
	}
	
	public int setA(int a) {
		this.a=a;
		return a;
	}
}