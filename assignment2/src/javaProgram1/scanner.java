package javaProgram1;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("enter value ");
		
		int a = obj.nextInt();
		System.out.println(a);
		
		
		int b = obj.nextInt();
		int  sum = a+b;
		System.out.println(sum);
		
		String str2 = obj.nextLine();
		System.out.println(str2);
		
		String str3 = obj.nextLine();
		System.out.println(str3);
		obj.close();
	}
}
