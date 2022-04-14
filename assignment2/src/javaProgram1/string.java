package javaProgram1;

public class string {

	public static void main(String[] args) {
		  
		String str1 = new String("pune");
		String str2 = new String("pune");
		String str3 = "pune";
		String str4 ="pune";
		String str5 = str1;
		String str6= str3;
		String str7 = str2;
		String str8 = str7;
		
		System.out.println(str1.equalsIgnoreCase(str8));
		System.out.println(str1==str2);
		System.out.println(str1.equalsIgnoreCase(str4));
		System.out.println(str1==str4);
		
		
	}
}
