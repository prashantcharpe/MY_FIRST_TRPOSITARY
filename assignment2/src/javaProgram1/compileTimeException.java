package javaProgram1;

public class compileTimeException {
	
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			 	
			try {
				
				Thread.sleep(1000); //compile time exception
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		int a=10, b=0;
		
		try {
		int div = a/b;
		}catch(ArithmeticException e) {
		}
		finally {
			 int div = 50/0; //this is ArithmeticException
			 System.out.println(div); // this not print 
			System.out.println(" this finally block executed ither exception handle or  not");
		}
		
	}

}
