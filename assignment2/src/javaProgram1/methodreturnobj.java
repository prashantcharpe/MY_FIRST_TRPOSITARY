package javaProgram1;

public class methodreturnobj {
	
	public static void main(String[] args) {
		
		//parent a = obj.getparentobject();
		
		//parent obj= new parent(); compile time error
	} 

}

class parent{
	
	private parent() {
		// TODO Auto-generated constructor stub
	}
	
	public static parent getparentobject() {
		
           parent obj = new parent();
		
		return obj;
		
	}
}