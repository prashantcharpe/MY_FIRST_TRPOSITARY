package pravinpractice2;

import java.util.Arrays;

public class reverseNumber {
	
	public static void revno() {
	int num = 123456;
	int rev = 0;
	int reminder;
	
    while(num>0) {
	reminder = num%10;
	rev = (rev*10)+reminder;
	num=num/10;	
}
    System.out.println(rev);
}
	public static void revArrayno() {
		
		int num []= {1,2,3,4,5,6,7,8,9};
		
	for(int i=num.length-1; i>=0; i--) {
		System.out.print(num[i]+" ");
	}System.out.println();	
	}
	
	
public static void revArrayno1() {
		
		int num []= {1,-8,5,4,456,7,13,9};
		Arrays.sort(num);
	for(int i=num.length-1; i>=0; i--) {
		System.out.print(num[i]+" ");
	}System.out.println();	
	}
	
	
	public static void main(String[] args) {
		revno();
		revArrayno();
		revArrayno1();
	}

}
