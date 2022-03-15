package encapsulation;

public class TYPECASTING {
	
	int var=10;
	
    long var1=var;  // int to long conversion 
  // this is implicit type casting or up or broad casting
    // this conversion done by compailer
    
    int var2=38;
   byte var3 = (byte) var2;  // long to int conversion 
    // this is explicit type casting or manual casting or down casting
    // this conversion manualiy way
    
    public static void main(String[] args) {
		
    	TYPECASTING c = new TYPECASTING();
    	System.out.println(c.var1);
    	System.out.println(c.var3);
    }
    
}
