package pkg1;

public class practice {
	
	private int a;
	 int b;
	 protected int c;
     public int d;
     
     public void m1() {
    	 
    	 System.out.println(a);
    	 System.out.println(b);
     	 System.out.println(c);
         System.out.println(d);
	}
    	 
    	
     
     public static void main(String[] args) {
    	 
    	 practice obj=new practice();
    	 obj.a=10;
    	 obj.b=20;
    	 obj.c=30;
    	 obj.d=40;
    	 obj.m1();	
    	 
    	 
	}

}
