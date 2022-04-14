package susharsir;

public class stringtochar {

	
	public static void main(String[] args) {
		
		String s =" my name is prashant";
		char chararry[]= s.toCharArray();
		
		for( char c: chararry) {
			System.out.print(c + " ");
		} System.out.println();
		
		
		String p = "prashant";
		char d =p.charAt(2);
		System.out.println(d);
	}
	
}
