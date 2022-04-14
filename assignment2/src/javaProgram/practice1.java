package javaProgram;

public class practice1 {
	
	public static void main(String[] args) {
		sample obj = new sample();
		obj.test1();
		
		practice1 obj2 = new practice1();
		
		sample obj1 = obj2.returnSampleobj();
		obj1.test1();
		
		obj2.returnSampleobj().test1();
	}
	 
	public sample returnSampleobj() {
		sample obj = new sample();
		return obj;
	}
	
	public int addition() {
		int a=10, b=20;
		int sum = a + b;
		return sum;
	}
}

	class sample {
		public void test1() {
			System.out.println("testy 1 from practice1");
		}
		
	}


