package Exception;

import java.util.Scanner;

public class YoungerAgeException extends RuntimeException {

	public YoungerAgeException(String msg) {

		super(msg);
	}
}

class Voting {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println(" Enter your age");

		int age = s.nextInt();
		try {
			if (age < 18) { // this is youngerageexception create by programmer
							// " you are not eligible for voting" this is discription
				throw new YoungerAgeException(" you are not eligible for voting");
				            // System.out.println(" this statement is not working");

			} else {
				System.out.println("vote can succesfull");
			} 
		} catch (YoungerAgeException e) {
			e.printStackTrace();
		}
		System.out.println("program is workking");

	}
}
