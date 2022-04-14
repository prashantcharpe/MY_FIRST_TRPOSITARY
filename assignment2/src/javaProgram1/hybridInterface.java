package javaProgram1;

interface A{
	public void testa();
	public void testb();
	public void testc();
	public void testd();
}
abstract class SubB implements A {
	public void testa() {
		System.out.println("test-a");
	}
}
abstract class SubC extends SubB{
	public void testb() {
		System.out.println("test-b");
	}
}
 class SubD extends SubC{
	public void testc() {
		System.out.println("test-c");
	}
	public void testd() {
		System.out.println("test-d");
	}
	public static void main(String[] args) {
		// create object to class SubD
		SubD subdObj = new SubD();
		subdObj.testa();
		subdObj.testb();
		subdObj.testc();
		subdObj.testd();
	}
}

 interface  a{
	 public void m1();
}

 interface b extends a{
	 public void m2();
	}
 
 interface c extends a{
	 public void m3();
}



public class hybridInterface implements c, b {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}
