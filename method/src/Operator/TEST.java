package Operator;

public class TEST {
	
	public static void main(String[] args) {
		
		TEST d = new TEST();
		d.m1();
        d.m2(100);
        d.m3(200);
		
	}
   protected void m1() {
	   System.out.println("m1");
   }
   
   public static int  m2( int a) {
	   System.out.println(a);
	   return a;
   }
    static int  m3( int a) {
	   System.out.println(a);
	   return a;
   }
    private static int  m4( int a) {
 	   System.out.println(a);
 	   return a;
    }
}
