package javaProgram1;

public class trycatch {

	public static void main(String[] args) {
		trycatch name = new trycatch();
		int d = name.division(10, 0);
		System.out.println(d);
		
	}
	
	
	public int division (int a, int b) {
		 
	 int [] ar = {10,20,30}; 
	 int div=0;
	 String srt = " pune";
	 //this are all runtime exception or checked exception
	 try {
	 div = a/b;
	 System.out.println(ar[3]);
	 System.out.println(ar[0]);
	 System.out.println(srt.charAt(5));
	 } 
	 catch(ArithmeticException e) {
      System.out.println(" exception handle");	 
	 }catch(ArrayIndexOutOfBoundsException e) {
	      System.out.println(" exception handle");	 
		 }
	 catch(StringIndexOutOfBoundsException e) {
	      System.out.println(" exception handle");	 
		 }
	 
	 System.out.println(ar[1]);
	 return div;
	 
	
	}
	
}
