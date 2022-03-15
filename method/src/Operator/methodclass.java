package Operator;

public class methodclass {

 int a;
 int b;
int c;

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		methodclass obj =new methodclass();
                    obj.a=10;
                    obj.b=20;
                    obj.c=30;
                    System.out.println(obj.a);
                    System.out.println(obj.b);
                    System.out.println(obj.c);
              obj.add(10, 20);
            		methodclass.add(10, 20, 30);
              int q =  obj.returnadd(25, 30);
              System.out.println(q);
	}
	
public int returnadd(int a, int b) {
	//System.out.println( "returnadd "+ (a+b));
	return a+b ;	
}
public void add(int num, int num2) {
	System.out.println("ADD " + (num + num2));
}
private static void add(long a, int b, int c) {
	System.out.println("add "+ (a+b+c));
}


}
