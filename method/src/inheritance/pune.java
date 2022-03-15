package inheritance;

 class goa {
	 
	 int b;
	 float c;
	 
  public void m1(int b, int c) {
	  System.out.println(" m1 = " + (b+c));
  }
	public goa(int a) {
		System.out.println(" i am from goa " + a);
	}
	
	public goa() {
     this(10);
	 System.out.println(" i am no parameter constrcter");
}
 }
 
 public class pune extends goa {
	
	  public pune() {
	  super.m1(10,20);
	  super.b=20;
	  super.c=100;
	  System.out.println(b);
	  System.out.println(c);
		System.out.println(" i am from pune =");
	}
	  public void m2(int b){
		  super.b=b;
		  System.out.println(" m2 = " + super.b);
	  }
	public static void main(String[] args) {
	
		pune  c = new pune();
		c.m2(1000);	
	}
}
 