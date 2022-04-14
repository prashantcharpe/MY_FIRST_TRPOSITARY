package staticNONsataic;

public class staticorNONsatatic {
	int a;
	static int b;
	final static int c=10;
	private int d;
	
	void nonsataic() {
		
		a=10;
		d=10;
	    b=35;
	    System.out.println(c);
	}
	
	 static void staticmethod() {
		 staticorNONsatatic obj= new staticorNONsatatic();
		obj.a=35;
		obj.d=35;
		b=50;
		
		
	}
	
	 public static void main(String[] args) {
		 staticorNONsatatic obj= new staticorNONsatatic();
		 obj.nonsataic();
	}
	

}
