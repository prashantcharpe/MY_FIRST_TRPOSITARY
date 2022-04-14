package javaProgram;

abstract public interface INTERFACE {

	abstract public int addition();
	public void test();
	
	default int sub(int a) {
		System.out.println(a);
		return a;
	}
	 static int sub1(int a) {
		System.out.println(a);
		return a;
	}
	 
	 static void sub2(int a) {
			System.out.println(a);
		}
	 
	 default void sub3(int a) {
			System.out.println(a);
		}
	 
	 public static void main(String[] args) {
		 
		 
		 interex obj =new interex() {
			
			@Override
			public int addition() {
				int a= 10, b=20;
			return a+b;
			}
			
			@Override
			public int muiti() {
				int a= 10, b=20;
				return a*b;
			}
			
			
			@Override
			public int division() {
			int a= 10, b=20;
			return a/b;
			}
		};
	}
}

interface interex {
	
	public int addition();
	public int muiti();
	public int division();
	
}

class a implements interex{
	
 public static void main(String[] args) {
		 
	 a name = new a();
	 name.addition();
		 interex obj =new interex() {
			
			@Override
			public int addition() {
				int a= 10, b=20;
			return a+b;
			}
			
			@Override
			public int muiti() {
				int a= 10, b=20;
				return a*b;
			}
			
			
			@Override
			public int division() {
			int a= 10, b=20;
			return a/b;
			}
		};
	}

@Override
public int addition() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int muiti() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public int division() {
	// TODO Auto-generated method stub
	return 0;
}
}