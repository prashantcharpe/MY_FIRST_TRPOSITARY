package String;

public class reversString {

	public static void main(String[] args) {
		
		String a="my name is prashant";
		
		String b[]=a.split(" ");
		char c[] = a.toCharArray();
		
		for(int i=b.length-1; i>=0; i--) {
			System.out.print(b[i]+ " ");	
		}System.out.println();
		
		for(int i =c.length-1; i>=0; i--) {
				System.out.print(c[i]);
			
		}
		
	}
}
