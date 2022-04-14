package pravinprcice;

import java.util.Scanner;

public class factorialnumber {

	public static void main(String[] args) {

		int factorial1 = 1;
		int num =5;

		for (int i = 1; i <=num; i++) {
			factorial1 = factorial1 * i;
			System.out.println(factorial1);
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
			System.out.println(factorial);
		}
		
	}

}
