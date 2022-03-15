package com.assignment2;

public interface tree {
	
	public void mangotree();
	
	public void mangotree (int a);
	
	public void mangotree(int a, int b);

}

class appletree implements tree{
	
	  @Override
	public void mangotree() {
		System.out.println(" no mango is available");
	} /*we can implement one method but jvm showing erroe massage like
		add other unimplements method */

	@Override
	public void mangotree(int a) {
		// TODO Auto-generated method stub	
	}

	@Override
	public void mangotree(int a, int b) {
		// TODO Auto-generated method stub
		
	} 
}
	

class lemonstree extends appletree{
	
	@Override
	public void mangotree(int a) {
		System.out.println(" one prarameter in this tree " +a+ " manog available");
		
	}
	@Override
	public void mangotree(int a, int b) {
		System.out.println(" two prarameter in this tree " +(a+b)+ " manog available");
		
	}public static void main(String[] args) {
		
		lemonstree c1 = new lemonstree();
		c1.mangotree();
		c1.mangotree(100);
		c1.mangotree(100, 100);
		
	}
	
}