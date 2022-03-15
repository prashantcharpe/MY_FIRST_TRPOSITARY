package GarbageCollector;

public class garbagecollector {

	// JVM run Garbage collector
	// garbage collection process dosent happen instantly
	// which means once the object are ready for garbage collection they
	// must to have to wait for JVM to run memory cleanup proram that garbage
	// collection
	// u can reqst to JVM for grbage collection following;

	static garbagecollector obj;

	public static void main(String[] args) {
		// type 1
		// obj is not reachable
		obj = new garbagecollector();
		obj = null; // obj is not reachable

		// type 2
		// one refrence pointing to another refrence
		garbagecollector obj1 = new garbagecollector();
		garbagecollector obj2 = new garbagecollector();
	       	obj2 = obj1;

		// type 3
		// after object execution obj is ready for garbage collector
		garbagecollector obj3 = new garbagecollector();
		
		//it is only request. its dosent mean JVM will call gc
		System.gc();
		Runtime.getRuntime().gc(); //this inbuilt class 
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("12345788");
	}
}
