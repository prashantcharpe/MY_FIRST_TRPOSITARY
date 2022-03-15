package stringbuffer;

  public class stringbuffer {
   // need to use constructor to create the string buffer
	//it is mutable 
	// it is sychronized and thread sefe
	//it is has additional method like append means concatination,delete,insert to support manipilation
	//of straing
	
	public static void main(String[] args) {
		// to get the access of string buffer we need to create obj
		// obj with no parameter constructor
		StringBuffer str = new StringBuffer();
		System.out.println(str.length());
		
		// obj with string as  parameter constructor
		StringBuffer obj=new StringBuffer("this is testing ");
		System.out.println(obj.length());
		
		//stringbuffer specified method
		//Append----Append the new string in existing string
		//you have may append method based on which u have to append u can
		//foe ex if u want to append int value use append(int) method
		System.out.println(obj.append(45866222));
		System.out.println(obj.append(true));
		
		//delete will delete the string of specifi index
		System.out.println(obj.delete(0, 5));
		
		//deletecharAT will delete specific character like a, b, c
		System.out.println(obj.deleteCharAt(1));
		
		//inster method use from index and place string from that place
		System.out.println(obj.insert(5, "Example"));
		
		System.out.println(obj.replace(0, 10, "string"));
		
		System.out.println(obj.reverse());
	}

	
	
	
	
	
	
	
	
}
