package naveen;

public class revINTEGER {

	public static void main(String[] args) {
		
		int num =12345;
		int rev=0;
		
		while(num!=0) {
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println(" rev number is = "+ rev);
	
		long num1 =144558555;
		
	    System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	
	
	}
}

