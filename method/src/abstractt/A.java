package abstractt;

public interface A  {
	
	// abstract method 
	void add(int a, int b);
	// compiler will cover public abstract void add() 

	// DEFAULT METHOD
	default void sub(int a, int b) {
		System.out.println(a-b);
	}
	static void multi(int a, int b) {
		System.out.println(a*b);
	}
}
 interface B {
	 
	// abstract method 
		void add(int a, int b);
		// compiler will cover public abstract void add() 
       
		// DEFAULT METHOD
		default void sub(int a, int b) {
			System.out.println(a-b);
		}
		static void multi(int a, int b) {
			System.out.println(a*b);
		}
 }
 
 class main implements A,B{
	 
	 //both interface is having same abstract method but while implementing u need have only one implemintaion
	 @Override
	public void add(int a, int b) {
		 System.out.println(" ADD = "+ ( a+b)); 
	}
  
    @Override
    public void sub(int a, int b) {
    	System.out.println(" sub = " +(a-b));
   }
    public static void main(String[] args) {
    
     main n = new main();
     n.add(10, 10);
     n.sub(20, 10);
     A.multi(10, 20);
     B.multi(10, 20);
    
	}
	 
 }
 