package com.assignment2;

public interface datatype {
	
	void primitve();

}

interface types extends datatype {
	
	@Override
	default void primitve() {
		System.out.println(" primitive this is type of datatype");
	}
	
	default void nonpremitive() {
		System.out.println("nonpremitive this is type of datatype");
	}
	public static void main(String[] args) {
		
	/*	types c= new types() {};
		
		c.primitve();
		c.nonpremitive();
	}*/
}
}
