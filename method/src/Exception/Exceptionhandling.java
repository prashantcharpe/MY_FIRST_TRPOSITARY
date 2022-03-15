package Exception;


/*In this example we are having two methods M1 and M2
M2 is throwing exception */
public class Exceptionhandling {
	
	int [] a;
	public static void main(String[] args) {
		 
	Exceptionhandling obj = new Exceptionhandling();
	// Creating object of class ExceptionExample and calling M1 method
	// so Main method is called method for M1
	obj.m1();
	System.out.println("i am from main");
	}
	
	/*
	 *Checked Exception - Which compiler force you to handle the exception
	 * FileNotFoundException is one of the type checked exception
	 * If you try to read a file then there is possibility that file is not found  
	 * Compiler force you to handle it through try catch or request to apply throws
	 * try { 
	 * 	FileReader obj1=new FileReader(new File(""));
	 *  
	 * }
	 * 
	 * catch (FileNotFoundException e) { 
	 * e.printStackTrace(); }
	 */
	
	
	public void m1() {
		//Here M2 is called by M! method so M1 is become caller method for M2
		m2();
		System.out.println(" i am from m1");
	}
	 public void m2() {
		 // new ArithmeticException().printStackTrace();
		// when you really have exception 
		
		System.out.println(" i am from m2");
		//unchecked 
	try {	
		
		//NULL POINTER EXCEPTION 
		//	System.out.println(a.length);  
		// Array initialization is mandatory before use 
		//ARITHMETIC EXCEPTION --- M2 method will create exception object---Arithmetic 
		try {	
		  System.out.println(10/0);
		
		// It will not execute any statement which are in try block as above statement will throw exceptions
		  //that is reason it is recommended to put only risk code within the try block
		  System.out.println("This is within the try after exception"); //this will not be executed
	    }
	   // When you write multipe catch block then child class should be written first
	catch(ArithmeticException  p) {
		System.out.println(" finally i cougth the exception");
	}
	 System.out.println(a.length);
	}
	
	  // When you write multipe catch block then child class should be written first
	  catch (ArithmeticException p) { ////ARITHMETIC EXCEPTION
	  System.out.println("I am arithmetic exception"); }
	  
	  catch (ArrayIndexOutOfBoundsException  k) {
	  
	  }
	  // This is parent class exception 
	  catch (Exception p) { //p.printStackTrace(); //ARITHMETIC EXCEPTION
		  System.out.println(p.toString());
		  System.out.println("Finally i caugth the exception"); 
		  }
	 
	  //finally block always execute whether there is exception or not 
	 finally {
		System.out.println("this block is to release the resource at any cost");
	}
	    //unwanted event which terminate normal flow of execution
	}
}
