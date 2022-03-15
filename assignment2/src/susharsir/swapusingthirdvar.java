package susharsir;

import java.util.Scanner;

public class swapusingthirdvar {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println(" enter value");
		
		int var= obj.nextInt();
		
		int var1=obj.nextInt();
		int par;
		
		System.out.println(" befor swping no = " +var+ " " +var1);
		
		par=var;
		var=var1;
		var1=par;
		System.out.println();
		System.out.println(" after swaping no = "+ var + " "+ var1);
	}
}
