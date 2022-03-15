package Exception;

import GarbageCollector.garbagecollector;

public class Finalize {

	static garbagecollector obj;
	
	public static void main(String[] args) {
		
		obj = new garbagecollector();
		obj = null;
		
		//garbagecollector obj1 = new garbagecollector();
		//garbagecollector obj2 = new garbagecollector();
		//obj2 = obj1;
		
		//garbagecollector obj3 = new garbagecollector();	
	}
	
     @Override
     protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	System.out.println("11");
}

}
