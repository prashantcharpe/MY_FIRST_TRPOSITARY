package javaProgram;

public class ABSTRACTCLASS {
	
	Parent4 obj = new Parent4() {

		@Override
		public int addition(int a, int b) {
			System.out.println(a+b);
			return 0;
		}

		@Override
		public void test2() {
			// TODO Auto-generated method stub
			
		}};
		
	public static void main(String[] args) {
		ABSTRACTCLASS obj1= new ABSTRACTCLASS();
		obj1.obj.addition(10, 20);
		
		obj1.obj.test1();
		
		Parent5 obj = new Parent5(){

			@Override
			public void test2() {
				// TODO Auto-generated method stub
				
			}};
		obj.test3();
		
		
	}
	

}

abstract class Parent4{
	
	
	public void test1() {
		System.out.println("test 1");
	}
	
	abstract public int addition(int a, int b);
	
	abstract public void test2();
}

abstract class Parent5{
	
	public void test3() {
		System.out.println("3");
	}
	abstract public void test2();
}

