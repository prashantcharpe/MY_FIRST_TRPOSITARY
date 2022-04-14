package pravinprcice;

public class SwapingTwoStringUsingThirdVeriable2 {

	public static void swaipingwiththirdVeriable() {

		String a = "prashant";
		String b = "pravin";
		String c;
		System.out.println(" before swiping a : " + a);
		System.out.println(" before swiping b : " + b);
		c = a;
		a = b;
		b=c;
		System.out.println(" after swiping a : " + a);
		System.out.println(" after swiping b: " + b);
	}
	

	public static void main(String[] args) {
		swaipingwiththirdVeriable();
	}
}
