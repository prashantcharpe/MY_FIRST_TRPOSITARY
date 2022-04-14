package pravinprcice;

public class fibonaciseries {

	public static void main(String[] args) {

		printfibonaci();
		printfibonaci1(100);
	
	}
	
	public static void printfibonaci() {
		int b=1;
		int c;
		for(int a=1; a<=100;) {
			System.out.println(a);
			c=b+a;
			a=b;
			b=c;
	}}
		
		public static void printfibonaci1(int n) {
			int b=1;
			int c;
			for(int a=1; a<=n;) {
				System.out.println(a);
				c=b+a;
				a=b;
				b=c;
		}
}
}
