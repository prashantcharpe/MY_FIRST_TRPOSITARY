package com.assignment2;

public interface vehicle {
	
	abstract void bike();
	
	abstract void car();
}


class run implements vehicle{

	@Override
	public void bike() {
		System.out.println(" bike is running");
		
	}

	@Override
	public void car() {
		System.out.println(" car is running");
	}
	public static void main(String[] args) {
		run obj = new run();
		obj.bike();
		obj.car();
	}
	
	
}