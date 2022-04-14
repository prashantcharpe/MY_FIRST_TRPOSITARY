package javaProgram1;

import java.util.Arrays;

public class hightvalueusingsingleloop {
	public static void main(String[] args) {
		
	
	int [] k = {10,20,45,1,3,547,-2,2,45,-4556};
 int highest = Integer.MAX_VALUE;
 
 System.out.println("int mini value : " + highest);
 
 //for each loop
 for(int element : k) {
	 if(element<highest) {
		 highest=element;
	 }
 }
 System.out.println(" highest element is : " + highest);
 
 //forloop
 for(int i=0; i<k.length; i++) {
	 if(k[i]<highest) {
		 highest=k[i];
	 }
 }
 System.out.println(" highest element is : " + highest);
	
	// System.out.println(a[0]);

	
	 
	 
	 String a = "Love";  
     String b = "You";  
     System.out.println("Before swap: " + a + " " + b);  
     a = a + b;  //LOVEYOU
     System.out.println(a);
     b = a.substring(0, a.length() - b.length());  //0-4 B=LOVE
     a = a.substring(b.length());   // U
     System.out.println("After : " + a + " " + b);  
	 

	}
}
