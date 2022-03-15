package Operator;

public class ArthmaticOperators {

public static void main(String[] args) {
	ArthmaticOperators c=new ArthmaticOperators();
	c.add(10, 2);
	c.sub(10, 2);
	c.mul(10, 2);
	ArthmaticOperators.div(10, 2);
	ArthmaticOperators.modulus(10, 2);
	
}
 
 public void add(int a, int b) {
	 System.out.println("add " + (a+b));
	 
 }
  public void sub(int a, int b) {
		 System.out.println("sub " +(a-b));
 }
  public void mul(int a, int b) {
		 System.out.println("mul " +(a*b));
 }
  public static void div(int a, int b) {
		 System.out.println("div " +(a/b));
  }
  
  public static void modulus(int a, int b) {
		 System.out.println("mul " +(a%b));
  }

}
