package susharsir;

import java.util.Scanner;

public class palindromstring {

	public static void main(String[] args) {
		String a ="prashant";
		String rev="";
		
		for(int i=a.length()-1; i>=0; i--) {
			rev=rev+a.charAt(i);
			
		}if (rev.equals(a)){
			System.out.println(" this is palindrome = "+rev);
		}else {
			System.out.println(" this is not palindrome = "+rev);
		}
		System.out.println(rev);
		
		int n, r, c, s=0;  //s use for addition r remider variable 
		                   // n use for input value like 121
		                   // c use for save revers number 
		 
		System.out.println("Enter any number ");
		
		Scanner obj=new Scanner(System.in);
		n=obj.nextInt();
		c=n;
		while(n>0) {  //(121>0) condition ture
			
			r=n%10;     //121%10= 1 .  r value is 1(reminder), n = 12 is denominator 
			s=(s*10)+r;  //0*10= 0,    0+1=1,  s value is 1;
			n=n/10;      // 12/10 
		} if (c==s) {
			System.out.println(" this is palindrome no = "+ c);
		}else {
			System.out.println(" not palindrome no");
		}
	
		
	}
}
