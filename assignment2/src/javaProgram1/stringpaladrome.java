package javaProgram1;

public class stringpaladrome {

	public static void main(String[] args) {
		String art = "aba";
		String rev="";
		
		for(int i=art.length()-1; i>=0;  i--) {
			rev = rev +art.charAt(i); 
		}if(rev.equals(art)) {
			System.out.println("this is paladrome");
		}else {
			System.out.println("this is not paladrome");
		}
		
	}
	
	
	
}
