package com.assignment2;

public class parent {
	
	public void bike() {
		System.out.println(" this is parent bike ");
	}
}

class child extends parent{
	
	@Override
	public void bike() {
		System.out.println(" this is child bike");
	}
	
	public static void main(String[] args) {
		
		child name = new child();
		name.bike();
	
		
		/*
		 * parent name1 = new parent(); name1.bike();
		 */
		
	}
}
