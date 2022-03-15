package naveen;

public class StringRevrs {

	public static void main(String[] args) {
		
		String a= "prashant";
		String rev="";
		for(int i=a.length()-1; i>=0; i--) {
			rev=rev+a.charAt(i);
		}System.out.println(rev);
	
	StringBuffer obj = new StringBuffer(a);
	System.out.println(obj.reverse());
	

	}
}
