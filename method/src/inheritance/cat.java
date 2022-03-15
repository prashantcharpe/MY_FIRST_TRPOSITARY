package inheritance;

 class aniaml {
	
	public void sound() {
		System.out.println("i am from animal class");
	}
 }
	   public class cat extends aniaml{
		 
		 public void sound() {
				System.out.println("meow meow");
			}
		 public static void main(String[] args) {
			 dog obj = new dog();
			 obj.sound();		 
	} 
	 }
        class dog extends aniaml{
		 public void sound() {
				System.out.println("bark bark");
			}
 }
