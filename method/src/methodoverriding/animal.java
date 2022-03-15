package methodoverriding;

 public class animal {
	
	public void sound() {
		System.out.println("i am from animal class");
	}
 }
	
	 class cat extends animal{
		 
		 public void sound() {
				System.out.println("meow meow");
			}
	 }
	 
    class dog extends animal{
    	
    
		 public void sound() {
				System.out.println("bark bark");
			}
		 
		 public static void main(String[] args) {
				 cat obj = new cat();
				 obj.sound();
	    	
		} 
     
 }
 
 
