package javaProgram1;

 class AA {
	public void test1() {
		System.out.println("test1");
	}
}

 class BB extends AA {
	 public void test2() {
			System.out.println("test2");
		}	
 }
 
 class CC extends BB{
	 public void test3() {
			System.out.println("test3");
		}	
 }


public class INHERITANCE {
 
	public static void main(String[] args) {
		CC name = new CC(); 
		name.test1();
		name.test2();
		name.test3();
		
	   AA name1 = new CC();  //upcsting 
	   name1.test1();
	   //name1.test2();  //crate test2
	   
	   BB name2 = new CC();
	   name2.test1();
	   name2.test2();
	   //name2.test3();  //crate test3
	   
	   BB name3 = (BB) name; //expicitly casting
	   name3.test1();
	   name3.test2();
	   //name3.test3();  //crate nethod test3
	}
	
}
