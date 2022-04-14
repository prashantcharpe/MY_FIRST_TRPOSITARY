package javaProgram1;

public class string1 {
	
	public static void main(String[] args) {
		
		String str = "There is garden and it is beautiful ";
		
		int size = str.length();
		System.out.println("int size " + size);
		
		char hc = str.charAt(0);
		System.out.println(hc);
		
		for(int i=0; i<size; i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println(str.indexOf('t'));
		System.out.println(str.lastIndexOf('i'));
		System.out.println(str.indexOf("is"));
		System.out.println(str.equals("garden"));
		System.out.println(str.contains("and"));
		System.out.println(str.startsWith("Th"));
		System.out.println(str.endsWith("ul."));
		System.out.println(str.length());
		
		String str2= "pune";
		System.out.println(str2.length());
		str2 = str2.trim();
		System.out.println(str2);
		
		String str3 = str.substring(9);
		System.out.println(str3);
		System.out.println(str.substring(9, 15));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		String result = str.concat(str2);
		System.out.println(result);
		
		String[] ar = result.split(" ");
		for(int i =0; i<ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		System.out.println(str.replace("r",  "O"));
		
		
	
		
	}

}
