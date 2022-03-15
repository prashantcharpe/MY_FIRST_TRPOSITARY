package Operator;

public class calculator {
	
  public int add (int a, int b) {
	  return a+b;
  }
  
   int sub (int a, int b) {
	  return a-b;
  }
  
  private int multy (int a, int b) {
	  return a*b;
  }
  
  protected int div (int a, int b) {
	  return a/b;
  }
	
	
	public static void main(String[] args) {
		
		calculator c=new calculator();
		System.out.println(" add = " + c.add(10, 2));
		System.out.println(" sub = " +c.sub(10, 2));
		System.out.println(" multy = " +c.multy(10, 2));
		System.out.println(" div = " + c.div(10, 2));
	}
}
