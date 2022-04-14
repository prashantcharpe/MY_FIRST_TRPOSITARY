package pravinpractice2;

public class fibonaciseries {

	public static void fibonaciseries() {
		int a,c;
		int b=1; 
		int num=100;
		for(a=1; a<=num;) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	
	public static void main(String[] args) {
		fibonaciseries();
	}
}
