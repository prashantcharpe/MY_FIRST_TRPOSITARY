package array;

public class practice {
	
	static String a= "prashant";
	
	public static void main(String[] args) {
		
		for(int i=a.length()-1; i>=0; i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
		
		int i=a.length()-1;
		while(i>=0) {
			System.out.print(a.charAt(i));
			i--;			
	}System.out.println();
	
		int j=a.length()-1;
		do {
			System.out.print(a.charAt(j));
			j--;
		} while (j>=0);
	}
		
		

}
