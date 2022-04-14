package pravinprcice;

public class ReversNumber {

	public static void reversnumbber() {
		
		int num = 121;
		int b = num;
		int rev=0;
		int reminder;
		
		for(; num>0;) {
			reminder=num%10;
			rev=(rev*10)+reminder;
			num=num/10;
		}
		if(b==rev) {
			System.out.println("this is palindrom or armstrong no or revers no");
		}else {
			System.out.println("this is not palindrom or armstrong no or revers no");
		}
	}
	
	public static void main(String[] args) {
		reversnumbber();
	
		int factorial=1;
		
		for(int i=1; i<=5; i++) {
			factorial = factorial *i;
			System.out.println(factorial);
		}
	}
}
