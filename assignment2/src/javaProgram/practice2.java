package javaProgram;

public class practice2 {
	
	public static void main(String[] args) {
		int marks = 45; 
		if (marks>=40) {
			if (marks>=50) {
				if (marks>=60) {
					if (marks>=66) {
						System.out.println("distincyion");
					}else {
						System.out.println("first class");
					}
				}else {
					System.out.println("second class");
				}	
			}else {
				System.out.println(" pass class");
			}
		}else {
			System.out.println("fail");
		}
	}

}
