package Map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeakHashMapExample {
	
public static void main(String[] args) {
	
	//creating object of Test classs
	Test t1 = new Test();
	HashMap <Test, String> obj = new HashMap<Test, String>();
	obj.put(t1, "prashant");
	System.out.println(obj);
	t1=null;
	//we call garbage collector to relase object memory
	//but GC not call in hashmap
	//bcoz hashmap has control on gc
	System.gc();
	System.out.println(obj);
	System.out.println("*************************hashmap***************************"+"\n");
		
	Test t2 = new Test();
	WeakHashMap <Test, String> obj1 = new WeakHashMap<Test, String>();
	obj1.put(t2, "prashant");
	System.out.println(obj1);
	t2=null;
	//we call garbage collector to relase object memory
	// GC is call in weakhashmap
	//bcoz weakhashmap has no control on GC
	//before call GC finalize method call
	System.gc();
	System.out.println(obj1);
	System.out.println("*************************Weakhashmap***************************"+"\n");
}
}

class Test{
	
	public String toString() {
		return "Test";
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("this is finalize method of the Test class");
	}
}

	


