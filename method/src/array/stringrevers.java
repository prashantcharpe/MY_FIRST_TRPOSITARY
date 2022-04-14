package array;

public class stringrevers {

	public static void reversstring(){

		String a ="prashant charpe";
		String b [] = a.split(" ");
		//char b[]=a.toCharArray();

		for(int i=b.length-1; i>=0; i--){
		System.out.print(b[i]+ " ");
		}

		}

	static String  a="Prashant charpe";
	public static void main(String[] args) {
		
		reversstring();
		
		System.out.println();
		// TODO Auto-generated method stub
		
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(a.charAt(i));
		}
		
		System.out.println(" \n");
		int i=a.length()-1;
		
		while(i>=0) {
			System.out.print(a.charAt(i));
			i--;
		}
		
		System.out.println();
		int j=a.length()-1;
		do {
			System.out.print(a.charAt(j));
			
			j--;
			
		} while (j>=0);

	}
}
