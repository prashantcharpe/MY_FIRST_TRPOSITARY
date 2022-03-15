package naveen;

public class StringManipulation {

	public static void main(String[] args) {
		
		String str = "The rains have started heres";
		String str1 = "The rains have started heres";
		String str2 = "The rains Have started heres";
		String str3 = " The rains ";
		
	System.out.println(str.length());
	System.out.println(str.charAt(5));  //used for finding which char value present in this index position
	System.out.println(str.indexOf('n')); //used for finding char index position
	System.out.println(str.indexOf('s', str.indexOf('s')+1 ));
	System.out.println(str.indexOf('s',9));
	System.out.println(str.indexOf("have"));
	System.out.println(str.indexOf("hello")); //if string is not available then output is  -1
	System.out.println(str.equals(str1));
	System.out.println(str.equalsIgnoreCase(str2));
	System.out.println(str.substring(4, 10));  //substring use for u can get string from where u want like rains trough index 
	System.out.println(str3.trim()); //used for remove space from start and end position
	
	String date="10/10/2201";
	System.out.println(date.replace("/", "-"));
	
	String test[] = str.split(" ");
	for(int i=0; i<test.length; i++) {
		System.out.println(test[i]);
		}
	System.out.println(str.concat(str3));
	
	String x="hello";
	String y= " world";
	
	
	
	
	
	
	}
}
