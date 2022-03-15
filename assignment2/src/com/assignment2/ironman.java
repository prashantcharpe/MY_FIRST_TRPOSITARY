package com.assignment2;

public interface ironman {
	
	default void endgame(){
		System.out.println(" ironman is  part  of endgame ");
	}
	
}
 interface spiderman {
	 
	 int loki = 20;

	 
	 default void endgame() { 
		 System.out.println(" spiderman also is part of endgame");
	 }
}

 class infinitywar implements ironman,spiderman {

	@Override
	public void endgame() {
		// TODO Auto-generated method stub
		ironman.super.endgame();
		spiderman.super.endgame();
	}
	
	 public static void main(String[] args) {
		 infinitywar c = new infinitywar();
		 c.endgame();
		
	 }
	

 }