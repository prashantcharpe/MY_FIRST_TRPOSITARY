package method.overloading;

public class methodoverloading {

	public static void main(String[] args) {
		
		methodoverloading c= new methodoverloading();
	       c.add();
	       c.add(10,20);
	       c.add(10,20,30);
	       c.add(10, 20, 30.0f);
	       c.add(10.5f, 30, 50);
	   
	
	}
	
	public int add () { // no parameter
		 int a= 10;
		 System.out.println(a);
		 return a;
	}
	protected  int add (int a, int b) {  //  parameter 
		
		 System.out.println(" add value of a + b = "+ (a+b));
		 return a+b;
	}
	private  int add (int a, int b, int c) { // no of parameter change
		 
		 System.out.println(" add value of a + b = "+ (a+b+c));
		 return a+b+c;
	}
	 float add (int a, int b, float c) { //deta type is change 
	
		System.out.println(" add value of a + b = "+ (a+b+c));
		 return a+b+c;
	}
	  float add (float a, int b, int c) { //position of data type is change
	
		System.out.println(" add value of a + b "+ (a+b+c));
		 return a+b+c;
	}

}
