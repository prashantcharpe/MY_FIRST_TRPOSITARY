package abstractt;

public interface AA {

	  void add(); 
	  int c=50;
	 
	
	default void add1(){
		int a=10;
		int b=20;
		System.out.println(a+b);
		}
	
	static void add3(){
		int a=30;
		int b=40;
		System.out.println(a+b);
	}
}

 interface zz {

	  void add(); 
	  int c=50;
	 
	
	default void add1(){
		int a=10;
		int b=20;
		System.out.println(a+b);
		}
	
	static void add3(){
		int a=30;
		int b=40;
		System.out.println(a+b);
	}
}

 class base {

	/*
	 * @Override public void add() { // TODO Auto-generated method stub }
	 * 
	 * public void sub() { // TODO Auto-generated method stub }
	 * 
	 * @Override public void add1() { // TODO Auto-generated method stub
	 * zz.super.add2(); }
	 */
	/*
	 * @Override public void add1() { AA.super.add1(); }
	 */
	public void m10() {
		System.out.println("m10");
	}
}

class bb extends base implements AA,zz{

	@Override
	public void add() {
		// TODO Auto-generated method stub
	}

	@Override
	public void add1() {
		// TODO Auto-generated method stub
		add1();
	}

	public static void main(String[] args) {
		 
	}

}


	


