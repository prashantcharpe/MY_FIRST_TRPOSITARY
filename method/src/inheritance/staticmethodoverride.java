package inheritance;

public class staticmethodoverride {
	
	public static void m1() {
		System.out.println(" i am from parent");
	}
	
	public  void m2() {
		System.out.println(" i am from parent m2");
	}
	
	public staticmethodoverride() {
	System.out.println(" i am from parent class ");
	}
}

class childclassoverridingstaticmethod extends staticmethodoverride{
	
	public static void m1() {
		System.out.println(" i am from child");
	}
	public  void m2() {
		System.out.println(" i am from child m2");
	} 
	
	public childclassoverridingstaticmethod() {
		super();
		System.out.println(" i am from childclass");
	}
	
	public static void main(String[] args) {
		childclassoverridingstaticmethod obj = new childclassoverridingstaticmethod();
		obj.m1();
		
		staticmethodoverride obj2 = new staticmethodoverride();
		obj2.m1();
		
		staticmethodoverride obj3 = new childclassoverridingstaticmethod();
		obj3.m2();
		 m1();
	}
}