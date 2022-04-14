package javaProgram;

public class constructorchaining {
	
	public constructorchaining() {
		this(10);
		System.out.println(" c1 ");
	}
	
	public constructorchaining(int a) {
		this(10,20);
		System.out.println(a);
	}
	public constructorchaining(int a, int b) {
		this(10,20,30);
		System.out.println(a+b);
	}
	public constructorchaining(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		
		constructorchaining obj = new constructorchaining();
		
	}
	
	
	

}
