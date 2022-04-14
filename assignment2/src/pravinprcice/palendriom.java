package pravinprcice;

public class palendriom {
	
	public static void palindromn(int a) {
		int  num = a;
		int c = num;
		int rev=0;
		int reminder;
		
		while(num>0) {
			
			reminder = num % 10;
			rev=(rev*10)+reminder;
			num=num/10;
		}
		if(c==rev) {
			System.out.println("this is palindrom number");
		}else {
			System.out.println("this not palindrom no");
		}
	}
	
	public static void main(String[] args) {
		palindromn(121);
	}

}
