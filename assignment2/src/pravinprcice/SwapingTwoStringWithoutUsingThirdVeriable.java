package pravinprcice;

public class SwapingTwoStringWithoutUsingThirdVeriable {


	public static void swaipingwithoutthirdVeriable() {

		String a = "prashant";
		String b = "pravin";
		System.out.println(" before swiping a : " + a);
		System.out.println(" before swiping b : " + b);
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(" after swiping a : " + a);
		System.out.println(" after swiping b : " + b);
		
	}

	public static void main(String[] args) {
		swaipingwithoutthirdVeriable();
	}
}
