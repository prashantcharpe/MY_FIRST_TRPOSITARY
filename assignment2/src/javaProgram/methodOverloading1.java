package javaProgram;

public class methodOverloading1 {
	
	public static void main(String[] args) {
		methodOverloading1 obj = new methodOverloading1();
    obj.addition();
    System.out.println(obj.addition(20.1f, 52.5f));
    System.out.println(obj.addition(125,58));
    obj.addition(15, 44, 78);
		
	}
	
	public int addition() {
		int a=10 , b=20;
		int sum = a+b;
		System.out.println(sum);
		return sum;
	}
	
	public int addition(int a, int b, int c) {
		System.out.println(a+b+c);
		return a+b+c;
	}
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	public float addition(float a, float b) {
		return a+b;
	}

}
