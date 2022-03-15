package com.assignment2;

public interface animal {
	
	int a=10;  // in interface instant variable must be initialize
	           // we cant change value of int a bcoz in interface compailer creating
	    // default public final static in front of int a =10; due to final keyword
	
	 void eat();
}
 
  class cat implements animal {
	 
	 @Override
	public void eat() {
		System.out.println(" cat eating");	
	}
  }
  class dog implements animal {
	 
    @Override
    public void eat() {
    	System.out.println(" dog eating ");
	} 
    
    public static void main(String[] args) {
		cat a = new cat();
		a.eat();
		
		dog a1 = new dog();
		a1.eat();
	}
  
}  
 
  