package CollectionList;

import java.util.ArrayList;

import Exception.Finalize;

public class practice {

	
	
	
	

	public static void main(String[] args) {
		
		practice name = new practice();
		
		
			name.finalize();
		
		
	 ArrayList<Object> obj = new ArrayList<Object>();
	
	 obj.add("");
	 obj.add(12);
	 obj.add(12);
	 obj.add(11);
	 obj.add(1100);
	 obj.add(155);
	 obj.add(null);

	 System.out.println(obj.get(0));
	 System.out.println(obj.hashCode());
	 
	 System.out.println(obj.equals(obj));
	 System.out.println(obj.getClass());
	//System.out.println(obj.set(4, 'P')); //REPLACE
	 //obj.add(3, 10);
	 
	System.out.println(obj.indexOf(1100)); // SHOWING INDEX VALUE OR POSITION
   System.out.println(obj.lastIndexOf(155));
	System.out.println(obj.contains(11));
	
	
	 System.out.println(obj);
	}
	
	@Override
	protected void finalize() {
		
		System.out.println("i am called before garbage collector");
	}
	
}
