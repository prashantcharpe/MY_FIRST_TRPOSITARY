package constructor.com;

public class ConstructorPractice1 {
	
	public int a;
	int b;
	boolean c;
	static int d;
	
	public ConstructorPractice1() {
		this(10, 20);
		System.out.println("I am in no parameter constructor " + a);
	}
	
	public void m1(int c) {
		System.out.println(" i am from m1 " + c );
	}
	
     /*ConstructorPractice1(int a) {
		this(30,20);
		System.out.println("I am one parameter constructor " + a);
	}*/
	
	 ConstructorPractice1(int a, int b){
		 this.a=a;
		 this.b=b;
		System.out.println("I am two parameter constructor " + (a+b) );
	}
	 
	public static void main(String[] args) {
		
		ConstructorPractice1 obj = new ConstructorPractice1();
		
		
		
		

		
	}
	

}
