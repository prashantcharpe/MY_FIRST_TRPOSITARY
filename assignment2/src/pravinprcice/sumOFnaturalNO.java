package pravinprcice;

public class sumOFnaturalNO {
	
	public static void sumofNaturalno() {
		int a=3;
		
		int sum = a* (a+1)/2;	
	System.out.println("natural no :" + a + " um of natural no : " + sum);	
	}
	
	public static void sumofNaturalno1() {
		int a=3;
		int sum = 0;
		for(int i=1; i<=3; i++ )	{
			sum = sum +i;
		}		
	System.out.println("natural no :" + a + " um of natural no : " + sum);	
	
	}
	
	public static void sumofNaturalno2() {
		int i=1;
		int n=3;
		int sum = 0;
		while(i<=n) {
			sum = sum +i;
			i++;
		}		
	System.out.println("natural no :" + n + " um of natural no : " + sum);	
	
	}
	
	public static void main(String[] args) {
		sumofNaturalno();
		sumofNaturalno1();
		sumofNaturalno2();
	}

}
