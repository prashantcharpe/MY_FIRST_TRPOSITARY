package methodoverriding;

 public abstract class animal {
	
	 abstract void addition (int a, int b);
	public void sound() {
		System.out.println("i am from animal class");
	}
 }
	
	 class cat extends animal{
		 
		 public void sound() {
				System.out.println("meow meow");
			}

		@Override
		void addition(int a, int b) {
			// TODO Auto-generated method stub
			
		}
	 }
	 
    class dog extends animal{
    	
    
		 public void sound() {
				System.out.println("bark bark");
			}
		 
		 public static void main(String[] args) {
				 cat obj = new cat();
				 obj.sound();
				
				 dog obj1 = new dog();
				 obj1.addition(10, 20);
		}

		@Override
		void addition(int a, int b) {
		 System.out.println(a+b);
			
		}

	} 
     
 
 
 
