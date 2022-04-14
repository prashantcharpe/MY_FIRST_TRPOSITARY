package starpattern;

public class pyramid2 {

	public static void startpattern() {

		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void number() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void number1() {

		for (int i = 1; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void number2() {
		int j;
		for (int i = 0; i <= 5; i++) {
			for (j = 5; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 5; k >= i; k--) {
				System.out.print(j);
			}System.out.println( );
		}
	}

	public static void main(String[] args) {

		// startpattern();
		// number();
		// number1();
		number2();

	}

}
