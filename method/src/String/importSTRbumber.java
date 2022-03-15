package String;

import java.util.Arrays;

public class importSTRbumber {
	
	
static String a[]= {" raju"," marvel"," stella"," akash"," gagan","pooja"," "};
	
	public static void main(String[] args) {
		
		m1();
		int index=3;
		
		for(int i=a.length-1; i>=index; i--) {  // 1st    i=6;       6>3,   i--
			a[i]=a[i-1];                          //a[6]= a[5]
		}
		a[index]="prashant";                  //a[2] = prashant ;
		
		/*for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}System.out.println();*/
		
		System.out.println(Arrays.toString(a));
	}
	
	
	public static void m1() {
		
		int a[]= {10,45,80,90,100,23,65,0};
		
		int index=4;
		
		for(int i=a.length-1; i>=index; i--) {
			a[i]=a[i-1];
		}
		a[index]=1000;
		
		a[1]=a[index];
		
		
		
		
		System.out.println(Arrays.toString(a));
		
		//for(int i=0; i<a.length; i++) {
		//	System.out.print(a[i]+" ");
		//}
		
	}
	

}
