package abstractt;

public abstract class abstractt {

public abstractt() {
	
}
	public int a;
	private int b;
	protected int c;
	static int d;
    final int e = 10;
            
	public void m1() {
		System.out.println(" i am from m1");
	}
	
	public static void m3() {
		System.out.println(" i am from abstract m3");
	}
	public int m4() {
		System.out.println(" i am from m4");
		return a;
	}
	
  public abstract void m2();

  public abstract int m5();

  protected abstract int m6();

  
}

abstract class abstractt1 {

public abstractt1() {
	
}
	public int a;
	private int b;
	protected int c;
	static int d;
    final int e = 10;
            
	public void m1() {
		System.out.println(" i am from m1");
	}
	
	public static void m3() {
		System.out.println(" i am from abstract m3");
	}
	public int m4() {
		System.out.println(" i am from m4");
		return a;
	}
	
  public abstract void m2();

  public abstract int m5();

  protected abstract int m6();

  

 class car extends abstractt {

	 
		/*
		 * public int m4() { System.out.println(" i am from car m4"); return a;
		 }*/
		
	@Override
	public void m2() {
	System.out.println(" i am from m2");	
	}
	
	//public static void m3() {
	//	System.out.println(" i am from car m3");
	//}
	
	 void bmw() {
		System.out.println(" i am bmw car");
	}

	public static void main(String[] args) {
		/*car obj = new car();
		obj.m1();
		obj.m2();
		obj.bmw();
		obj.d=10;
		System.out.println(d);
		obj.a=20;
		obj.c=50;
		obj.m3();
		obj.m4();
		*/
		
	}

	@Override
	public int m5() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int m6() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
}