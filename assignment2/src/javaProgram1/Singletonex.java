package javaProgram1;

public class Singletonex {

	public static void main(String[] args) {
		 
		parent2 obj1 = new parent2.getparentobject();
		System.out.println(obj1.x);
		obj1.x=500; 
		System.out.println(obj1.x);
		
		parent2 obj2 = new parent2.getparentobject();
	}
}

class parent2{
	
	static parent2 obj = null;
     int x = 100;
     private parent2() { 
     }
     
     
     public static parent2 getparentobject() {
    	 if(obj==null) {
    		 obj= new parent2();
    	 }
		return obj;	 
     }
}